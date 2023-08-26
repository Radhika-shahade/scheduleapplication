package com.bootcoding.schedule.util;

import java.util.Random;

public class WeekNumber {

    public static int number()
    {
        Random random= new Random();
        int min=1;
        int max=10;
        return random.nextInt(max-min)+min;
    }

}
