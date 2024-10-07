package Lab2;

import java.util.Scanner;

public class w2t4 {
    public static void main(String[] args){
        int first, last;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        first = Integer.parseInt(input.nextLine());
        System.out.print("Enter last number: ");
        last = Integer.parseInt(input.nextLine());

        if (first > last){
            System.out.println(first +" & "+ last);
        }

        while (first < last){
            System.out.print(first);
            first++;
        }

    }
}
