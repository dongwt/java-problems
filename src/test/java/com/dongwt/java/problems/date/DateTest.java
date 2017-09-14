package com.dongwt.java.problems.date;

import org.apache.commons.lang3.time.DateUtils;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by dongwt on 2017/9/12.
 */
public class DateTest {

    private static final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

    @Test
    public void testDateCompare(){
        Date beforeDate = DateUtils.addDays(new Date(),-2);

        Date currentDate = new Date();

        System.out.println("beforeDate:" + simpleDateFormat.format(beforeDate));
        System.out.println("currentDate:" + simpleDateFormat.format(currentDate));
        System.out.println(beforeDate.after(currentDate));
    }


}
