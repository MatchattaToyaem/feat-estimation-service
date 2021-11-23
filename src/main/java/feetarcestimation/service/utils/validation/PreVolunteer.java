package feetarcestimation.service.utils.validation;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public class PreVolunteer {
    @NotNull(message = "Field name cannot be null")
    private String name;
    @NotNull(message = "Field collectorEmail cannot be null")
    private String collectorEmail;
    @NotNull(message = "Field gender cannot be null")
    private String gender;
    @NotNull()
    @Valid()
    private FootValidator leftFoot1;
    @NotNull()
    @Valid()
    private FootValidator rightFoot1;
    @NotNull()
    @Valid()
    private FootValidator leftFoot2;
    @NotNull()
    @Valid()
    private FootValidator rightFoot2;
    @NotNull()
    private double shoeSize;

    public PreVolunteer(String name, String gender, FootValidator leftFoot1, FootValidator rightFoot1, FootValidator leftFoot2, FootValidator rightFoot2, double shoeSize){
        this.name = name;
        this.gender = gender;
        this.leftFoot1 = leftFoot1;
        this.rightFoot1 = rightFoot1;
        this.leftFoot2 = leftFoot2;
        this.rightFoot2 = rightFoot2;
        this.shoeSize = shoeSize;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FootValidator getLeft1() {
        return leftFoot1;
    }

    public void setLeft1(FootValidator left) {
        this.leftFoot1 = left;
    }

    public FootValidator getRight1() {
        return rightFoot1;
    }

    public void setRight1(FootValidator right) {
        this.rightFoot1 = right;
    }

    public FootValidator getLeft2() {
        return leftFoot2;
    }

    public void setLeft2(FootValidator left) {
        this.leftFoot2 = left;
    }

    public FootValidator getRight2() {
        return rightFoot2;
    }

    public void setRight2(FootValidator right) {
        this.rightFoot2 = right;
    }

    public double getShoeSize() {
        return shoeSize;
    }

    public void setShoeSize(double shoeSize) {
        this.shoeSize = shoeSize;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCollectorEmail() {
        return collectorEmail;
    }

    public void setCollectorEmail(String collectorEmail) {
        this.collectorEmail = collectorEmail;
    }
}
