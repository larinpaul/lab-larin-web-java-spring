package com.example.larinwebjavaspring.data;

import jakarta.persistence.*;

@Entity
@Table(name = "country")
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long countryId;

    @NotBlank(message = "Country name is mandatory")
    private String countryName;

    private String countryAbbreviation;

    // standard constructors / setters / getters / toString

}
