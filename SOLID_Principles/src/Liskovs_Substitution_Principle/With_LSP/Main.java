package Liskovs_Substitution_Principle.With_LSP;

public class Main {
    public static void main(String args[]){
        Shape rectangle = new Rectangle(4,5);
        System.out.println("Rectangle area = "+rectangle.calculateArea());

        Shape square = new Square(8);
        System.out.println("Square area = "+square.calculateArea());
    }
}
