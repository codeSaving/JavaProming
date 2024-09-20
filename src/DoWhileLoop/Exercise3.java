package DoWhileLoop;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        String password = "JavaRocks";
        String userPassword;

        do {
            System.out.print("Enter the password: ");
            userPassword = input.nextLine();

            if (!userPassword.equals(password)) {
                System.out.println("Incorrect password, try again!");
            }

        } while (!userPassword.equals(password));

        System.out.println("Access granted!");



    }
}
