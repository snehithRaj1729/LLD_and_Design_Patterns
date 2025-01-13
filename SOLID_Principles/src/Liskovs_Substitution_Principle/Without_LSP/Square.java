package Liskovs_Substitution_Principle.Without_LSP;

public class Square extends Rectangle{

    public void setWidth(int width){
        this.width=width;
        this.height=width;
    }

    public void setHeight(int height){
        this.width=height;
        this.height=height;
    }
}
