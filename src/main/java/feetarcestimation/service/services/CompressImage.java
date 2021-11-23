package feetarcestimation.service.services;

import com.google.api.client.util.Base64;
import feetarcestimation.service.utils.Base64ToStream;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.Buffer;

public class CompressImage {

    public String compress(String image, String type) throws IOException {
        String[] base64Component = image.split(",");
        boolean rotateClockWise = false;
        BufferedImage buffer = new Base64ToStream().convertBase64ToStream(base64Component[1]);
        switch (type){
            case"sole": if(buffer.getHeight() < buffer.getWidth()){
                rotateClockWise = true;
            }
            break;
            case "side": if (buffer.getWidth() < buffer.getHeight()){
                rotateClockWise = true;
            }
            break;

        }
        int newHeight = buffer.getWidth() > buffer.getHeight() ? 900 : 1200;
        int newWidth = buffer.getWidth() > buffer.getHeight() ? 1200 : 900;
        Image resizeImage = buffer.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);
        BufferedImage img = convertToBufferedImage(resizeImage);
        if(rotateClockWise){
            img = rotateImage(img);
        }
        System.out.println(newWidth+" "+newHeight);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ImageIO.write(img, "jpeg", baos);
        byte[] bytes = baos.toByteArray();
        String base64 = new String(Base64.encodeBase64(bytes), "UTF-8");
        return base64Component[0]+","+base64;
    }

    private static BufferedImage convertToBufferedImage(Image img) {

        if (img instanceof BufferedImage) {
            return (BufferedImage) img;
        }

        // Create a buffered image with transparency
        BufferedImage bi = new BufferedImage(
                img.getWidth(null), img.getHeight(null),
                BufferedImage.TYPE_INT_RGB);

        Graphics2D graphics2D = bi.createGraphics();
        graphics2D.drawImage(img, 0, 0, null);
        graphics2D.dispose();

        return bi;
    }
    private BufferedImage rotateImage(BufferedImage image){
        final double rads = Math.toRadians(90);
        final double sin = Math.abs(Math.sin(rads));
        final double cos = Math.abs(Math.cos(rads));
        final int w = (int) Math.floor(image.getWidth() * cos + image.getHeight() * sin);
        final int h = (int) Math.floor(image.getHeight() * cos + image.getWidth() * sin);
        final BufferedImage rotatedImage = new BufferedImage(w, h, image.getType());
        final AffineTransform at = new AffineTransform();
        at.translate(w / 2, h / 2);
        at.rotate(rads,0, 0);
        at.translate(-image.getWidth() / 2, -image.getHeight() / 2);
        final AffineTransformOp rotateOp = new AffineTransformOp(at, AffineTransformOp.TYPE_BILINEAR);
        rotateOp.filter(image,rotatedImage);
        return  rotatedImage;
    }
}
