package com.bootcoding.schedule.repository;

import com.bootcoding.schedule.model.DailySchedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DailyRepository extends JpaRepository<DailySchedule,Integer> {
    List<DailySchedule> findByWeeklyScheduleId(int weekId);

}
