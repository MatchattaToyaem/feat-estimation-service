package feetarcestimation.service.models.Raw;

import javax.validation.constraints.NotNull;

public class Coordinate {
    @NotNull(message = "x cannot be null")
    private int x;
    @NotNull(message = "x cannot be null")
    private int y;

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
