package com.project.projectN.calender.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "ZP_CALENDAR")
public class Calendar {

    @Id
    @Column(name = "CALENDER_ID", length = 64)
    private String calenderId; // 스케줄 ID

    @Column(name = "EMAIL", length = 64)
    private String email; // 이메일

    @Column(name = "TEAM_ID", length = 64)
    private String teamId; // 팀 ID

    @Column(name = "CALENDAR_DATE_ID", length = 64)
    private String calendarDateId; // 스케줄 시간 ID

    @Column(name = "TITLE", length = 64)
    private String title; // 제목

    @Column(name = "DESCRIPTION", columnDefinition = "BLOB")
    private String description; // 설명

    @Column(name = "PUBLIC")
    private Boolean isPublic; // 공개여부
}