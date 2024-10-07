import java.util.Scanner;

public class IsPositive {
    public static void main(String[] args){
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        number = input.nextInt();

        if (number > 0){
            System.out.println("Number is positive!");
        } else if (number == 0) {
            System.out.println("Number is zero!");
        } else {
            System.out.println("Number is negative!");
        }
    }
}
