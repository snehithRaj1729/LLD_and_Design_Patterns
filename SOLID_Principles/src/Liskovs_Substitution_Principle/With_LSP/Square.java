package Liskovs_Substitution_Principle.With_LSP;

public class Square implements Shape{
    int side;

    public Square(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public int calculateArea() {
        return this.side*this.side;
    }
}
