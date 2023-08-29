//package com.bootcoding.schedule.controller;
//
//import com.bootcoding.schedule.model.Course;
//import com.bootcoding.schedule.repository.CourseRepository;
//import com.bootcoding.schedule.service.CourseService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/course")
//public class CourseController {
//    @Autowired
//    private CourseService courseService;
//
//    @PostMapping("/details")
//    public String courseDetail(List<Course>details)
//    {
//        courseService.saveUser(details);
//        return "true";
//
//    }
//
//}
