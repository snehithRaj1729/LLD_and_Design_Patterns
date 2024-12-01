package BasePizzas;

import BasePizzaClass.BasePizzaClass;

public class Farmhouse extends BasePizzaClass {
    @Override
    public int cost() {
        System.out.print("This is the cost for Farmhouse pizza ");
        return 150;
    }
}
