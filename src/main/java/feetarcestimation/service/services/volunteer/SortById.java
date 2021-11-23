package feetarcestimation.service.services.volunteer;

import feetarcestimation.service.models.Raw.Volunteer;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortById {
    public List<Volunteer> sortById(List volunteersList) {
        Comparator<Volunteer> compareByDate = Comparator.comparing(Volunteer::getId);
        Collections.sort(volunteersList, compareByDate);
        return volunteersList;
    }
}
