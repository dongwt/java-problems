package com.dongwt.java.problems.serializable;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * Created by dongwt on 2018/3/16.
 */
public class Foo extends AbstractFoo implements Serializable{

    private static final long serialVersionUID = 6464089094834222037L;

    private void readObject(ObjectInputStream s) throws IOException,ClassNotFoundException{
        s.defaultReadObject();

        int x = s.readInt();
        int y = s.readInt();
        initialize(x,y);
    }

    private void writeObject(ObjectOutputStream s) throws IOException{
        s.defaultWriteObject();

        s.writeInt(getX());
        s.writeInt(getY());
    }

    public Foo(int x,int y){
        super(x,y);
    }
}
