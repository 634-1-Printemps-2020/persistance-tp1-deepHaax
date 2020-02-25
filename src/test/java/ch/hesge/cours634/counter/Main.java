package ch.hesge.cours634.counter;

import exception.CounterException;

public class Main {

    public static void main(String[] args) throws CounterException {

        //testCounter();
        testUpperLimitedPositiveCounter();
    }

    private static void testUpperLimitedPositiveCounter() {

        UpperLimitedPositiveCounter counter = new UpperLimitedPositiveCounter(0, 100);

        try {
            counter.add(-10);
            System.out.println("test NOK");

        } catch (CounterException e) {
            System.out.println("test OK");
        }

        counter = new UpperLimitedPositiveCounter(0, 100);

        try {
            counter.add(10);
            System.out.println("test OK");

        } catch (CounterException e) {
            System.out.println("test NOK");
        }
    }

    private static void testCounter() throws CounterException {
        Counter counter = new Counter(0);

        System.out.println(counter.getValue());
        if(counter.getValue() != 0){
            throw new IllegalArgumentException("unexpected value" + counter.getValue());
        }

        counter.inc();
        if(counter.getValue() != 1){
            throw new IllegalArgumentException("unexpected value" + counter.getValue());
        }

        System.out.println(counter.getValue());
        counter.add(5);
        if(counter.getValue() != 6){
            throw new IllegalArgumentException("unexpected value" + counter.getValue());
        }

        System.out.println(counter.getValue());
    }
}
