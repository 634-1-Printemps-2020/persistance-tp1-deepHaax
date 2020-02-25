package ch.hesge.cours634.counter;

import exception.CounterException;

public class UpperLimitedPositiveCounter extends Counter {

    private int max;

    public UpperLimitedPositiveCounter(int initial, int max) {
        super(initial);
        this.max = max;
    }


    @Override
    public void inc() throws CounterException {
        checkMax(getValue(), getValue()+1>max, "cannot exceed max value ", max, " current value ");
        super.inc();
    }

    @Override
    public void add(int step) throws CounterException {
        checkNegative(step);
        checkMax(step, getValue() + step < 0, "value can not be negative, current value ", getValue(), " step : ");

        super.add(step);
    }

    private void checkMax(int step, boolean b, String s, int value, String s2) throws CounterException {
        if (b) {
            throw new CounterException(s + value + s2 + step);
        }
    }

    private void checkNegative(int step) throws CounterException {
        if(getValue()+step>max){
            throw new CounterException("cannot exceed max value " +max + " current value " + getValue()+ " step : " +step);
        }
    }


}
