package Lab6;

import java.util.ArrayList;
import java.util.HashMap;

public class Dictionary {
    private HashMap<String, String> words;
    private ArrayList<String> translationList;
    private int amount;

    public Dictionary(){
        this.words = new HashMap<>();
        this.translationList = new ArrayList<>();
    }

    public String translate(String word){
        return words.getOrDefault(word, null);
    }

    public void add(String word, String translation){
        words.put(word, translation);
    }

    public int amountOfWords(){
        int amount = 0;
        for (String word : words.keySet()){
            amount++;
        }
        return amount;
    }

    public ArrayList<String> translationList(){
        int i = 0;
        for (String word: words.keySet()){
            translationList.add(word + " = " + words.get(word));
            i++;
        }
        return translationList;
    }
}
