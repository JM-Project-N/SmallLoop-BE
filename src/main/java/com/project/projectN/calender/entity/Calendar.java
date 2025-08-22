package com.project.projectN.calender.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "ZP_CALENDAR")
public class Calendar {
    @Id
    @Column(name = "CALENDER_ID")
    private String calenderId;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "TEAM_ID")
    private String teamId;

    @Column(name = "CALENDAR_DATE_ID")
    private String calendarDateId;

    @Column(name = "TITLE")
    private String title;

    @Lob
    @Column(name = "DESCRIPTION")
    private byte[] description;

    @Column(name = "PUBLIC")
    private Boolean isPublic;
}