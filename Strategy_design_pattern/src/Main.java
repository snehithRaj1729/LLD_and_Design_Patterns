import WithStrategyDesignPattern.GoodsVechicle;
import WithStrategyDesignPattern.SportsVehicle;
import WithStrategyDesignPattern.Strategy.NormalDriveStrategy;
import WithStrategyDesignPattern.Vechicle;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Vechicle vechicle = new GoodsVechicle();
        vechicle.drive();
    }
}