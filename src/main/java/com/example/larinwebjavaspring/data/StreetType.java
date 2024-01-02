package com.example.larinwebjavaspring.data;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "streety_type")
public class StreetType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long streetTypeId;

    @NotBlank(message = "Street type name is mandatory")
    private String streetTypeName;

    public StreetType() {
    }

    public StreetType(String streetTypeName) {
        this.streetTypeName = streetTypeName;
    }

    public String getStreetTypeName() {
        return streetTypeName;
    }

    public void setStreetTypeName(String streetTypeName) {
        this.streetTypeName = streetTypeName;
    }
}
