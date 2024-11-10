package Lab6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // Task 1
//        int[] values = {6, 5, 8, 6, 11};
//        System.out.println("smallest: " + smallest(values));
        // Task 2
//        int[] values = {6, 5, 8, 6, 11};
//        System.out.println("Index of smallest: " + indexOfSmallest(values));
        // Task 3
//        int[] values = {-1, 6, 9, 8, 12};
//        System.out.println(indexOfTheSmallestStartingFrom(values, 1));
//        System.out.println(indexOfTheSmallestStartingFrom(values, 2));
//        System.out.print(indexOfTheSmallestStartingFrom(values, 4));
        // Task 4
//        int[] values = {3, 2, 5, 4, 8};
//        System.out.println(Arrays.toString(values));
//        swap(values, 1, 0);
//        System.out.println(Arrays.toString(values));
//        swap(values, 0, 3);
//        System.out.println(Arrays.toString(values));
        // Task 5
//        int[] array = {-3, 2, 3, 4, 7, 8, 12};
//        Scanner reader = new Scanner(System.in);
//        System.out.println("Values of the array: " + Arrays.toString(array));
//        System.out.println();
//        System.out.println("Enter searched number: ");
//        String searchedValue = reader.nextLine();
//        System.out.println();
//        boolean result = BinarySearch.search(array, Integer.parseInt(searchedValue));
//        if (result){
//            System.out.println("The number is in array");
//        } else {
//            System.out.println("The number is not in array");
//        }
        // Task 6
//        int[] array = {5, 1, 3, 4, 2};
//        printElegantly(array);
        // Hashmap Task
//        HashMap<String, String> names = new HashMap<String, String>();
//        names.put("matti", "mage");
//        names.put("mikael", "mixu");
//        names.put("arto", "arppa");
//        System.out.println(names.get("mikael"));
//        PromissoryNote mattisNote = new PromissoryNote();
//        mattisNote.setLoan("Arto", 51.5);
//        mattisNote.setLoan("Arto", 10.5);
//        mattisNote.setLoan("Mikael", 30);
//        System.out.println(mattisNote.howMuchIsTheDebt("Arto"));
//        System.out.println(mattisNote.howMuchIsTheDebt("Joel"));
//        Dictionary dictionary = new Dictionary();
//        dictionary.add("apina", "monkey");
//        dictionary.add("banaani", "banana");
//        System.out.println(dictionary.translate("apina"));
//        System.out.println(dictionary.translate("porkkana"));
//        System.out.println(dictionary.amountOfWords());
//        dictionary.add("cembalo", "harpsichord");
//        System.out.println(dictionary.amountOfWords());
//        Dictionary dictionary = new Dictionary();
//        dictionary.add("apina", "monkey");
//        dictionary.add("banaani", "banana");
//        dictionary.add("cembalo", "harpsichord");
//        ArrayList<String> translations = dictionary.translationList();
//        for (String translation: translations){
//            System.out.println(translation);
//        }

    }

    public static int smallest(int[] array){
        Arrays.sort(array);
        return array[0];
    }

    public static int indexOfSmallest(int[] array){
        int indexing = 0;
        int mini = array[0];
        for (int i = 0; i < array.length; i++){
            if (mini > array[i]){
                mini = array[i];
                indexing = i;
            }
        }
        return indexing;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index){
        int mini = array[index];
        int indexing = index;
        for (int i = index; i < array.length; i++){
            if (mini > array[i]){
                mini = array[i];
                indexing = i;
            }
        }
        return indexing;
    }

    public static void swap(int[] array, int index1, int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void printElegantly(int[] array){
        for (int value : array){
            if (value == array[array.length-1]){
                System.out.print(value);
            } else {
                System.out.print(value + ", ");
            }
        }
    }


}
