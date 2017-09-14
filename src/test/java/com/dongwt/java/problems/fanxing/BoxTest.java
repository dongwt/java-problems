package com.dongwt.java.problems.fanxing;

/**
 * Created by dongwt on 2017/8/31.
 */
public class BoxTest {

    Box<? extends  Fruit> boxExtends = new Box();

    Box<? super  Fruit> boxSuper = new Box();


    public void setBoxExtends(){
//        boxExtends.set(new Fruit());
        Fruit fruit = boxExtends.get();
    }


    public void getBoxExtends(){
        boxSuper.set(new Fruit());
        Object fruit = boxSuper.get();
    }
}
