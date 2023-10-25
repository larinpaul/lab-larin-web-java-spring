package com.example.larinwebjavaspring.data;

import jakarta.persistence.*;

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

    // standard constructors / setters / getters / toString

}
