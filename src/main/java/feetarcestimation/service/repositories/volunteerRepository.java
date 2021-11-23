package feetarcestimation.service.repositories;

import feetarcestimation.service.models.Volunteer;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface volunteerRepository extends MongoRepository<Volunteer, String> {
    public List<Volunteer> findAllByCollectorEmail(String collectorEmail);
    public List<Volunteer> findAllBy_id(String id);
}
