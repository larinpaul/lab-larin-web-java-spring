package com.example.larinwebjavaspring.data;

import jakarta.persistence.*;

@Entity
@Table(name = "vehicle_type")
public class VehicleType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long vehicleTypeId;

    @NotBlank(message = "Vehicle name is mandatory")
    private String vehicleName;

    // Standard constructors, setters, getters, toString

}
