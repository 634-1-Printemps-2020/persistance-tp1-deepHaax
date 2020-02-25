package ch.hesge.cours634.counter;

import exception.CounterException;

public class Counter implements ICounter {
    private int value;

    public Counter(int initial) {
        this.value = initial;
    }

    @Override
    public void inc() throws CounterException {
        value++;
    }

    @Override
    public void add(int step) throws CounterException {
        value+=step;
    }

    @Override
    public int getValue() {
        return value;
    }
}
