package com.dongwt.java.problems.lambda;

import org.junit.Test;

/**
 * Created by dongwt on 2017/9/14.
 */
public class ScopeTest {

    @Test
    public void test(){
        new Scope().r1.run();
        new Scope().r2.run();
        new Scope().r3.run();
    }
}
