package com.bootcoding.schedule.controller;

import com.bootcoding.schedule.model.WeeklySchedule;
import com.bootcoding.schedule.service.WeeklyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/schedule")
public class WeeklyController {

    @Autowired
    private WeeklyService weeklyService;

    @PostMapping("/weekSchedule/{value}")
//    public List<WeeklySchedule> generateWeeklySchedule(@RequestParam("value") int value, @RequestParam("courseId") int id)
    public List<WeeklySchedule> generateWeeklySchedule(@PathVariable int value, @RequestBody WeeklySchedule weeklySchedule) {
        int courseId = weeklySchedule.getCourseId();
        return weeklyService.save(value, courseId);
    }
    @PostMapping("/weeklySchedule")
      public String  saveWeeklyData(@RequestBody WeeklySchedule weeklySchedule)
    {
        weeklyService.save(weeklySchedule);
        return "record inserted successfully";
    }

    //get by course id
    @GetMapping("/weekSchedule/{courseId}")
    public List<WeeklySchedule> getById(@PathVariable("courseId") int courseId) {
        return weeklyService.getWeeklySchedule(courseId);
    }


    //get by week number
    @GetMapping("/weeklySchedule/{id}")
    public Optional<WeeklySchedule> getWeeklyScheduleById(@PathVariable int id) {
        return weeklyService.getWeeklyData(id);
    }

    @DeleteMapping("/weeklySchedule{id}")
    public String delete(@PathVariable int id) {
        weeklyService.deleteBYId(id);
        return "record deleted";
    }

    // for updating weekly data
    @PutMapping("/updateWeeklySchedule/{id}")
    public Optional<WeeklySchedule> update(@PathVariable int id, @RequestBody WeeklySchedule weeklySchedule) {
        return weeklyService.updateData(id, weeklySchedule);
    }
}
