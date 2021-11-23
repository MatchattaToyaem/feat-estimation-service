package feetarcestimation.service.models.Raw;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

public class RawFootData {
    @NotNull(message = "soles cannot be null")
    @Valid()
    private List<Sole> soles;
    @NotNull(message = "sides cannot be null")
    @Valid()
    private List<Side> sides;

    RawFootData(List<Sole> soles, List<Side> sides) {
        this.soles = soles;
        this.sides = sides;
    }

    public List<Sole> getSoles() {
        return soles;
    }

    public void setSole(List<Sole> sole) {
        this.soles = sole;
    }

    public List<Side> getSides() {
        return sides;
    }

    public void setSide(List<Side> side) {
        this.sides = side;
    }
}
