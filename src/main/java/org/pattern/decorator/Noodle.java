package org.pattern.decorator;

/**
 * 面条
 */
public class Noodle extends Food {

    public Noodle() {
        description = "This is noodle";
    }

    public double cost() {
        return 8;
    }

}