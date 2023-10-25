package com.example.larinwebjavaspring.data;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "vehicle_model")
public class VehicleModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long vehicleModelId;

    @NotBlank(message = "Vehicle name is mandatory")
    private String vehicleName;

    @ManyToOne
    @JoinColumn(name = "vehicleBrandId")
    private VehicleBrand vehicleBrand;

    // standard constructors / setters / getters / toString

}
