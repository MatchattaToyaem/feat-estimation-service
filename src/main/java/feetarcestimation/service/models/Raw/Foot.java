package feetarcestimation.service.models.Raw;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public class Foot {
    @NotNull(message = "Fore cannot be null")
    @Valid()
    private Fore fore;
    @NotNull(message = "Fore cannot be null")
    @Valid()
    private Metatarsalgia metatarsalgia;
    @NotNull(message = "Fore cannot be null")
    @Valid()
    private Middle middle;
    @NotNull(message = "Fore cannot be null")
    @Valid()
    private Heel heel;
    @NotNull(message = "Fore cannot be null")
    @Valid()
    private AnkleSprain ankleSprain;
    @NotNull()
    private String soleImage;
    @NotNull()
    private String sideImage;

    public Foot(Fore fore, Metatarsalgia metatarsalgia, Middle middle, Heel heel, AnkleSprain ankleSprain){
        this.fore = fore;
        this.metatarsalgia = metatarsalgia;
        this.middle = middle;
        this.heel = heel;
        this.ankleSprain = ankleSprain;
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

    public AnkleSprain getAnkleSprain() {
        return ankleSprain;
    }

    public void setAnkleSprain(AnkleSprain ankleSprain) {
        this.ankleSprain = ankleSprain;
    }

    public String getSideImage() {
        return sideImage;
    }

    public void setSideImage(String sideImage) {
        this.sideImage = sideImage;
    }

    public String getSoleImage() {
        return soleImage;
    }

    public void setSoleImage(String soleImage) {
        this.soleImage = soleImage;
    }
}
