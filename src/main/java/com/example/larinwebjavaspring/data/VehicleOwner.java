package com.example.larinwebjavaspring.data;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "vehicle_owner")
public class VehicleOwner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long vehicleOwnerId;

    @NotBlank(message = "Surname is mandatory")
    private String name;

    private String patronym;

    private LocalDate birthDate;

    @NotBlank(message = "Passport series is mandatory")
    private String passportSeries;

    @NotBlank(message = "Passport number is mandatory")
    private String passportNumber;

    private LocalDate passportIssueDate;

    // standard constructors / setters / getters / toString


}
