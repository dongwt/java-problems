package com.dongwt.java.problems.proxy.cglib;

/**
 * @Description:
 *  性能 cglib 高  Proxy 底
 *  创建代理对象耗时  cglib 多  Proxy 少
 * @author: dongwt
 * @create: 2017-04-26 17:37
 **/
public class CglibProxyTest {

    public static void main(String[] args){
        CglibProxy proxy = new CglibProxy();
        Object service =  proxy.getProxy(CglibService.class);
        Class clazz = service.getClass();
        System.out.println("Interfaces");
        for(Class<?> item :clazz.getInterfaces()){
            System.out.println(item.getName());
        }
        System.out.println("Superclass");
        while (clazz.getSuperclass() != null){
            System.out.println(clazz.getName());
            clazz = clazz.getSuperclass();
        }

        CglibService proxyService  = (CglibService) service;
        proxyService.execute("tom");
    }
}
