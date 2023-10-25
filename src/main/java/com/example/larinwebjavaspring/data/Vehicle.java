package com.example.larinwebjavaspring.data;

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

    // standard constructors / setters / getters / toString







}
