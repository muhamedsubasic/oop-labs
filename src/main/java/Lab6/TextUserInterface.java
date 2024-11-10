package Lab6;

import java.sql.SQLOutput;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Scanner;

public class TextUserInterface {
    private Scanner input;
    private Dictionaryy dictionary;

    public TextUserInterface(Scanner input, Dictionaryy dictionary){
        this.input = input;
        this.dictionary = dictionary;
    }

    public void start(){
        while (true){
            System.out.println("Command: ");
            String command = input.nextLine();
            if (command.equalsIgnoreCase("quit")){
                System.out.println("Quit");
                break;
            } else if (command.equalsIgnoreCase("translate")){
                translate();
            } else if (command.equalsIgnoreCase("add")){
                add();
            } else {
                System.out.println("Unknown statement");
            }
        }
    }

    private void add() {
        System.out.print("Word: ");
        String word = input.nextLine();
        System.out.print("Translation: ");
        String translation = input.nextLine();
        dictionary.add(word, translation);
        System.out.println("Word translation added!");
    }
    private void translate() {
        System.out.print("Enter a word to translate: ");
        String word = input.nextLine();
        String translated = dictionary.translate(word);
        if (translated == null){
            System.out.println("Word not available!");
        } else {
            System.out.println(word + " = " + translated);
        }
    }
}
