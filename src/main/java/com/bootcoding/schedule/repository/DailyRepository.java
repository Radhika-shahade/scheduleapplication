package com.bootcoding.schedule.repository;

import com.bootcoding.schedule.model.DailySchedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DailyRepository extends JpaRepository<DailySchedule,Integer> {

}
