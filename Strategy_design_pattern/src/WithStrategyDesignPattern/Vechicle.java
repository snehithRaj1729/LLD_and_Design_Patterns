package WithStrategyDesignPattern;

import WithStrategyDesignPattern.Strategy.DriveStrategy;

public class Vechicle{
    DriveStrategy driveStrategy; //This is like a manager here

    //This is constructor injection
    Vechicle(DriveStrategy driveObj){
        this.driveStrategy = driveObj;
    }
    public void drive(){
        driveStrategy.drive();
    }
}
