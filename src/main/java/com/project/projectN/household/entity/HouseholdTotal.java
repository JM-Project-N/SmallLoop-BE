package com.project.projectN.household.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "ZP_HOUSEHOLD_TOTAL")
public class HouseholdTotal {
    @Id
    @Column(name = "HOUSEHOLD_TOTAL_ID")
    private String householdTotalId;

    @Column(name = "PAY_TYPE_ID")
    private Integer payTypeId;

    @Column(name = "TEAM_ID")
    private String teamId;

    @Column(name = "TOTAL_AMOUNT")
    private Integer totalAmount;

    @Column(name = "UPDATE_DT")
    private LocalDateTime updateDt;
}