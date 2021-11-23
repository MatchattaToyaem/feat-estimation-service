package feetarcestimation.service.controllers;
import com.cloudinary.utils.ObjectUtils;
import feetarcestimation.service.utils.Computing;
import feetarcestimation.service.utils.validation.PreVolunteer;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping(value = "/ping")
public class ping {
//    @RequestMapping(value = "/ping", method = RequestMethod.GET)
//    public ArrayList<String> getPing(){
//        return new ArrayList<>(Arrays.asList("Hell", "World"));
//    }

    @PostMapping()
    public ResponseEntity<?> tryPost() {
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
