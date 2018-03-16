package com.dongwt.java.problems.serializable;


import java.util.concurrent.atomic.AtomicReference;

/**
 * Created by dongwt on 2018/3/16.
 */
public abstract class AbstractFoo {
    private int x, y;

    private enum State {NEW, INITIALINGG, INITIALZED}

    ;

    private final AtomicReference<State> init = new AtomicReference<>(State.NEW);

    public AbstractFoo(int x, int y) {
        initialize(x, y);
    }

    protected AbstractFoo() {
    }

    protected final void initialize(int x, int y) {
        if (!init.compareAndSet(State.NEW, State.INITIALINGG))
            throw new IllegalArgumentException("Already initialized");

        this.x = x;
        this.y = y;
        init.set(State.INITIALZED);
    }


    protected final int getX(){
        checkInit();
        return x;
    }

    protected final int getY(){
        checkInit();
        return y;
    }

    private void checkInit(){
        if(init.get() != State.INITIALZED){
            throw  new IllegalStateException("Uninitialized");
        }
    }
}
