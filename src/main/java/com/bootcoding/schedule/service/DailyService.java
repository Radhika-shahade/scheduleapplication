package com.bootcoding.schedule.service;

import com.bootcoding.schedule.model.DailySchedule;
import com.bootcoding.schedule.repository.DailyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DailyService {

    @Autowired
    private DailyRepository scheduleRepository;

    public void saveData(DailySchedule data) {
        scheduleRepository.save(data);

    }

























































}
