package feetarcestimation.service.event;

import feetarcestimation.service.models.Raw.RawData;
import feetarcestimation.service.models.Raw.Volunteer;
import feetarcestimation.service.services.SaveImageService;
import feetarcestimation.service.services.SequenceGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListener;
import org.springframework.data.mongodb.core.mapping.event.BeforeConvertEvent;
import org.springframework.data.mongodb.core.mapping.event.BeforeSaveEvent;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class VolunteerListener extends AbstractMongoEventListener<Volunteer> {
    private SequenceGeneratorService sequenceGenerator;
    private SaveImageService saveImageService;

    @Autowired
    public VolunteerListener(SequenceGeneratorService sequenceGenerator, SaveImageService saveImageService) {
        this.sequenceGenerator = sequenceGenerator;
        this.saveImageService = saveImageService;
    }

    @Override
    public void onBeforeConvert(BeforeConvertEvent<Volunteer> event) {
        if (event.getSource().getId() < 1) {
            event.getSource().setId(sequenceGenerator.generateSequence(Volunteer.SEQUENCE_NAME));
        }

        RawData foot = event.getSource().getRawData();
        try {
            event.getSource().getRawData().setLeft(saveImageService.saveAllImages(Long.toString(event.getSource().getIdFromNSTDA()),
                    foot.getLeft(), "left"));
            event.getSource().getRawData().setRight(saveImageService.saveAllImages(Long.toString(event.getSource().getIdFromNSTDA()),
                    foot.getRight(), "right"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
