package Basics;
import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of rows:");

        // Read the number of rows
        int n = scan.nextInt();
        int currentNumber = 1; // Initialize the starting number

        // Outer loop for each row
        for (int i = 1; i <= n; i++) {
            // Inner loop for printing numbers in each row
            for (int j = 1; j <= i; j++) {
                System.out.print(currentNumber + " ");
                currentNumber++; // Increment the number
            }
            // Print a new line after each row
            System.out.println();
        }
        
        // Close the scanner
        scan.close();
    }
}
