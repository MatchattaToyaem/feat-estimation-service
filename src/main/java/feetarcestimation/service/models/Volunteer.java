package feetarcestimation.service.models;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document
public class Volunteer {
    @Id
    private String _id;
    private String collectorEmail;
    private String gender;
    private Foot leftFoot1;
    private Foot rightFoot1;
    private Foot leftFoot2;
    private Foot rightFoot2;
    private feetarcestimation.service.models.Raw.Volunteer rawData;
    @CreatedDate
    private Date created;

    public Volunteer() {
        this.created = new Date();
    }

    public Foot getLeftFoot() {
        return leftFoot1;
    }

    public Foot getRightFoot() {
        return rightFoot1;
    }

    public Date getCreated() {
        return created;
    }

    public String getGender() {
        return gender;
    }

    public void setLeftFoot1(Foot leftFoot) {
        this.leftFoot1 = leftFoot;
    }

    public void setRightFoot1(Foot rightFoot) {
        this.rightFoot1 = rightFoot;
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

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public Foot getLeftFoot2() {
        return leftFoot2;
    }

    public void setLeftFoot2(Foot leftFoot2) {
        this.leftFoot2 = leftFoot2;
    }

    public Foot getRightFoot2() {
        return rightFoot2;
    }

    public void setRightFoot2(Foot rightFoot2) {
        this.rightFoot2 = rightFoot2;
    }

    public feetarcestimation.service.models.Raw.Volunteer getRawData() {
        return rawData;
    }

    public void setRawData(feetarcestimation.service.models.Raw.Volunteer rawData) {
        this.rawData = rawData;
    }
}

