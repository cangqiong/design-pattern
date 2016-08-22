package org.pattern.decorator;

/**
 * 米饭类
 */
public class Rice extends Food {

    public Rice() {
        description = "This is rice";
    }

    public double cost() {
        return 1;
    }

}