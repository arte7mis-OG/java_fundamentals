package labs_examples.fundamentals.labs;

import java.util.Scanner;

/**
 * Fundamentals Exercise 5: Days to seconds
 *
 *      Take in a number in days from the user between 1 and 1,000,000 and convert it to
 *      seconds.
 *
 *      NOTE: We will be using the Scanner class to collect user input. This is demonstrated below.
 *
 */

public class Exercise_05 {

    public static void main(String[] args) {

        // create scanner
        Scanner scanner = new Scanner(System.in);
        // prompt user
        System.out.print("Enter a number in days between 1 and 1,000,000: ");
        // assign input to variable as int
        int days = scanner.nextInt();

        // write completed code here
        System.out.println("There are 86400 seconds in 1 day.");
        int seconds = days * 86400;

        System.out.println("Based on the day(s) you have given, which is " + days + " days, that would be a total of " + seconds + " seconds.");
    }
}
