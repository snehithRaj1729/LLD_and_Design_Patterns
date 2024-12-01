package WithStrategyDesignPattern;

import WithStrategyDesignPattern.Strategy.DriveStrategy;
import WithStrategyDesignPattern.Strategy.SportsDriveStrategy;

public class OffRoadVechicle extends Vechicle{
    public OffRoadVechicle() {
        super(new SportsDriveStrategy());
    }
}
