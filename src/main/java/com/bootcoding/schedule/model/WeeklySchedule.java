package com.bootcoding.schedule.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cascade;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class WeeklySchedule {
    @Id
    @GeneratedValue
    private int id;
    private int courseId;
    @Column(name = "week_number")
    private int weekNumber;
    private String title;
    private String description;
    private int level;
    private String difficulty;
    private String courseCategory;
    private String active;
    @Column(name = "create_date")
    private Date createDate;
    @Column(name = "create_by")
    private String createBY;
    @Column(name = "modified_date")
    private Date modifiedDate;
    @Column(name = "modified_by")
    private String modifiedBy;
    @OneToMany(cascade=CascadeType.PERSIST)
    private List<DailySchedule> dailySchedule=new ArrayList<>();
}
