package com.project.projectN.calender.repository;

import com.project.projectN.calender.entity.Calendar;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CalenderRepository extends JpaRepository<Calendar,String> {
}
