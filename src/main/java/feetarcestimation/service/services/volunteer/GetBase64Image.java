package feetarcestimation.service.services.volunteer;

import feetarcestimation.service.models.Raw.Side;
import feetarcestimation.service.models.Raw.Sole;
import feetarcestimation.service.models.Raw.Volunteer;
import feetarcestimation.service.services.GetImageService;

import java.util.List;

public class GetBase64Image {
    public List<Volunteer>convertPath(List<Volunteer> volunteers) throws Exception {
        GetImageService getImageService = new GetImageService();
        for (Volunteer volunteer : volunteers) {
            //Left
            int i =0;
            for (Sole sole : volunteer.getRawData().getLeft().getSoles()) {
                sole.setImage(getImageService.getBase64(sole.getImage()));
                i++;
            }
            for (Side side : volunteer.getRawData().getLeft().getSides()) {
                side.setImage(getImageService.getBase64(side.getImage()));
            }
            //Right
            for (Sole sole : volunteer.getRawData().getRight().getSoles()) {
                sole.setImage(getImageService.getBase64(sole.getImage()));
            }
            for (Side side : volunteer.getRawData().getRight().getSides()) {
                side.setImage(getImageService.getBase64(side.getImage()));
            }
        }
        return volunteers;
    }
}
