package com.dongwt.java.problems.serializable;

import org.junit.Test;

import java.io.*;

/**
 * Created by dongwt on 2018/3/1.
 */
public class serializableTest {

    @Test
    public void serializable() throws IOException, ClassNotFoundException {
        String fileName = System.currentTimeMillis() + "";
        Foo foo = new Foo(1,2);
        FileOutputStream fileOutputStream = new FileOutputStream("/Users/dongwt/serializable/" + fileName);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(foo);
        objectOutputStream.close();
        fileOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("/Users/dongwt/serializable/1521160038826");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        foo = (Foo) objectInputStream.readObject();
        objectInputStream.close();
        fileInputStream.close();
        System.out.println(foo);
    }


}
