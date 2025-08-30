package com.project.projectN.calender.repository;

import com.project.projectN.calender.entity.CalendarDateInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CalendarDateInfoRepository extends JpaRepository<CalendarDateInfo,String> {
}