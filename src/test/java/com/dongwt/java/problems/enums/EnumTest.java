package com.dongwt.java.problems.enums;

import com.dongwt.java.problems.model.SexEnums;
import org.junit.Test;

/**
 * Created by dongwt on 2018/3/14.
 */
public class EnumTest {

    @Test
    public void test(){
        SexEnums sexEnums = SexEnums.MAN.WOMAN;
        for (SexEnums item : sexEnums.values()){
            System.out.println(item.getDesc());
        }
    }


}
