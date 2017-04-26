package com.dongwt.java.problems.proxy.java;

import java.lang.reflect.Proxy;


/**
* @Description: java动态代理
* @Author: dongwt
* @Date: 2017/4/26 15:54
*/
public class JavaProxyTest {


    /**
     * @Description:
     * @Author: dongwt
     * @Date: 2017/4/26 15:53
     * @param args
     */
    public static  void main(String[] args){
        ProxyService service = new ProxyServiceImpl();
        JavaHandle handle = new JavaHandle(service);
        Class<?> cls = service.getClass();
        ProxyService proxy = (ProxyService) Proxy.newProxyInstance(cls.getClassLoader(),cls.getInterfaces(),handle);
        proxy.execute("tom");
    }
}
