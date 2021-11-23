package feetarcestimation.service.utils;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import org.opencv.core.Mat;
import org.opencv.core.MatOfByte;
import org.springframework.scheduling.annotation.Async;

import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.io.IOException;
import java.util.Map;

public class Publish {
    private Map params = ObjectUtils.asMap(
            "overwrite", true,
            "resource_type", "image"
    );

    @Async
    public String publishToCloudinary(String image, String side, String name, String component) throws IOException {
        Cloudinary cloudinary = new Cloudinary();
        params.put("public_id", (side + "/" + component + "/" + name));
        try {
            Map result = cloudinary.uploader().upload(image, params);
            return (String) result.get("url");
        } catch (IOException e) {
            throw e;
        }
    }

}
