package com.bootcoding.schedule.util;

import java.util.Random;

public class Level {
    public static int getLevel() {
        Random random = new Random();
        int min = 1, max = 10;
        return min + random.nextInt(max - min);
    }
}

