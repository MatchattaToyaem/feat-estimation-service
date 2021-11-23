package feetarcestimation.service.models.Raw;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Date;

public class Volunteer {
    @Transient
    public static final String SEQUENCE_NAME = "users_sequence";
    @Id
    private long id;
    @NotNull(message = "Field collectorEmail cannot be null")
    private long idFromNSTDA;
    @NotNull(message = "Field collectorEmail cannot be null")
    private String collectorEmail;
    @NotNull(message = "Field gender cannot be null")
    private String gender;
    @NotNull(message = "Field shoeSize cannot be null")
    private Double shoeSize;
    @NotNull(message = "Field manualMeasurement cannot be null")
    @Valid()
    private ManualMeasurement manualMeasurement;
    @NotNull(message = "Field rawData cannot be null")
    @Valid()
    private RawData rawData;
    @CreatedDate
    private Date created;


    public Volunteer(long id, long idFromNSTDA, @NotNull(message = "Field collectorEmail cannot be null") String collectorEmail, String gender, Double shoeSize, ManualMeasurement manualMeasurement, RawData rawData){
        this.id = id;
        this.idFromNSTDA = idFromNSTDA;
        this.collectorEmail = collectorEmail;
        this.gender = gender;
        this.shoeSize = shoeSize;
        this.manualMeasurement = manualMeasurement;
        this.rawData = rawData;
        created = new Date();
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

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Double getShoeSize() {
        return shoeSize;
    }

    public void setShoeSize(Double shoeSize) {
        this.shoeSize = shoeSize;
    }

    public ManualMeasurement getManualMeasurement() {
        return manualMeasurement;
    }

    public void setManualMeasurement(ManualMeasurement manualMeasurement) {
        this.manualMeasurement = manualMeasurement;
    }

    public RawData getRawData() {
        return rawData;
    }

    public void setRawData(RawData rawData) {
        this.rawData = rawData;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getIdFromNSTDA() {
        return idFromNSTDA;
    }

    public void setIdFromNSTDA(long idFromNSTDA) {
        this.idFromNSTDA = idFromNSTDA;
    }
}

