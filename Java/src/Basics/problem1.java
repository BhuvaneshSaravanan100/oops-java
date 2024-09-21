//1.you are arranging seats in at riangular form for an event.Each row will have one more seat than the 
import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("Enter the number of rows: ");
        int n = scanner.nextInt();
        
     
        for (int i = 1; i <= n; i++) {
           
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();  
        }
        
        scanner.close();
    }
}
//previous row.Your task is to print the seating pattern for n rows//
//input: a number n representing the num ber of rows
//output triangle of numbers
