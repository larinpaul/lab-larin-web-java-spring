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

    // standard constructors / setters / getters / toString

}
