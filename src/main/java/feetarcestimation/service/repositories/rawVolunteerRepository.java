package feetarcestimation.service.repositories;

import feetarcestimation.service.models.Raw.Volunteer;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface rawVolunteerRepository extends MongoRepository<Volunteer, String> {
    List<Volunteer> findAllByCollectorEmail(String s);
    List<Volunteer> findAllById(long id);
    void deleteById(long id);
}
