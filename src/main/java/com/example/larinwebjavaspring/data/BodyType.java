package com.example.larinwebjavaspring.data;

import jakarta.persistence.*;

@Entity
@Table(name = "body_type")
public class BodyType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bodyTypeId;

    @NotBlank(message = "Body type name is mandatory")
    private String bodyTypeName;

    // standard constructors / setters / getters / toString

}
