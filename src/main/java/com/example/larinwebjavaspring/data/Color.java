package com.example.larinwebjavaspring.data;

import jakarta.persistence.*;

@Entity
@Table(name = "color")
public class Color {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long colorId;

    @NotBlank(message = "Color name is mandatory")
    private String colorName;

    // standards constructors / setters / getters / toString

}
