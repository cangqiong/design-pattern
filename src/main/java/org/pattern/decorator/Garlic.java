package org.pattern.decorator;

/**
 * 大蒜
 */
public class Garlic extends SeasoningDecorator {
    public Garlic(Food f) {
        super(f);
    }

    public String getDescription() {
        return food.getDescription() + " with garlic";
    }

    public double cost() {
        return food.cost() + 2;
    }

}