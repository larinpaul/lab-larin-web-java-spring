package com.example.larinwebjavaspring.data;

import jakarta.persistence.*;

@Entity
@Table(name = "vehicle")
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long vehicleId;

    private Integer yearOfManufacture;

    @NotBlank(message = "Engine number is mandatory")
    private String engineNumber;

    @ManyToOne
    @JoinColumn(name = "vehicleTypeId")
    private VehicleType vehicleType;

    @ManyToOne
    @JoinColumn(name = "modelId")
    private VehicleModel vehicleModel;

    @ManyToOne
    @JoinColumn(name = "colorId")
    private Color color;

    // perhaps, re-generate standard constructors / setters / getters / toString

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleId=" + vehicleId +
                ", yearOfManufacture=" + yearOfManufacture +
                ", engineNumber='" + engineNumber + '\'' +
                ", vehicleType=" + vehicleType +
                ", vehicleModel=" + vehicleModel +
                ", color=" + color +
                '}';
    }

    public Long getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Long vehicleId) {
        this.vehicleId = vehicleId;
    }

    public Integer getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(Integer yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getEngineNumber() {
        return engineNumber;
    }

    public void setEngineNumber(String engineNumber) {
        this.engineNumber = engineNumber;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public VehicleModel getVehicleModel() {
        return vehicleModel;
    }

    public void setVehicleModel(VehicleModel vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Vehicle(Long vehicleId, Integer yearOfManufacture, String engineNumber, VehicleType vehicleType, VehicleModel vehicleModel, Color color) {
        this.vehicleId = vehicleId;
        this.yearOfManufacture = yearOfManufacture;
        this.engineNumber = engineNumber;
        this.vehicleType = vehicleType;
        this.vehicleModel = vehicleModel;
        this.color = color;
    }
}
