package Toppings;

import BasePizzaClass.BasePizzaClass;
import ToppingsDecorator.ToppingsDecorator;

public class ExtraCheese extends ToppingsDecorator {
    BasePizzaClass basePizzaClass;

    public ExtraCheese(BasePizzaClass basePizzaClass){
        this.basePizzaClass=basePizzaClass;
    }
    @Override
    public int cost() {
        return basePizzaClass.cost()+10;
    }
}
