package com.project.projectN.memo.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "ZP_MEMO")
public class Memo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // surrogate key

    @Column(name = "EMAIL")
    private String email;


    @Column(name = "TEAM_ID")
    private String teamId;


    @Column(name = "MEMO")
    private String memo;


    @Column(name = "INSERT_DT")
    private LocalDateTime insertDt;


    @Column(name = "UPDATE_DT")
    private LocalDateTime updateDt;
}