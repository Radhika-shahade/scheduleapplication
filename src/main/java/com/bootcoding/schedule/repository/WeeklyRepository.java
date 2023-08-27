package com.bootcoding.schedule.repository;

import com.bootcoding.schedule.model.WeeklySchedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
//@EnableJpaRepositories
public interface WeeklyRepository extends JpaRepository<WeeklySchedule,Integer> {
    List<WeeklySchedule> findByCourseId(int courseId);
    List<WeeklySchedule> findByDifficultyAndLevel(String difficulty, int level);
    // select * from table where id = 1;
    // select * from table where course_id = 3 and active = true

//    @Query("select * from weekly_schedule ws where ws.course_id= :id")
//    List<WeeklySchedule> getWeeklyData(int id);
}
