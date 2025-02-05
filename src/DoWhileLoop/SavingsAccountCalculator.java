package DoWhileLoop;

import java.util.Scanner;

public class SavingsAccountCalculator {
    /*
     * Name: Lhoucine ET TIHAMI
     * Purpose:Print the total value of the savings account after 6 months of regular deposits and interest
     *
     */
    public static void main(String[] args) {
        // we are going to create a scanner to receive the input from the use
        Scanner input = new Scanner(System.in);

        // we prompt the user to enter the requested monthly saving amount
        System.out.print("Enter the monthly saving amount: ");
        // we are storing the input in the variable name monthlySavingAmount with data type double
        double mnthlySavingAmount = input.nextDouble();
        //in order to get monthly rate, we will take annual interest rate(5%) and divide by 12

        double monthlyInterestRate = 0.05 / 12;
        // we are goiing to add the interest to the saving amount for the first month

        double accountValue = (mnthlySavingAmount) * (1 + monthlyInterestRate);

        // we are adding the interest to the saving amount for the second month
        accountValue = (mnthlySavingAmount + accountValue) * (1 + monthlyInterestRate);

        // we are adding the interest to the saving amount for the third month
        accountValue = (mnthlySavingAmount + accountValue) * (1 + monthlyInterestRate);

        // we are adding the interest to the saving amount for the fourth month
        accountValue = (mnthlySavingAmount + accountValue) * (1 + monthlyInterestRate);

        // we are adding the interest to the saving amount for the fifth month
        accountValue = (mnthlySavingAmount + accountValue) * (1 + monthlyInterestRate);

        // we are adding the interest to the saving amount for the sixth month
        accountValue = (mnthlySavingAmount + accountValue) * (1 + monthlyInterestRate);

        // // display the final account value after six months, with precision limited to two decimal.
        System.out.printf("After the sixth month, the account value is $%.2f%n", accountValue);
    }

}





