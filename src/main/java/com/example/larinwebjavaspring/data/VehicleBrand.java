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

    public VehicleBrand() {
    }

    public VehicleBrand(String brandName, String shortBrandName, Country country) {
        this.brandName = brandName;
        this.shortBrandName = shortBrandName;
        this.country = country;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getShortBrandName() {
        return shortBrandName;
    }

    public void setShortBrandName(String shortBrandName) {
        this.shortBrandName = shortBrandName;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}
