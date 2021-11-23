package feetarcestimation.service.models;

import javax.validation.constraints.NotBlank;

public class Foot{

    private String soleImage;
    private String sideImage;
    private Double footLength;
    private Double heelToFore;
    private Double heelToMid;
    private Double heelToNose;
    private Double foreWidth;
    private Double midWidth;
    private Double heelWidth;
    private Double footHeight;

    public Foot(String soleImage, String sideImage, Double footLength, Double heelToFore, Double heelToMid, Double heelToNose, Double foreWidth, Double midWidth, Double heelWidth, Double footHeight){
        this.soleImage = soleImage;
        this.sideImage = sideImage;
        this.footLength = footLength;
        this.heelToFore = heelToFore;
        this.heelToMid = heelToMid;
        this.heelToNose = heelToNose;
        this.foreWidth = foreWidth;
        this.midWidth = midWidth;
        this.heelWidth = heelWidth;
        this.footHeight = footHeight;
    }

    public String getSoleImage() {
        return soleImage;
    }

    public void setSoleImage(String soleImage) {
        this.soleImage = soleImage;
    }

    public String getSideImage() {
        return sideImage;
    }

    public void setSideImage(String sideImage) {
        this.sideImage = sideImage;
    }

    public Double getFootLength() {
        return footLength;
    }

    public void setFootLength(Double footLength) {
        this.footLength = footLength;
    }

    public Double getHeelToFore() {
        return heelToFore;
    }

    public void setHeelToFore(Double heelToFore) {
        this.heelToFore = heelToFore;
    }

    public Double getHeelToMid() {
        return heelToMid;
    }

    public void setHeelToMid(Double heelToMid) {
        this.heelToMid = heelToMid;
    }

    public Double getHeelToNose() {
        return heelToNose;
    }

    public void setHeelToNose(Double heelToNose) {
        this.heelToNose = heelToNose;
    }

    public Double getForeWidth() {
        return foreWidth;
    }

    public void setForeWidth(Double foreWidth) {
        this.foreWidth = foreWidth;
    }

    public Double getMidWidth() {
        return midWidth;
    }

    public void setMidWidth(Double midWidth) {
        this.midWidth = midWidth;
    }

    public Double getHeelWidth() {
        return heelWidth;
    }

    public void setHeelWidth(Double heelWidth) {
        this.heelWidth = heelWidth;
    }

    public Double getFootHeight() {
        return footHeight;
    }

    public void setFootHeight(Double footHeight) {
        this.footHeight = footHeight;
    }
}
