package com.example.larinwebjavaspring.data;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "settlement")
public class Settlement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long settlementId;

    @NotBlank(message = "Settlement name is mandatory")
    private String setllementName;

    @ManyToOne
    @JoinColumn(name = "settlementTypeId")
    private SettlementType settlementType;

    public Settlement() {
    }

    public Settlement(String setllementName, SettlementType settlementType) {
        this.setllementName = setllementName;
        this.settlementType = settlementType;
    }

    public String getSetllementName() {
        return setllementName;
    }

    public void setSetllementName(String setllementName) {
        this.setllementName = setllementName;
    }

    public SettlementType getSettlementType() {
        return settlementType;
    }

    public void setSettlementType(SettlementType settlementType) {
        this.settlementType = settlementType;
    }
}
