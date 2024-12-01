import BasePizzaClass.BasePizzaClass;
import BasePizzas.Margherita;
import Toppings.ExtraCheese;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BasePizzaClass margheritaAndExtracheese = new ExtraCheese(new Margherita());
        margheritaAndExtracheese.cost();
    }
}