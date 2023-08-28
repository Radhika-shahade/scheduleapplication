package com.bootcoding.schedule.util;

import java.util.Random;

public class Difficulty {
    public static String getDifficultyType(){
        Random random=new Random();
        String difficulty[]={"Hard","Medium","Easy"};
        int index=random.nextInt(difficulty.length);
        return difficulty[index];
    }
}
