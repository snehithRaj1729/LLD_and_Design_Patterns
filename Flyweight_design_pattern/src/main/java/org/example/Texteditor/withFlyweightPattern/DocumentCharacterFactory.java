package org.example.Texteditor.withFlyweightPattern;

import java.util.HashMap;
import java.util.Map;

public class DocumentCharacterFactory {
    private static Map<Character,ILetter> characterCache = new HashMap<>();
    public static ILetter createLetter(char character){
        if(characterCache.containsKey(character)){
            return characterCache.get(character);
        }
        else {
            DocumentCharacter character1 = new DocumentCharacter(character,10,"ARIAL");
            characterCache.put(character,character1);
            return character1;
        }
    }

}
