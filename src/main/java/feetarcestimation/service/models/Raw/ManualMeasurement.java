package feetarcestimation.service.models.Raw;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public class ManualMeasurement {
    @NotNull()
    @Valid()
    private ManualMeasurementComponent left;
    @NotNull()
    @Valid()
    private ManualMeasurementComponent right;

    public ManualMeasurement(ManualMeasurementComponent left, ManualMeasurementComponent right) {
        this.left = left;
        this.right = right;
    }

    public ManualMeasurementComponent getLeft() {
        return left;
    }

    public void setLeft(ManualMeasurementComponent left) {
        this.left = left;
    }

    public ManualMeasurementComponent getRight() {
        return right;
    }

    public void setRight(ManualMeasurementComponent right) {
        this.right = right;
    }
}


