package Lab2;

import java.util.Scanner;

public class w2t6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("How many times should the text print?: ");
        int amount = Integer.parseInt(input.nextLine());
        printText(amount);
    }
    public static void printText(int amount){
        for (int i=0; i < amount; i++){
        System.out.print("In the beginning there were the swamp, the hoe and Java. \n");
        }
    }
}
