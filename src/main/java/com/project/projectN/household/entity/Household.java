package com.project.projectN.household.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "ZP_HOUSEHOLD")
public class Household {
    @Id
    @Column(name = "HOUSEHOLD_ID")
    private String householdId;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "TEAM_ID")
    private String teamId;

    @Column(name = "PAY_TYPE_ID")
    private Integer payTypeId;

    @Column(name = "TITLE")
    private Integer title;

    @Column(name = "DISCRIPTION")
    private Double discription;

    @Column(name = "AMOUNT")
    private Integer amount;

    @Column(name = "PAY_DT")
    private LocalDateTime payDt;

    @Column(name = "INSERT_DT")
    private LocalDateTime insertDt;

    @Column(name = "INSERT_ID")
    private String insertId;

    @Column(name = "UPDATE_DT")
    private LocalDateTime updateDt;

    @Column(name = "UPDATE_ID")
    private String updateId;
}