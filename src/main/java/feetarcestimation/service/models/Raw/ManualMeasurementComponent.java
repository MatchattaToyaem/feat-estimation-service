package feetarcestimation.service.models.Raw;

import javax.validation.constraints.NotNull;

public class ManualMeasurementComponent {
    @NotNull(message = "footArchHeight cannot be null")
    private double footArchHeight;
    @NotNull(message = "foreWidth cannot be null")
    private double foreWidth;
    @NotNull(message = "heelToFore cannot be null")
    private double heelToFore;
    @NotNull(message = "heelToMetatarsalgia cannot be null")
    private double heelToMetatarsalgia;
    @NotNull(message = "heelToMiddle cannot be null")
    private double heelToMiddle;
    @NotNull(message = "heelWidth cannot be null")
    private double heelWidth;
    @NotNull(message = "middleWidth cannot be null")
    private double middleWidth;

    ManualMeasurementComponent(double footArchHeight, double foreWidth, double heelToFore, double heelToMetatarsalgia, double heelToMiddle, double heelWidth, double middleWidth) {
        this.footArchHeight = footArchHeight;
        this.foreWidth = foreWidth;
        this.heelToFore = heelToFore;
        this.heelToMetatarsalgia = heelToMetatarsalgia;
        this.heelToMiddle = heelToMiddle;
        this.heelWidth = heelWidth;
        this.middleWidth = middleWidth;
    }

    public double getFootArchHeight() {
        return footArchHeight;
    }

    public void setFootArchHeight(double footArchHeight) {
        this.footArchHeight = footArchHeight;
    }

    public double getForeWidth() {
        return foreWidth;
    }

    public void setForeWidth(double foreWidth) {
        this.foreWidth = foreWidth;
    }

    public double getHeelToFore() {
        return heelToFore;
    }

    public void setHeelToFore(double heelToFore) {
        this.heelToFore = heelToFore;
    }

    public double getHeelToMetatarsalgia() {
        return heelToMetatarsalgia;
    }

    public void setHeelToMetatarsalgia(double heelToMetatarsalgia) {
        this.heelToMetatarsalgia = heelToMetatarsalgia;
    }

    public double getHeelToMiddle() {
        return heelToMiddle;
    }

    public void setHeelToMiddle(double heelToMiddle) {
        this.heelToMiddle = heelToMiddle;
    }

    public double getHeelWidth() {
        return heelWidth;
    }

    public void setHeelWidth(double heelWidth) {
        this.heelWidth = heelWidth;
    }

    public double getMiddleWidth() {
        return middleWidth;
    }

    public void setMiddleWidth(double middleWidth) {
        this.middleWidth = middleWidth;
    }
}
