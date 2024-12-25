package org.example.RoboGame.withFlyweightPattern;

public class Main {
    public static void main(String[] args) {
        IRobot humanoidRobot1 = RobotFactory.createObject("HUMANOID");
        humanoidRobot1.display(1,2);

        IRobot humanoidRobot2 = RobotFactory.createObject("HUMANOID");
        humanoidRobot2.display(3,4);

        IRobot robotDog1 = RobotFactory.createObject("ROBOTICDOG");
        robotDog1.display(5,6);

        IRobot robotDog2 = RobotFactory.createObject("ROBOTICDOG");
        robotDog2.display(7,8);
    }
}
