package BasePizzas;

import BasePizzaClass.BasePizzaClass;

public class VegDelight extends BasePizzaClass {
    @Override
    public int cost() {
        System.out.print("This is the cost for VegDelight pizza ");
        return 100;
    }
}
