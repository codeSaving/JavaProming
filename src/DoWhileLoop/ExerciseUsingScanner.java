package DoWhileLoop;

import java.util.Scanner;

public class ExerciseUsingScanner {

    public static void main(String[] args) {




        Scanner input = new Scanner(System.in);

        int start, end;
        System.out.println("Enter the fisrt Number : ");
        start = input.nextInt();

        System.out.println("Enter the end range of Number  :");

        end = input.nextInt();

        do {
            System.out.println(start + " ");
            start++;

        } while(start<= end);

    }
}
