package Lab2;

import java.util.Scanner;

public class w2t1 {
    public static void main(String[] args) {
        String correct = "carrot";
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Enter password: ");
            String password = input.nextLine();
            if (password.equals(correct)){
                System.out.println("Right! Secret:lsjadkjabsd");
                break;
            }
        }
    }
}
