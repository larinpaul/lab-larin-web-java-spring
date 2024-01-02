package com.example.larinwebjavaspring.data;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

import java.time.LocalDate;

@Entity
@Table(name = "driving_license")
public class DrivingLicense {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long drivingLicenseId;

    @NotBlank(message = "Series is mandatory")
    private String series;

    @NotBlank(message = "Number is mandatory")
    private Long number;

    @NotBlank(message = "IssuedBy is mandatory")
    private String issuedBy;

    private LocalDate issueDate;

    public DrivingLicense() {
    }

    public DrivingLicense(String series, Long number, String issuedBy, LocalDate issueDate, VehicleOwner vehicleOwner) {
        this.series = series;
        this.number = number;
        this.issuedBy = issuedBy;
        this.issueDate = issueDate;
        this.vehicleOwner = vehicleOwner;
    }

    @ManyToOne
    @JoinColumn(name = "vehicleOwnerId")
    private VehicleOwner vehicleOwner;

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public String getIssuedBy() {
        return issuedBy;
    }

    public void setIssuedBy(String issuedBy) {
        this.issuedBy = issuedBy;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    public VehicleOwner getVehicleOwner() {
        return vehicleOwner;
    }

    public void setVehicleOwner(VehicleOwner vehicleOwner) {
        this.vehicleOwner = vehicleOwner;
    }

}
