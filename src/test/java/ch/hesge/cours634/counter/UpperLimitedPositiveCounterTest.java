package ch.hesge.cours634.counter;

import exception.CounterException;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class UpperLimitedPositiveCounterTest {

    @Test (expected = CounterException.class)
    public void inc() throws CounterException {
        UpperLimitedPositiveCounter counter = new UpperLimitedPositiveCounter(1, 1);
        counter.inc();
    }

    @Test (expected = CounterException.class)
    public void addPositiveStep() throws CounterException {
        UpperLimitedPositiveCounter counter = new UpperLimitedPositiveCounter(0, 10);
        counter.add(20);

    }

    @Test (expected = CounterException.class)
    public void addNegativeStep() throws CounterException {
        UpperLimitedPositiveCounter counter = new UpperLimitedPositiveCounter(0, 10);
        counter.add(-20);

    }

    @Test
    public void addStepOK() throws CounterException {
        UpperLimitedPositiveCounter counter = new UpperLimitedPositiveCounter(0, 10);
        counter.add(5);
        Assert.assertEquals(5, counter.getValue());

    }
}