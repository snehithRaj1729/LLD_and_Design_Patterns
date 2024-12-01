package WithStrategyDesignPattern;

import WithStrategyDesignPattern.Strategy.DriveStrategy;
import WithStrategyDesignPattern.Strategy.NormalDriveStrategy;

public class GoodsVechicle extends Vechicle{
    public GoodsVechicle() {
        super(new NormalDriveStrategy());
    }
}
