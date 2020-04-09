package ch.hesge.cours634.counter;

import exception.CounterException;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CounterTest {

    @Test
    public void inc() throws CounterException {
        Counter counter = new Counter(0);
        counter.inc();
        Assert.assertEquals(1, counter.getValue());
    }

    @Test
    public void add() throws CounterException {
        Counter counter = new Counter(0);
        counter.add(5);
        Assert.assertEquals(5, counter.getValue());
    }

    @Test
    public void getValue() {
        Counter counter = new Counter(10);
        Assert.assertNotNull(counter);
        Assert.assertEquals(10, counter.getValue());
    }
}