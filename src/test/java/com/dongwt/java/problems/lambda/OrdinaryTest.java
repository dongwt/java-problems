package com.dongwt.java.problems.lambda;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by dongwt on 2017/9/14.
 */
public class OrdinaryTest {


    @Test
    public void test() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        numbers.stream().filter(item -> item % 2 == 0).map(item -> item * 100).forEach(System.out::println);
    }
}
