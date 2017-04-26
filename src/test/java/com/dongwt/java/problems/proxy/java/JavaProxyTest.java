package com.dongwt.java.problems.proxy.java;

import java.lang.reflect.Proxy;


/**
* @Description: java动态代理(基于接口代理)
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
        Object proxy = Proxy.newProxyInstance(cls.getClassLoader(),cls.getInterfaces(),handle);
        Class clazz = proxy.getClass();
        /**
         * Superclass: com.sun.proxy.$Proxy0 代理类继承Proxy
         * Superclass: java.lang.reflect.Proxy
         * Superclass: java.lang.Object
         */
        while(clazz != null){
            System.out.println("Superclass: " + clazz.getName());
            clazz = clazz.getSuperclass();
        }
        System.out.println();
        ProxyService proxyService = (ProxyService) proxy;
        proxyService.execute("tom");
    }
}
