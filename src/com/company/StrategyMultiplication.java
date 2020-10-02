package com.company;

public class StrategyMultiplication implements Strategy {

    @Override
    public double execute(double a, double b) {
        return a * b;
    }
}
