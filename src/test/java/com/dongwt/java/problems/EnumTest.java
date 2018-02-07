package com.dongwt.java.problems;

import com.dongwt.java.problems.model.Person;
import org.junit.Test;

/**
 * Created by dongwt on 2018/1/29.
 */
public class EnumTest {


    @Test
    public void test() {
        Person person = new Person();
        Person person1 = person;
        System.out.println(person.toString());
        System.out.println(person1.toString());
    }

}
