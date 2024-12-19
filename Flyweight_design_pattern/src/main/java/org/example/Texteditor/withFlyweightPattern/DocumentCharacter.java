package org.example.Texteditor.withFlyweightPattern;

public class DocumentCharacter implements ILetter{

    private char character;
    private int size;
    private String font;

    public char getCharacter() {
        return character;
    }

    public int getSize() {
        return size;
    }

    public String getFont() {
        return font;
    }

    public DocumentCharacter(char character, int size, String font) {
        this.character = character;
        this.size = size;
        this.font = font;
    }


    @Override
    public void display(int row, int coloumn) {
        // display the character accordingly on the specified row and coloumn
    }
}
