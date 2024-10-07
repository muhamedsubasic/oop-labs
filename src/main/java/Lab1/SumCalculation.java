import java.util.Scanner;

public class SumCalculation {
    public static void main(String[] args) {
        int numbOne, numbTwo, suma;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        numbOne = input.nextInt();

        System.out.print("Enter second number: ");
        numbTwo = input.nextInt();

        suma = numbOne + numbTwo;
        System.out.println("The Sum of Two numbers is: "+ suma);
    }
}
