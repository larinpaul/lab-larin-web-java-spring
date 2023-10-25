package com.example.larinwebjavaspring.data;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "vehicle_brand")
public class VehicleBrand {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long vehicleBrandId;

    @NotBlank(message = "Brand name is mandatory")
    private String brandName;

    private String shortBrandName;

    @ManyToOne
    @JoinColumn(name = "countryId")
    private Country country;

    // standard constructors / setters / getters / toString


}
