package Interface_Segregation_Principle.With_ISP;

public class NonVegetarianCustomer implements NonVegetarianMenu,DrinksMenu{
    @Override
    public void showDrinks() {
        System.out.println("Showing drinks");
    }

    @Override
    public void showNonVegetarianItems() {
        System.out.println("Showing non veg items");
    }
}
