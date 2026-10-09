package hattabi.youness.context;

import hattabi.youness.strategy.*;

public class Context {
    Strategy strategy = new DefaultStrategyImpl();

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void effectuerOperation() {
        strategy.operationStrategy();
    }
}