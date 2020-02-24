package ch.hesge.cours634.counter;

import exception.CounterException;

public interface ICounter {
    void inc() throws CounterException;

    void add(int step) throws CounterException;

    int getValue();
}
