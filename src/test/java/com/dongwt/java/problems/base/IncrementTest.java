package com.dongwt.java.problems.base;

/**
 * @Description: java自增练习
 * @author: dongwt
 * @create: 2017-05-22 10:02
 **/
public class IncrementTest {

    public static void main(String[] args) {
        int a = 0;
        int b = a++;

        System.out.println(a);
        System.out.println(b);
        System.out.println();
        a = 0;
        a = a++;
        System.out.println(a);
    }
}
