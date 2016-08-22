package org.pattern.test.decorator;

import org.pattern.decorator.*;

public class FoodTest {
    public static void main(String[] args) {
        Food f1 = new Rice();
        f1 = new Meat(f1);
        f1 = new Egg(f1);
        System.out.println(f1.getDescription() + " $" + f1.cost());

        Food f2 = new Noodle();
        f2 = new Garlic(f2);
        f2 = new Egg(f2);
        f2 = new Egg(f2);
        System.out.println(f2.getDescription() + " $" + f2.cost());
    }
}
