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
    @PostMapping("/week_schedule")
    public String generateWeeklySchedule(@RequestParam("value") int value, @RequestParam("courseId") int id)
    {
       weeklyService.save(value, id);
       return "true" ;
    }
    @GetMapping("/week/{id}")
    public Optional<WeeklySchedule> getById(@PathVariable int id)
    {
        return weeklyService.getWeeklyData(id);
    }
    @GetMapping("/weeklySchedule")
    public List<WeeklySchedule>getAll()
    {
        return weeklyService.getData();
    }

    @DeleteMapping("/weeklySchedule{id}")
    public String delete(@PathVariable int id)
    {
        weeklyService.deleteBYId(id);
        return "record deleted";
    }
 @PutMapping("/{id}")
    public WeeklySchedule update(@PathVariable int id, @RequestBody WeeklySchedule weeklySchedule)
 {

 }



}
