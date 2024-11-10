package Lab6;

import java.util.ArrayList;
import java.util.HashMap;

public class Dictionaryy {
    private HashMap<String, String> words;

    public Dictionaryy(HashMap words){
        this.words = new HashMap<>();
    }

    public String translate(String word){
        return words.getOrDefault(word, null);
    }

    public void add(String word, String translation){
        words.put(word, translation);
    }
}
