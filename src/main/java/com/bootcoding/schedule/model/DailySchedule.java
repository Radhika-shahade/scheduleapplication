package com.bootcoding.schedule.model;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.util.Date;

@Data
@Builder
@Entity
@Table(name = "daily_schedule")
public class DailySchedule {
    @Id
    @GeneratedValue
    private int id;
    @Column(name = "weekly_id")
//    private int weeklyId;
//    private int assignmentId;
    private int dayNumber;
    private String title;
    private String description;
    private String courseTopic;
    private String category;
    private String active;
    private Date createDate;
    private String createBy;
    private Date modifiedDate;
    private String  modifiedBy;
    private WeeklySchedule weeklySchedule;
}
