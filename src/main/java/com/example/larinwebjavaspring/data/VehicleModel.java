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

    public VehicleModel() {
    }

    public VehicleModel(String vehicleName, VehicleBrand vehicleBrand) {
        this.vehicleName = vehicleName;
        this.vehicleBrand = vehicleBrand;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public VehicleBrand getVehicleBrand() {
        return vehicleBrand;
    }

    public void setVehicleBrand(VehicleBrand vehicleBrand) {
        this.vehicleBrand = vehicleBrand;
    }
}
