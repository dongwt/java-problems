package com.dongwt.java.problems.proxy.cglib;

/**
 * @Description:
 * @author:dongwt
 * @create:2017-04-26 17:30
 **/
public class CglibService {

    public String execute(String name){
        System.out.println(name);
        return name;
    }

}
