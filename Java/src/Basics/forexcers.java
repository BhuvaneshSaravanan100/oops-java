package Basics;
import java.util.Scanner;

public class forexcers {
    public static void main(String[] args) {
        Scanner love = new Scanner(System.in);

        System.out.println("Number 1");
        int a = love.nextInt();

        System.out.println("Number 2");
        int b = love.nextInt();

        // Corrected for loop
        for (int i = 5; i <= 10; i++) {
            System.out.println(i);
        }

        love.close();  // Close the scanner to avoid resource leaks
    }
}
