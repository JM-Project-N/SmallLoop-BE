package com.project.projectN.calender.entity;

import com.project.projectN.audit.Auditable;
import com.vladmihalcea.hibernate.type.json.JsonBinaryType;
import jakarta.persistence.*;
import org.hibernate.annotations.Type;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "ZP_CALENDAR_DATE_INFO")
public class CalendarDateInfo extends Auditable {

    @Id
    @Column(name = "CALENDAR_DATE_ID", length = 64)
    private String calendarDateId; // 스케줄 시간 ID

    @Column(name = "REPEAT_TYPE")
    private Integer repeatType; // 반복 타입

    @Column(name = "EXCLUDING_PUBLIC_HOLIDAYS")
    private Boolean excludingPublicHolidays; // 공휴일 포함 여부

    @Type(JsonBinaryType.class)
    @Column(name = "DAY_OF_MONTH", columnDefinition = "jsonb")
    private List<Integer> dayOfMonth; // 특정일

    @Type(JsonBinaryType.class)
    @Column(name = "WEEK_OF_MONTH", columnDefinition = "jsonb")
    private List<Integer> weekOfMonth; // 특정 주

    @Type(JsonBinaryType.class)
    @Column(name = "DAY_OF_WEEK", columnDefinition = "jsonb")
    private List<Integer> dayOfWeek; // 특정 요일

    @Column(name = "SCHEDULE_START")
    private LocalDateTime scheduleStart; // 일정 시작 날짜

    @Column(name = "SCHEDULE_END")
    private LocalDateTime scheduleEnd; // 일정 종료 날짜
}
