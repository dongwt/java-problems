package com.dongwt.java.problems;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by dongwt on 2018/1/30.
 */
public class DemoTest {

    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Test
    public void test() {
        Date date = new Date(1517932800000l);
        System.out.println(simpleDateFormat.format(date));
    }
}
