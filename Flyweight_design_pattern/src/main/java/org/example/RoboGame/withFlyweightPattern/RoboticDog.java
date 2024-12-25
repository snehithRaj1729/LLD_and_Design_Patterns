package org.example.RoboGame.withFlyweightPattern;

import org.example.RoboGame.withoutFlyweightPattern.Sprites;

public class RoboticDog implements IRobot{
    private String type;
    private Sprites body;

    public String getType() {
        return type;
    }

    RoboticDog(String type, Sprites body) {
        this.type = type;
        this.body = body;
    }

    public Sprites getBody() {
        return body;
    }
    @Override
    public void display(int x, int y) {

    }
}
