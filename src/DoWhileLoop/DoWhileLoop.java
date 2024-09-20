package DoWhileLoop;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {


        int number = 1;
        while (number < 10) {
            System.out.println("hello Java");
            number++;
        }


        do {
            System.out.println("how is your day lhoucine");
            number++;}
            while (number < 20) ;


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

