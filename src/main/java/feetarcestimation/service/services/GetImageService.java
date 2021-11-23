package feetarcestimation.service.services;

import com.google.api.client.util.Base64;
import feetarcestimation.service.config.ImageType;
import org.apache.tomcat.util.http.fileupload.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileInputStream;

@Service
public class GetImageService {

    @Autowired
    public GetImageService(){
    }

    public String getBase64(String imageName) throws Exception {
        File fileImage = new File(imageName);
        String type = imageName.split("\\.")[2];
        return encodeFileToBase64Binary(fileImage, type);
    }
    private static String encodeFileToBase64Binary(File file, String type) throws Exception{
        FileInputStream fileInputStreamReader = new FileInputStream(file);
        byte[] bytes = new byte[(int)file.length()];
        fileInputStreamReader.read(bytes);
        String base64Header = "";
        switch (type){
            case "jpg": base64Header = "data:image/jpeg;base64";
            break;
            case "png": base64Header = "data:image/png;base64";
            break;
        }
        String base64 = new String(Base64.encodeBase64(bytes), "UTF-8");
        return base64Header+","+base64;
    }
}
