package DesignPattern2;

import java.util.ArrayList;

public class Context {

    private Strategy strategy;

    /**
     * set the strategy
     * @param strategy which strategy to use
     */
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * execute the action
     * @param list list to sort
     * @param order sorting order flag
     */
    public void executeStrategy(ArrayList<Integer> list, boolean order) {
        strategy.performSorting(list, order);
    }

}
