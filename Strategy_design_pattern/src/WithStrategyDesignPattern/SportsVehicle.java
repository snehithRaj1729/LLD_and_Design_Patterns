package WithStrategyDesignPattern;

import WithStrategyDesignPattern.Strategy.DriveStrategy;
import WithStrategyDesignPattern.Strategy.SportsDriveStrategy;

public class SportsVehicle extends Vechicle{
    public SportsVehicle() {
        super(new SportsDriveStrategy());
    }
}
