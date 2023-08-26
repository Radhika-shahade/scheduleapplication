package com.bootcoding.schedule.controller;

import com.bootcoding.schedule.model.DailySchedule;
import com.bootcoding.schedule.service.DailyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/schedule")
public class DailyScheduleController {

    @Autowired
    private DailyService scheduleService;

    @PostMapping("/dailySchedule")
    public String generateDailySchedule(@RequestBody DailySchedule dailySchedule)
    {
        scheduleService.saveData(dailySchedule);
        return "application is running";
    }


}
