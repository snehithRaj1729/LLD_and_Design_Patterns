package Interface_Segregation_Principle.Without_ISP;

public class VegetarianCustomer implements Menu{
    @Override
    public void showVegetarianItems() {
        System.out.println("Showing vegetarian items");
    }

    @Override
    public void showNonVegetarianItems() {
        throw new UnsupportedOperationException("Non vegetarian items not applicable");
    }

    @Override
    public void showDrinks() {
        throw new UnsupportedOperationException("Drinks not applicable");
    }

    @Override
    public void showSweets() {
        System.out.println("Showing sweets");
    }
}
