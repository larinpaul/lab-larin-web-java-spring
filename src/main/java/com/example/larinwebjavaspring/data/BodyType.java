package com.example.larinwebjavaspring.data;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "body_type")
public class BodyType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bodyTypeId;

    @NotBlank(message = "Body type name is mandatory")
    private String bodyTypeName;

    public BodyType() {
    }

    public BodyType(String bodyTypeName) {
        this.bodyTypeName = bodyTypeName;
    }

    public String getBodyTypeName() {
        return bodyTypeName;
    }

    public void setBodyTypeName(String bodyTypeName) {
        this.bodyTypeName = bodyTypeName;
    }
}
