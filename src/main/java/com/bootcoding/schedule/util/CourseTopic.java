package com.bootcoding.schedule.util;

import java.util.Random;

public class CourseTopic {
    public static String courseTopic() {
        Random random = new Random();
        String topic[] = {"Introduction to programming", "Variables, data types, and operators", "Control structures and loops"
                , "Methods and functions", "Introduction to classes and objects", "opps concept", "Introduction to exceptions"};

        int index = random.nextInt(topic.length);
        return topic[index];
    }
}


