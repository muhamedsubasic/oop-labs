package Lab2;

import java.util.Scanner;

public class w2t2 {
    public static void main(String[] args){
    int numOne, numTwo, numTh, suma;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number:");
        numOne = Integer.parseInt(input.nextLine());
        System.out.print("Enter second number:");
        numTwo = Integer.parseInt(input.nextLine());
        System.out.print("Enter third number:");
        numTh = Integer.parseInt(input.nextLine());

        suma = numOne + numTwo + numTh;
        System.out.println("Sum is: " + suma);
    }
}
