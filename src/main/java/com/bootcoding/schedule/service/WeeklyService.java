package com.bootcoding.schedule.service;

import com.bootcoding.schedule.model.WeeklySchedule;
import com.bootcoding.schedule.repository.WeeklyRepository;
import com.bootcoding.schedule.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class WeeklyService {
    @Autowired
    private WeeklyRepository weeklyRepository;

    public List<WeeklySchedule> save(int value,int courseId) {
        List <WeeklySchedule>list=new ArrayList<>();

        for (int i = 0; i < value; i++) {
            WeeklySchedule weeklySchedule = WeeklySchedule.builder()
                    .courseId(courseId)
                    .weekNumber(i+1)
                    .title(CourseTitle.courseTitle())
                    .description("The Java Programming Fundamentals course ")
                    .level(Level.getLevel())
                    .difficulty(Difficulty.getDifficultyType())
                    .courseCategory("Programming")
                    .active(Active.activityStatus())
                    .createDate(DateGenerator.createDate())
                    .createBY("bootcoding")
                    .modifiedDate(DateGenerator.modifiedDate())
                    .modifiedBy(ModifiedBy.name())
                    .build();
            list.add(weeklySchedule);

        }
        weeklyRepository.saveAll(list);
        return list;
    }

    public Optional<WeeklySchedule> getWeeklyData(int id) {
        return weeklyRepository.findById(id);
    }
    public List<WeeklySchedule> getData()
    {
        return weeklyRepository.findAll();
    }

    public void deleteBYId(int id)
    {
        weeklyRepository.deleteById(id);
    }

    public


}
