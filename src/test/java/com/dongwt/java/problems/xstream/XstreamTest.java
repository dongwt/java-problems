package com.dongwt.java.problems.xstream;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import org.junit.Test;

/**
 * Created by dongwt on 2018/1/14.
 */
public class XstreamTest {

    @Test
    public void test1(){
        while (true){
            Long millis = System.currentTimeMillis();
            XStream xStream = new XStream(new DomDriver("utf-8"));
            System.out.println("---------"+(System.currentTimeMillis()-millis) + "-------------");
        }
    }


    @Test
    public void test2(){
        while (true){
            Long millis = System.currentTimeMillis();
            XStream xStream = new XStream(null,new DomDriver("utf-8"),XstreamTest.class.getClassLoader(),null);
            System.out.println("---------"+(System.currentTimeMillis()-millis) + "-------------");
        }
    }

}
