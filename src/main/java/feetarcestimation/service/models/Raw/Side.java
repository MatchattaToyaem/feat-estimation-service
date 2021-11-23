package feetarcestimation.service.models.Raw;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public class Side {
    @NotNull(message = "image cannot be null")
    private String image;
    @NotNull(message = "ankleSprain cannot be null")
    @Valid()
    private AnkleSprain ankleSprain;

    public Side(String image, AnkleSprain ankleSprain) {
        this.image = image;
        this.ankleSprain = ankleSprain;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public AnkleSprain getAnkleSprain() {
        return ankleSprain;
    }

    public void setAnkleSprain(AnkleSprain ankleSprain) {
        this.ankleSprain = ankleSprain;
    }
}


class AnkleSprain{
    @NotNull(message = "x cannot be null")
    private int x;
    @NotNull(message = "y cannot be null")
    private int y;
    AnkleSprain(int x, int y){
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
