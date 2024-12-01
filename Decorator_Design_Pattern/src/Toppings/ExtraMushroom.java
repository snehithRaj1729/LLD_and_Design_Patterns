package Toppings;

import BasePizzaClass.BasePizzaClass;
import ToppingsDecorator.ToppingsDecorator;

public class ExtraMushroom extends ToppingsDecorator {
     BasePizzaClass basePizzaClass;

     public ExtraMushroom(BasePizzaClass basePizzaClass){
         this.basePizzaClass=basePizzaClass;
     }
    @Override
    public int cost() {
        return basePizzaClass.cost()+70;
    }
}
