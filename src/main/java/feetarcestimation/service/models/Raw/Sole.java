package feetarcestimation.service.models.Raw;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public class Sole {
    @NotNull(message = "image cannot be null")
    private String image;
    @NotNull(message = "fore cannot be null")
    @Valid()
    private Fore fore;
    @NotNull(message = "metatarsalgia cannot be null")
    @Valid()
    private Metatarsalgia metatarsalgia;
    @NotNull(message = "middle cannot be null")
    @Valid()
    private Middle middle;
    @NotNull(message = "heel cannot be null")
    @Valid()
    private Heel heel;

    public Sole(String image, Fore fore, Metatarsalgia metatarsalgia, Middle middle, Heel heel) {
        this.image = image;
        this.fore = fore;
        this.metatarsalgia = metatarsalgia;
        this.middle = middle;
        this.heel = heel;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Fore getFore() {
        return fore;
    }

    public void setFore(Fore fore) {
        this.fore = fore;
    }

    public Metatarsalgia getMetatarsalgia() {
        return metatarsalgia;
    }

    public void setMetatarsalgia(Metatarsalgia metatarsalgia) {
        this.metatarsalgia = metatarsalgia;
    }

    public Middle getMiddle() {
        return middle;
    }

    public void setMiddle(Middle middle) {
        this.middle = middle;
    }

    public Heel getHeel() {
        return heel;
    }

    public void setHeel(Heel heel) {
        this.heel = heel;
    }
}
class Fore{
    @NotNull(message = "x cannot be null")
    private int x;
    @NotNull(message = "y cannot be null")
    private int y;
    Fore(int x, int y){
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

class Metatarsalgia{
    @NotNull(message = "x cannot be null")
    private int x;
    @NotNull(message = "y cannot be null")
    private int y;
    Metatarsalgia(int x, int y){
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

class Middle{
    @NotNull(message = "x cannot be null")
    private int x;
    @NotNull(message = "y cannot be null")
    private int y;
    Middle(int x, int y){
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

class Heel{
    @NotNull(message = "x cannot be null")
    private int x;
    @NotNull(message = "y cannot be null")
    private int y;
    Heel(int x, int y){
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

