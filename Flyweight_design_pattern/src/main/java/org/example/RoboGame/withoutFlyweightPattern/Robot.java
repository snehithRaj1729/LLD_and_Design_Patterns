package org.example.RoboGame.withoutFlyweightPattern;

import org.example.RoboGame.withoutFlyweightPattern.Sprites;

public class Robot {
    int coordinateX;
    int coordinateY;
    String type;
    Sprites body;

    public Robot(int coordinateX, int coordinateY, String type, Sprites body) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
        this.type = type;
        this.body = body;
    }



}
