package main;

public class NoProcessedOrdersLeft extends RuntimeException {

    public NoProcessedOrdersLeft(String msg) {
        super(msg);

    }
}
