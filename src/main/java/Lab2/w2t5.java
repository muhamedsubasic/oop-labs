package Lab2;

import java.util.Scanner;

public class w2t5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = Integer.parseInt(input.nextLine());

        int result = (int)Math.pow(2, n);
        System.out.println("Result: "+ result);
    }
}
