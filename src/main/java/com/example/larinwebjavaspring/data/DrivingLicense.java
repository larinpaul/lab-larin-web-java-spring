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

    @ManyToOne
    @JoinColumn(name = "vehicleOwnerId")
    private VehicleOwner vehicleOwner;

    // standard constructors / setters / getters / toString



}
