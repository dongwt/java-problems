package com.dongwt.java.problems.lambda;

import org.junit.Test;

/**
 * Created by dongwt on 2017/9/16.
 */
public class HelloFunctionTest {


    @Test
    public void test() {
        HelloFunction<Integer,String> helloFunction = f -> String.valueOf(f)+"...";

        String result = helloFunction.convert(1);
        System.out.println(result);
    }
}
