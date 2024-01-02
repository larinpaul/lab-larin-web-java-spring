package com.example.larinwebjavaspring.data;

import jakarta.persistence.*;

@Entity
@Table(name = "address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long addressId;

    private Integer houseNumber;

    private Integer apartmentNumber;

    private Integer postalIndex;

    @ManyToOne
    @JoinColumn(name = "vehicleOwnerId")
    private VehicleOwner vehicleOwner;

    @ManyToOne
    @JoinColumn(name = "settlementId")
    private Settlement settlement;

    @ManyToOne
    @JoinColumn(name = "streetId")
    private Street street;

    public Address() {
    }

    public Address(Integer houseNumber, Integer apartmentNumber, Integer postalIndex, VehicleOwner vehicleOwner, Settlement settlement, Street street) {
        this.houseNumber = houseNumber;
        this.apartmentNumber = apartmentNumber;
        this.postalIndex = postalIndex;
        this.vehicleOwner = vehicleOwner;
        this.settlement = settlement;
        this.street = street;
    }

    public Integer getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(Integer houseNumber) {
        this.houseNumber = houseNumber;
    }

    public Integer getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(Integer apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public Integer getPostalIndex() {
        return postalIndex;
    }

    public void setPostalIndex(Integer postalIndex) {
        this.postalIndex = postalIndex;
    }

    public VehicleOwner getVehicleOwner() {
        return vehicleOwner;
    }

    public void setVehicleOwner(VehicleOwner vehicleOwner) {
        this.vehicleOwner = vehicleOwner;
    }

    public Settlement getSettlement() {
        return settlement;
    }

    public void setSettlement(Settlement settlement) {
        this.settlement = settlement;
    }

    public Street getStreet() {
        return street;
    }

    public void setStreet(Street street) {
        this.street = street;
    }

}
