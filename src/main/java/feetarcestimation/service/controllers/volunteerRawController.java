package feetarcestimation.service.controllers;

import com.cloudinary.utils.ObjectUtils;
import feetarcestimation.service.models.Raw.CompressImageResponse;
import feetarcestimation.service.models.Raw.CompressImageData;
import feetarcestimation.service.models.Raw.Volunteer;
import feetarcestimation.service.repositories.rawVolunteerRepository;
import feetarcestimation.service.services.CompressImage;
import feetarcestimation.service.services.volunteer.GetBase64Image;
import feetarcestimation.service.services.volunteer.SortById;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/raw_volunteers")
public class volunteerRawController {
    private final rawVolunteerRepository repository;

    public volunteerRawController(rawVolunteerRepository repository) {
        this.repository = repository;
    }

    @GetMapping()
    public ResponseEntity<List<Volunteer>> getAllVolunteer(@RequestHeader("collector-email") String collectorEmail) throws Exception {
        SortById sort = new SortById();
        GetBase64Image getBase64Image = new GetBase64Image();
        List<Volunteer> sortedVolunteersList = sort.sortById(getBase64Image.
                convertPath(repository.findAllByCollectorEmail(collectorEmail)));
        return ResponseEntity.ok(sortedVolunteersList);
    }

    @DeleteMapping()
    public  ResponseEntity<?> deleteVolunteer(@RequestHeader("delete-id") String deleteID){
        long deleteId = Long.parseLong(deleteID);
        try {
            if (!repository.findAllById(deleteId).isEmpty()) {
                repository.deleteById(deleteId);
                return ResponseEntity.status(204).build();
            } else {
                Map error = ObjectUtils.asMap("message", "This name does not exist", "field", "id");
                return ResponseEntity.status(422).body(error);
            }
        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println(e);
            return ResponseEntity.status(500).body(e);
        }
    }

    @PutMapping()
    public  ResponseEntity<?> updateVolunteer(@Valid @RequestBody Volunteer volunteer){
        try {
            if (!repository.findAllById(volunteer.getId()).isEmpty()) {
                repository.save(volunteer);
                return ResponseEntity.status(204).build();
            } else {
                Map error = ObjectUtils.asMap("message", "This name does not exist", "field", "id");
                return ResponseEntity.status(422).body(error);
            }
        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println(e);
            return ResponseEntity.status(500).body(e);
        }
    }

    @PostMapping()
    public ResponseEntity<?> createVolunteer(@Valid @RequestBody Volunteer volunteer) {
        try {
            repository.insert(volunteer);
            return ResponseEntity.status(HttpStatus.CREATED).build();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e);
            return ResponseEntity.status(500).body(e);
        }
    }

    @PostMapping("/compress")
    @ResponseBody
    public CompressImageResponse compressImage(@RequestBody CompressImageData request) throws IOException {
        return new CompressImageResponse(new CompressImage().compress(request.getImage(), request.getType()));
    }
}