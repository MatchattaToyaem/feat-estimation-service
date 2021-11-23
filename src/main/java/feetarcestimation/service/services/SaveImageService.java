package feetarcestimation.service.services;

import feetarcestimation.service.config.ImageType;
import feetarcestimation.service.models.Raw.RawFootData;
import feetarcestimation.service.models.Raw.Side;
import feetarcestimation.service.models.Raw.Sole;
import feetarcestimation.service.utils.Base64ToStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.util.Base64;

@Service
public class SaveImageService {

    @Autowired
    public SaveImageService(){ }

    public RawFootData saveAllImages(String id, RawFootData rawFootData, String footSide) throws IOException {
        int i =0;
        for (Side side : rawFootData.getSides()) {
            side.setImage(saveToLocal(side.getImage(), id, "side", footSide, i));
            i++;
        }
        i = 0;
        for (Sole sole : rawFootData.getSoles()) {
            sole.setImage(saveToLocal(sole.getImage(), id, "sole", footSide, i));
            i++;
        }
        return rawFootData;
    }
    private String saveToLocal(String base64String, String id, String component, String side, int number) throws IOException {
        String[] base64Component = base64String.split(",");
        String imageType = checkImageType(base64Component[0]);
        String directory = "./foot_image/"+component+"/"+side+"/"+id;
        createDirectory(directory);
        String fileName = directory+"/"+number+"."+ imageType;
        File imageFile = new File(fileName);
        BufferedImage imageStream = new Base64ToStream().convertBase64ToStream(base64Component[1]);
        ImageIO.write(imageStream, imageType, imageFile);
        return fileName;
    }

    private void createDirectory(String path){
        File directory = new File(path);

        if(!directory.exists()){
            directory.mkdirs();
        }
    }


    private String checkImageType(String base64Header){
        ImageType imageType = new ImageType();
        return imageType.getImageType().get(base64Header);
    }
}
