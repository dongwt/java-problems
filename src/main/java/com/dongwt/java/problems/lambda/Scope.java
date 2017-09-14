package com.dongwt.java.problems.lambda;

/**
 * 词法作用域
 * Created by dongwt on 2017/9/14.
 */
public class Scope {

    public Runnable r1 = () -> {
        //使用的是scope的this
        System.out.println(this);
    };
    public Runnable r2 = () -> {
        System.out.println(toString());
    };

    public Runnable r3 = new Runnable() {
        @Override
        public void run() {
            //使用的是自己的this
            System.out.println(this);
        }
    };

    public String toString() {
        return "Hello, world";
    }
}
