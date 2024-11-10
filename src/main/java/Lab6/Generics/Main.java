package Lab6.Generics;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static <T> void calculateEvenOdd(List<T> numbers){
        int evenSum = 0;
        int oddSum = 0;

        for (T number : numbers){
            if (number instanceof Integer){
                int val = (Integer) number;
                if (val % 2 == 0){
                    evenSum += val;
                } else {
                    oddSum += val;
                }
            }
        }
        System.out.println("Sum of even: " + evenSum);
        System.out.println("Sum of odd: " + oddSum);
    }

    public static <T> List<T> reverseAnyList(List<T> elements){
        List<T> reversedElements = new ArrayList<>();
        for (int i = elements.size()-1; i >= 0; i--){
            reversedElements.add(elements.get(i));
        }
        return reversedElements;

    }

    public static void main(String[] args){
        List<Integer> something = new ArrayList<>();
        something.add(1);
        something.add(2);
        something.add(3);
        something.add(4);
        something.add(5);
        List<String> fruits = new ArrayList<>();
        fruits.add("banana");
        fruits.add("apple");
        fruits.add("pear");

        calculateEvenOdd(something);
        System.out.println("Reversed integers: " + reverseAnyList(something));
        System.out.println("Reversed strings: " + reverseAnyList(fruits));
    }
}
