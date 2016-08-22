package org.pattern.decorator;

/**
 * 食物抽象类
 */
public abstract class Food {
    protected String description = "This is a food";

    public String getDescription() {
        return description;
    }

    public abstract double cost();

}