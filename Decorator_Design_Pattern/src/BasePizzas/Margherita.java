package BasePizzas;

import BasePizzaClass.BasePizzaClass;

public class Margherita extends BasePizzaClass {
    @Override
    public int cost() {
        System.out.print("This is the cost for Margherita pizza ");
        return 200;
    }
}
