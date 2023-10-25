package com.example.larinwebjavaspring.data;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "registration")
public class Registration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long registrationId;

    @NotBlank(message = "Number is mandatory")
    private String number;

    private LocalDate date;

    @ManyToOne
    @JoinColumn(name = "vehicleId")
    private Vehicle vehicle;

    @ManyToOne
    @JoinColumn(name = "ownerId")
    private VehicleOwner owner;

    // perhaps, re-generate standard constructors / setters / getters / toString

    public Registration(Long registrationId, String number, LocalDate date, Vehicle vehicle, VehicleOwner owner) {
        this.registrationId = registrationId;
        this.number = number;
        this.date = date;
        this.vehicle = vehicle;
        this.owner = owner;
    }

    public Long getRegistrationId() {
        return registrationId;
    }

    public void setRegistrationId(Long registrationId) {
        this.registrationId = registrationId;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public VehicleOwner getOwner() {
        return owner;
    }

    public void setOwner(VehicleOwner owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Registration{" +
                "registrationId=" + registrationId +
                ", number='" + number + '\'' +
                ", date=" + date +
                ", vehicle=" + vehicle +
                ", owner=" + owner +
                '}';
    }

}
