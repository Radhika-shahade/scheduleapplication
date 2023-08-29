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
@RequestMapping("/DailySchedule")
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
// get all daily schedule
    @GetMapping("/dailySchedule")
    public List <DailySchedule> getDailySchedule(DailySchedule dailySchedule)
    {
        return dailyService.getDailySchedule(dailySchedule);
    }


    //get daily  details according to week id
    @GetMapping("/week/{weekId}")
    public List<DailySchedule> getDailySchedulesByWeekId(@PathVariable("weekId") int weekId) {
        return dailyService.findByWeekScheduleId(weekId);

    }

    @DeleteMapping("/dailySchedule/{daynumber}")

        public String deleteBYId(@PathVariable int dayId)
        {
            dailyService.deleteById(dayId);
            return "record deleted";
        }
// update daily schedule
    @PutMapping ("/dailySchedule/{dailyScheduleId}")
    public Optional<DailySchedule> updateDailySchedule(@PathVariable("dailyScheduleId") int dailyScheduleId,@RequestBody DailySchedule dailySchedule)
    {
      return dailyService.updateDailySchedule( dailyScheduleId,dailySchedule);
    }



}
