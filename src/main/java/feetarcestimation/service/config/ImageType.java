package feetarcestimation.service.config;

import java.util.HashMap;
import java.util.Map;

public class ImageType {
    protected Map<String, String> imageType = new HashMap<String, String>() {{
        put("data:image/jpeg;base64", "jpg");
        put("data:image/png;base64", "png");
    }};
    public Map<String, String> getImageType(){
        return imageType;
    }
}
