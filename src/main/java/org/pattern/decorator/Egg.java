package org.pattern.decorator;

/**
 * 蛋
 */
public class Egg extends SeasoningDecorator {

    public Egg(Food f) {
        super(f);
    }

    @Override
    public String getDescription() {
        return food.getDescription() + " with egg";
    }

    @Override
    public double cost() {
        return food.cost() + 1.0;
    }

}