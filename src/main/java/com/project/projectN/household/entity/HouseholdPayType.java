package com.project.projectN.household.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "ZP_HOUSEHOLD_PAY_TYPE")
public class HouseholdPayType {
    @Id
    @Column(name = "PAY_TYPE_ID")
    private Integer payTypeId;

    @Column(name = "TYPE_NAME")
    private Integer typeName;
}
