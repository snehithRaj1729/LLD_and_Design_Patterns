package org.example.withFlyweightPattern;

import org.example.Game.withoutFlyweightPattern.Sprites;

import java.util.HashMap;
import java.util.Map;

public class RobotFactory {
    private static Map<String,IRobot> roboticObjectCache = new HashMap<>();
    public static IRobot createObject(String robotType){
        if(roboticObjectCache.containsKey(robotType)){
            return roboticObjectCache.get(robotType);
        }
        else{
            if(robotType=="HUMANOID"){
                Sprites humanoidSprites = new Sprites();
                HumanoidRobot humanoidRobot = new HumanoidRobot(robotType,humanoidSprites);
                roboticObjectCache.put(robotType,humanoidRobot);
                return humanoidRobot;
            }
            else if(robotType=="ROBOTICDOG"){
                Sprites dogSprites = new Sprites();
                RoboticDog roboticDog = new RoboticDog(robotType,dogSprites);
                roboticObjectCache.put(robotType,roboticDog);
                return roboticDog;
            }
        }
        return null;
    }
}
