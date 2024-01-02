package com.example.larinwebjavaspring.data;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "street")
public class Street {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long streetId;

    @NotBlank(message = "Street name is mandatory")
    private String streetName;

    @ManyToOne
    @JoinColumn(name = "streetTypeId")
    private StreetType streetType;

    public Street() {
    }

    public Street(String streetName, StreetType streetType) {
        this.streetName = streetName;
        this.streetType = streetType;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public StreetType getStreetType() {
        return streetType;
    }

    public void setStreetType(StreetType streetType) {
        this.streetType = streetType;
    }
}
