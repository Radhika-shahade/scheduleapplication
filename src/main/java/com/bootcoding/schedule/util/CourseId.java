package com.bootcoding.schedule.util;

import org.hibernate.tool.schema.internal.exec.ScriptTargetOutputToFile;

import java.util.Random;

public class CourseId {

    public static int courseId()
    {
        Random random= new Random();
        int min=1;
        int max=4;
        return random.nextInt(max-min)+min;
    }

    public static void main(String[] args) {
        System.out.println(courseId());
    }

}
