package com.project.projectN.team.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "ZP_MEMBER_TEAM_JOIN")
public class MemberTeamJoin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // surrogate key

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "TEAM_ID")
    private String teamId;

    @Column(name = "ROLE_ID")
    private Integer roleId;

    @Column(name = "REG_DT")
    private LocalDateTime regDt;

    @Column(name = "INSERT_ID")
    private String insertId;

    @Column(name = "UPDATE_DT")
    private LocalDateTime updateDt;

    @Column(name = "UPDATE_ID")
    private String updateId;
}
