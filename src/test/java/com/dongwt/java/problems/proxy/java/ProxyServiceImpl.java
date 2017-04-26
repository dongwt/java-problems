package com.dongwt.java.problems.proxy.java;

/**
 * Created by Administrator on 2017/4/26.
 */
public class ProxyServiceImpl implements  ProxyService{
    @Override
    public String execute(String name) {
        System.out.println(name);
        return name;
    }
}
