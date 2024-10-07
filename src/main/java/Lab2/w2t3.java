package Lab2;

import java.util.Scanner;

public class w2t3 {
    public static void main(String[] args){
        int suma = 0;
        Scanner input = new Scanner(System.in);
        while (true){
            System.out.print("Enter a number: ");
            int number = Integer.parseInt(input.nextLine());
            suma += number;
            if (number == 0) {
                System.out.println("Suma: "+ suma);
                break;
            }
        }
    }
}
