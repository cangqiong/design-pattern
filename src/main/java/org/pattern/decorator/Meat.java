package org.pattern.decorator;

/**
 * 肉
 */
public class Meat extends SeasoningDecorator {
    public Meat(Food f) {
        super(f);
    }

    public String getDescription() {
        return food.getDescription() + " with meat";
    }

    public double cost() {
        return food.cost() + 5.0;
    }

}