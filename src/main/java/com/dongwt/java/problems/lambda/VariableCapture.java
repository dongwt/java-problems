package com.dongwt.java.problems.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/**
 * 如果捕获的变量没有被声明为 final 就会产生一个编译错误。
 * 我们现在放宽了这个限制——对于 lambda 表达式和内部类，我们允许在其中捕获那些符合 有效只读（Effectively final）的局部变量。
 * <p>
 * 如果一个局部变量在初始化后从未被修改过，那么它就符合有效只读的要求，
 * 换句话说，加上 final 后也不会导致编译错误的局部变量就是有效只读变量。
 * Created by dongwt on 2017/9/14.
 */
public class VariableCapture {

    Callable<String> helloCallable(String name) {
        String hello = "Hello";
//        hello = 'haha';
        return () -> (hello + ", " + name);
    }


    Callable<String> hiCallable(String name) {
        String hello = "hi";
//        hello = 'haha';
        return new Callable<String>() {
            @Override
            public String call() throws Exception {
                return hello;
            }
        };
    }

    Callable<Integer> listCallable(String name) {
        Integer sum = 0;
        return new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                //但试图修改捕获变量的行为仍然会被禁止
//                return sum +=1;
                return sum;
            }
        };
    }


    public void hello() {
        int sum = 0;
        List<Integer> list = new ArrayList<>();
        list.forEach(e -> {
//            sum += e.size();
        }); // Illegal, close over values
        List<Integer> aList = new ArrayList<>();
        list.forEach(e -> {
            aList.add(e);
        }); // Legal, open over variables
    }
}
