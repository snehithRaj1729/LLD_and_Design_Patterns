package org.example.Texteditor.withoutFlyweightPattern;

public class Character {
    char character;
    String font;
    int size;

    public Character(char character, String font, int size, int row, int coloumn) {
        this.character = character;
        this.font = font;
        this.size = size;
        this.row = row;
        this.coloumn = coloumn;
    }

    int row;
    int coloumn;
}
