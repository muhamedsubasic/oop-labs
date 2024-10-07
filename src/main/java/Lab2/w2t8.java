package Lab2;

import java.util.Scanner;

public class w2t8 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int row = Integer.parseInt(input.nextLine());
        drawStarsPiramid(row);
    }
    public static void drawStarsPiramid(int row){
        for (int i=row; i > 0; i--){
            for (int j=i; j > 0; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}