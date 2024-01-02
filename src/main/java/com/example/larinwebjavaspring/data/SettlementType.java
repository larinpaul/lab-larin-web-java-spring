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

    public SettlementType() {
    }

    public SettlementType(String settlementTypeName) {
        this.settlementTypeName = settlementTypeName;
    }

    public String getSettlementTypeName() {
        return settlementTypeName;
    }

    public void setSettlementTypeName(String settlementTypeName) {
        this.settlementTypeName = settlementTypeName;
    }
}
