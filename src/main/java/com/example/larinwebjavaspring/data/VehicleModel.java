package com.example.larinwebjavaspring.data;

import jakarta.persistence.*;

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
