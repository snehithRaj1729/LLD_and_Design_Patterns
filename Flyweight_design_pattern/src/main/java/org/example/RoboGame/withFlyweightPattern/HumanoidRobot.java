package org.example.RoboGame.withFlyweightPattern;

import org.example.RoboGame.withoutFlyweightPattern.Sprites;

public class HumanoidRobot implements IRobot{
    private String type;
    private Sprites body;

    public String getType() {
        return type;
    }

    public Sprites getBody() {
        return body;
    }

    HumanoidRobot(String type, Sprites body) {
        this.type = type;
        this.body = body;
    }

    @Override
    public void display(int x, int y) {
        //use humanoid sprites object
        //and X and Y coordinate to render the image
    }
}
