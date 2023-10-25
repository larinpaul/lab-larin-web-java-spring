package com.example.larinwebjavaspring.data;

import jakarta.persistence.*;

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

    // standard constructors / setters / getters / toString

}
