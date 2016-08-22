package org.pattern.decorator;

/**
 * 抽象装饰器类
 */
public abstract class SeasoningDecorator extends Food {
    protected Food food;

    public SeasoningDecorator(Food f) {
        food = f;
    }

    public abstract String getDescription();

}