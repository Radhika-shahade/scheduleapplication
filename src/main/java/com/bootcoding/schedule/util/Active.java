package com.bootcoding.schedule.util;

import java.util.Random;

public class Active {
    public static String activityStatus()
    {
        String status[]={"yes","No"};
        Random random=new Random();
       int index= random.nextInt(status.length);
       return status[index];
    }

}
