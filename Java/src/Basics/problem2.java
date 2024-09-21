import java.util.Scanner;

public class ReverseSeatingPatternWithSpaces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("Enter the number of rows: ");
        int n = scanner.nextInt();
        
        /
        for (int i = 1; i <= n; i++) {
            
            for (int s = n - i; s > 0; s--) {
                System.out.print("  ");  // Print two spaces for better alignment
            }
            
            // Loop to print numbers in reverse order in each row
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            
            System.out.println();  // Move to the next line after each row
        }
        
        scanner.close();
    }
}
