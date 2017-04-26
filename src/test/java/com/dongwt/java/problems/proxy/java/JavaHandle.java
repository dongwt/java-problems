package com.dongwt.java.problems.proxy.java;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by Administrator on 2017/4/26.
 */
public class JavaHandle implements InvocationHandler {

    private Object target;

    public JavaHandle(){

    }

    public JavaHandle(Object target){
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("begin");

        Object result = method.invoke(this.target,args);

        System.out.println("end");
        return result;
    }
}
