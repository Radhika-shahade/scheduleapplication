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
    public static int calculateWeekNumber(int dayNumber) {
        // For every 5 days, increment the week number
        // For example, days 1-5 are in week 1, days 6-10 are in week 2, and so on
        int weekNumber = (dayNumber - 1) / 5 + 1;
        return weekNumber;
    }

}
