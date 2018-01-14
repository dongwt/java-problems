package com.dongwt.java.problems.xstream;

import com.alibaba.fastjson.JSONObject;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

/**
 * Created by dongwt on 2017/12/26.
 */
public class XmlUtil {

    private static XStream xstream = new XStream(new DomDriver("utf-8"));

    public static String toXml(Object obj, long millis) {
        //如果没有这句，xml中的根元素会是<包.类名>；或者说：注解根本就没生效，所以的元素名就是类的属性
        xstream.processAnnotations(obj.getClass()); //通过注解方式的，一定要有这句话
        try {
            System.out.println("开始解析。" + JSONObject.toJSON(obj));
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return xstream.toXML(obj);
    }


    public static <T> T toBean(String xmlStr, Class<T> cls, long millis) {
        xstream.processAnnotations(cls);
        System.out.println("开始解析。" + JSONObject.toJSON(xmlStr));
        T obj = (T) xstream.fromXML(xmlStr);
        return obj;
    }
}
