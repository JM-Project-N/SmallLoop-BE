package com.project.projectN.team.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "ZP_TEAM_INFO")
public class TeamInfo {
    @Id
    @Column(name = "TEAM_ID")
    private String teamId;

    @Column(name = "EMAIL")
    private String email;

    @Lob
    @Column(name = "IMAGE_URL")
    private byte[] imageUrl;

    @Column(name = "TEAM_NAME")
    private String teamName;

    @Lob
    @Column(name = "DESCRIPTION")
    private byte[] description;

    @Column(name = "INSERT_DT")
    private LocalDateTime insertDt;

    @Column(name = "INSERT_ID")
    private String insertId;

    @Column(name = "UPDATE_DT")
    private LocalDateTime updateDt;

    @Column(name = "UPDATE_ID")
    private String updateId;
}