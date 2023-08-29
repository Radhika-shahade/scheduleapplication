package com.bootcoding.schedule.util;

import java.util.Random;

public class ModifiedBy {
    public static String name()
    {
        String name[]={"rina","raghav","pallavi","unnati","sourabh"};
        Random random= new Random();
       int index= random.nextInt(name.length);
       return name[index];
    }

}
