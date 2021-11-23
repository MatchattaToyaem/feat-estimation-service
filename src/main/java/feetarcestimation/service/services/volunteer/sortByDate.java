package feetarcestimation.service.services.volunteer;

import feetarcestimation.service.models.Raw.Volunteer;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class sortByDate {

    public List<Volunteer> sortVolunteerByDate(List volunteersList) {
        Comparator<Volunteer> compareByDate = Comparator.comparing(Volunteer::getCreated);
        Collections.sort(volunteersList, compareByDate);
        return volunteersList;
    }
}
