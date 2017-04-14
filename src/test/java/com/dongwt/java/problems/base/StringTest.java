package com.dongwt.java.problems.base;

public class StringTest {


    public static void main(String[] args) {
        String s1 = new StringBuilder().append("String").append("Test").toString();
        final String a = "String";
        final String b = "Test";
        //以下代码在1.7及以后jdk中运行,原理请参考http://www.importnew.com/21720.html
        String c = a + b;
        s1.intern();
        System.out.println(s1 == c);//返回false;
        /*s1.intern();
        String c = a + b;
        System.out.println(s1 == c);返回true*/
    }

}
