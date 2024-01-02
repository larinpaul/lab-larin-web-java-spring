package com.example.larinwebjavaspring.data;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

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

    public VehicleOwner() {
    }

    public VehicleOwner(String name, String patronym, LocalDate birthDate, String passportSeries, String passportNumber, LocalDate passportIssueDate) {
        this.name = name;
        this.patronym = patronym;
        this.birthDate = birthDate;
        this.passportSeries = passportSeries;
        this.passportNumber = passportNumber;
        this.passportIssueDate = passportIssueDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronym() {
        return patronym;
    }

    public void setPatronym(String patronym) {
        this.patronym = patronym;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getPassportSeries() {
        return passportSeries;
    }

    public void setPassportSeries(String passportSeries) {
        this.passportSeries = passportSeries;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public LocalDate getPassportIssueDate() {
        return passportIssueDate;
    }

    public void setPassportIssueDate(LocalDate passportIssueDate) {
        this.passportIssueDate = passportIssueDate;
    }
}
