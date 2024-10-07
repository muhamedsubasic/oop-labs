import java.util.Scanner;

public class GreaterNumber {
    public static void main(String[] args) {
        int numberOne, numberTwo;
        Scanner input = new Scanner(System.in);
        System.out.print("First number: ");
        numberOne = input.nextInt();

        System.out.print("Second number: ");
        numberTwo = input.nextInt();

        if (numberOne == numberTwo) {
            System.out.println(numberOne + " and " + numberTwo + " are equal!");
        } else if (numberOne > numberTwo) {
            System.out.println("First number(" + numberOne + ") is greater");
        } else {
            System.out.println("Second number(" + numberTwo + ") is greater");
        }
    }
}
