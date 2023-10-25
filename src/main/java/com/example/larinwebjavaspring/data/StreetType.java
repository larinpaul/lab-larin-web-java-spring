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

    // standard constructors / setters / getters / toString


}
