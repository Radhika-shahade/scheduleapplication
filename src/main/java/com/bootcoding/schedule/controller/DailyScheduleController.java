package com.bootcoding.schedule.controller;

//import com.bootcoding.schedule.model.DailySchedule;
//import com.bootcoding.schedule.service.DailyService;

import com.bootcoding.schedule.model.DailySchedule;
import com.bootcoding.schedule.service.DailyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/schedule")
public class DailyScheduleController {

    @Autowired
    private DailyService dailyService;

    //to generate random data
    @PostMapping("/dailySchedule/{week}/{value}")
    public List<DailySchedule> generateDailySchedule(@PathVariable("week") int weekId, @PathVariable int value ) {
        return dailyService.saveData(weekId, value);
    }

    @PostMapping("/dailySchedule")
    public DailySchedule insertData(@RequestBody DailySchedule dailySchedule)
    {
        return dailyService.save(dailySchedule);
    }


    //get daily  details according to week id
    @GetMapping("/week/{weekId}")
    public List<DailySchedule> getDailySchedulesByWeekId(@PathVariable int weekId) {
        return dailyService.findByWeekScheduleId(weekId);

    }

    @DeleteMapping("/dailySchedule/{daynumber}")

        public String deleteBYId(@PathVariable int dayId)
        {
            dailyService.deleteById(dayId);
            return "record deleted";
        }




}
