package com.dongwt.java.problems.lambda;

/**
 * Created by dongwt on 2017/9/16.
 */
@FunctionalInterface
public interface HelloFunction<F,T>{

    T convert(F f);


}
