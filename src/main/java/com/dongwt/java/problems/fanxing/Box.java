package com.dongwt.java.problems.fanxing;

/**
 * Created by dongwt on 2017/8/31.
 */
public class Box<T> {

    T t;

    public void set(T t){
        this.t = t;
    }


    public T get(){
        return t;
    }
}
