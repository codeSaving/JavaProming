package DoWhileLoop;

import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int age;

       // use the do loop to enter the number
        do {
            System.out.println("Enter the number :");
            age = scanner.nextInt();
            // use the if statement to check for condition
            if (age < 0 || age < 150) {
                System.out.println("invalide");
            }
        }while (age < 0 || age < 150) ;
        System.out.println("Age Verified");




} }
