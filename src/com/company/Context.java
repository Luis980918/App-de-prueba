package com.company

public class Context {

    private Strategy strategy;

    public Context() {}

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public double execute(double a, double b) {
        return strategy.execute(a, b);
    }
}
