package feetarcestimation.service.controllers;

import com.cloudinary.utils.ObjectUtils;
import feetarcestimation.service.models.Volunteer;
import feetarcestimation.service.repositories.volunteerRepository;
import feetarcestimation.service.utils.Computing;
import feetarcestimation.service.utils.validation.PreVolunteer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/volunteers")
public class volunteerController {
    private final volunteerRepository repository;

    public volunteerController(volunteerRepository repository) {
        this.repository = repository;
    }

//    @GetMapping()
//    public ResponseEntity<Volunteer> getVolunteer(@RequestParam(required = false, defaultValue = "") String name) {
//        return ResponseEntity.ok(repository.findByName(name));
//    }

    @GetMapping("/all")
    public ResponseEntity<List<Volunteer>> getAllVolunteer(@RequestHeader("collector-email") String collectorEmail) {
        return ResponseEntity.ok(repository.findAllByCollectorEmail(collectorEmail));
    }

    @PostMapping()
    public ResponseEntity<?> createVolunteer(@Valid @RequestBody feetarcestimation.service.models.Raw.Volunteer volunteer) {
        Computing service = new Computing(volunteer);
//        if (repository.findByName(volunteer.getName()) != null) {
//            Map error = ObjectUtils.asMap("message", "This name already exist", "field", "name");
//            return ResponseEntity.status(422).body(error);
//        }
        try {
            repository.insert(service.TransformData());
            return ResponseEntity.status(HttpStatus.CREATED).build();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e);
            return ResponseEntity.status(500).body(e);
        }
    }

    @DeleteMapping()
    public ResponseEntity<?> deleteVolunteer(@RequestHeader("delete-id") String id) {
        if (! repository.findAllBy_id(id).isEmpty()) {
            repository.deleteById(id);
            return ResponseEntity.status(204).build();
        } else {
            Map error = ObjectUtils.asMap("message", "This name already exist", "field", "name");
            return ResponseEntity.status(422).body(error);
        }
    }

//    @PutMapping("/{name}")
//    public ResponseEntity<?> updateVolunteer(@PathVariable("name") String name, @Valid @RequestBody feetarcestimation.service.models.Raw.Volunteer volunteer) {
//        Computing service = new Computing(volunteer);
//        Volunteer oldVolunteer = repository.findByName(name);
//        if (oldVolunteer == null) {
//            Map error = ObjectUtils.asMap("message", "This name does not exist", "field", "name");
//            return ResponseEntity.status(422).body(error);
//        }
//        try {
//            Volunteer newVolunteer = service.TransformData();
//            oldVolunteer.setLeftFoot(newVolunteer.getLeftFoot());
//            oldVolunteer.setRightFoot(newVolunteer.getRightFoot());
//            repository.save(oldVolunteer);
//            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
//        } catch (Exception error) {
//            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(error);
//        }
//    }
}
