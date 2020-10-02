package com.company;

public class Main {

    public static void main(String[] args) {
        Context context = new Context();
        Strategy strategy;

        switch (1) {
            case 1:
                strategy = new StrategyMultiplication();
                context.setStrategy(strategy);
                System.out.println(context.execute(2.0, 2.0));
                break;
            default:
                System.err.println("main: error");
        }
    }
}
