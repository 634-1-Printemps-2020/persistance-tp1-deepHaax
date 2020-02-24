package ch.hesge.cours634.counter;

import exception.CounterException;

public class Counter implements ICounter {
    int value = 0;

    public Counter(int value) {
        this.value = value;
    }

    @Override
    public void inc() throws CounterException {
        this.value++;
    }

    @Override
    public void add(int step) throws CounterException {
        this.value+=step;
    }

    @Override
    public int getValue() {
        return 0;
    }
}
