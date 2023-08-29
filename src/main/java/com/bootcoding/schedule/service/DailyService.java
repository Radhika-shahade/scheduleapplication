package com.bootcoding.schedule.service;

import com.bootcoding.schedule.model.DailySchedule;
import com.bootcoding.schedule.model.WeeklySchedule;
import com.bootcoding.schedule.repository.DailyRepository;
import com.bootcoding.schedule.util.CourseTopic;
import com.bootcoding.schedule.util.DateGenerator;
import com.bootcoding.schedule.util.ModifiedBy;
import com.bootcoding.schedule.util.WeekNumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class DailyService {


    @Autowired
    private DailyRepository scheduleRepository;

    @Autowired
    private WeeklyService weeklyService;

    public List<DailySchedule> saveData(int weekId, int value) {
        List<DailySchedule> list = new ArrayList<>();
        Optional<WeeklySchedule> weeklyData = weeklyService.getWeeklyData(weekId);
        for (int i = 1; i <= value; i++) {
            DailySchedule dailySchedule = DailySchedule.builder()
                    .dayNumber(i)
                    .title("java basic day " + i)
                    .description("Day wise topics are given")
                    .courseTopic(CourseTopic.courseTopic())
                    .category("learning")
                    .active("yes")
                    .createDate(DateGenerator.createDate())
                    .createBy("bootCoding")
                    .modifiedDate(DateGenerator.modifiedDate())
                    .modifiedBy(ModifiedBy.name())
                    .weeklySchedule(weeklyData.get())
                    .build();
            list.add(dailySchedule);
        }
        scheduleRepository.saveAll(list);
        return list;
    }
    public List<DailySchedule> getDailySchedule(DailySchedule dailySchedule)
    {
        return scheduleRepository.findAll();
    }


    public List<DailySchedule> findByWeekScheduleId(int weekId) {
        System.out.println(weekId);
        return scheduleRepository.findByWeeklyScheduleId(weekId);
    }

    public DailySchedule save(DailySchedule dailySchedule)
    {
        return scheduleRepository.save(dailySchedule);
    }


    //to delete record
    public void deleteById(int dayId) {
        scheduleRepository.deleteById(dayId);
    }


    public Optional<DailySchedule> updateDailySchedule( int dailyScheduleId,DailySchedule dailySchedule) {

        Optional<DailySchedule> DailyScheduleId= scheduleRepository.findById(dailyScheduleId);
        if(DailyScheduleId!=null)
        {
            scheduleRepository.save(dailySchedule);
        }
        return DailyScheduleId;
    }
}
