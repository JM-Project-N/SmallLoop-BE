package com.project.projectN.calender.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "ZP_CALENDAR_DATE_INFO")
public class CalendarDateInfo {
    @Id
    @Column(name = "CALENDAR_DATE_ID")
    private String calendarDateId;

    @Column(name = "CALENDER_ID")
    private String calenderId;

    @Column(name = "REPEAT_TYPE")
    private Integer repeatType;

    @Column(name = "EXCLUDING_PUBLIC_HOLIDAYS")
    private Boolean excludingPublicHolidays;

    @Column(name = "DAY_OF_MONTH", columnDefinition = "json")
    private String dayOfMonth;

    @Column(name = "WEEK_OF_MONTH", columnDefinition = "json")
    private String weekOfMonth;

    @Column(name = "DAY_OF_WEEK", columnDefinition = "json")
    private String dayOfWeek;

    @Column(name = "SCHEDULE_START")
    private LocalDateTime scheduleStart;

    @Column(name = "SCHEDULE_END")
    private LocalDateTime scheduleEnd;

    @Column(name = "INSERT_DT")
    private LocalDateTime insertDt;

    @Column(name = "INSERT_ID")
    private String insertId;

    @Column(name = "UPDATE_DT")
    private LocalDateTime updateDt;

    @Column(name = "UPDATE_ID")
    private String updateId;
}
