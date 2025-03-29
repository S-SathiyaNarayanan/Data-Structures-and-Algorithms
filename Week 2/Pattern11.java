/*************************************************************************************************************
Pattern 11
Input: 
n = 5
Expected output:
*********
 *******
  *****
   ***
    *
*************************************************************************************************************/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the number of rows for the triangle pattern
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        
        // Loop from n down to 1 for each row
        for (int i = n; i >= 1; i--) {
            // Print leading spaces: (n - i) spaces for each row
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print stars: (2*i - 1) stars for each row
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            // Move to the next line after printing each row
            System.out.println();
        }
        
        sc.close();
    }
}

