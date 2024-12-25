package org.example.Texteditor.withFlyweightPattern;

public class Main {
    public static void main(String[] args) {
        ILetter obj1 = DocumentCharacterFactory.createLetter('t');
        obj1.display(2,3);

        ILetter obj2 = DocumentCharacterFactory.createLetter('h');
        obj2.display(4,5);
    }
}
