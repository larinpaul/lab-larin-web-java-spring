package com.example.larinwebjavaspring.data;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "settlement_type")
public class SettlementType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long settlementTypeId;

    @NotBlank(message = "Settlement type name is mandatory")
    private String settlementTypeName;

    // standard constructors / setters / getters / toString

}
