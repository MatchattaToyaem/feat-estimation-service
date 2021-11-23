package feetarcestimation.service.utils.validation;

import javax.validation.constraints.NotNull;

public class FootValidator {
    @NotNull()
    private Fore fore;
    @NotNull()
    private Metatarsalgia metatarsalgia;
    @NotNull()
    private Middle middle;
    @NotNull()
    private Heel heel;
    @NotNull()
    private AnkleSprain ankleSprain;
    @NotNull()
    private String soleImage;
    @NotNull()
    private String sideImage;
    @NotNull()
    private double footArc;
//    public FootValidator(Fore fore, Metatarsalgia metatarsalgia, Middle middle, Heel heel, AnkleSprain ankleSprain){
//        this.fore = fore;
//        this.metatarsalgia = metatarsalgia;
//        this.middle = middle;
//        this.heel = heel;
//        this.ankleSprain = ankleSprain;
//    }

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


    public double getFootArc() {
        return footArc;
    }

    public void setFootArc(double footArc) {
        this.footArc = footArc;
    }
}

class Fore{
    private int x;
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
    private int x;
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
    private int x;
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
    private int x;
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
class AnkleSprain{
    private int x;
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
