package com.dongwt.java.problems;

import com.dongwt.java.problems.model.SexEnums;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by dongwt on 2018/1/30.
 */
public class DemoTest {

    SimpleDateFormat dateTimeFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");

    @Test
    public void test() throws ParseException {
        Long beginDate = dateFormat.parse("2018-03-05").getTime();
        System.out.println(beginDate);
        Long endDate = dateFormat.parse("2018-03-31").getTime();
        System.out.println(endDate);
        Long beginTime = timeFormat.parse("10:00:00").getTime();
        System.out.println(beginTime);
        Long endTime = timeFormat.parse("10:30:00").getTime();
        System.out.println(endTime);
    }
}
