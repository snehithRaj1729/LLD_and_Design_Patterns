package Liskovs_Substitution_Principle.Without_LSP;

public class Main {
    public static void main(String args[]){
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(4);
        rectangle.setHeight(5);
        System.out.println("Rectangle area = "+rectangle.calculateArea()); //output 20

        Rectangle square = new Square();
        square.setHeight(5);
        square.setWidth(4);// this breaks squares definition
        System.out.println("Square area = "+square.calculateArea());// output 16(incorrect)
    }
}
