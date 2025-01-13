package Interface_Segregation_Principle.With_ISP;

public class VegetarianCustomer implements VegetarianMenu,SweetsMenu{
    @Override
    public void showSweets() {
        System.out.println("Showing sweets");
    }

    @Override
    public void showVegetarianItems() {
        System.out.println("Showing vegetarian items");
    }
}
