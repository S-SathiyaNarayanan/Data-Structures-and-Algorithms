/*************************************************************************************************************
Pattern 12
Input: 
n = 4
Expected output:
      *
    * * *
  * * * * *
* * * * * * *
  * * * * *
    * * *
      *
*************************************************************************************************************/

import java.util.Scanner;
public class Pattern12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter the value of n
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        // Print the original triangle pattern (upper half of the diamond)
        for (int i = 1; i <= n; i++) {
            // Print leading spaces to center-align the stars
            // We print (n - i) spaces because as the rows increase, spaces decrease
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print stars for the current row
            // The number of stars in each row follows the formula (2*i - 1)
            // This ensures the sequence: 1, 3, 5, 7, ... (odd numbers)
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }
            // Move to the next line after printing one row
            System.out.println();
        }

        // Print the inverted triangle pattern (lower half of the diamond)
        for (int i = n - 1; i >= 1; i--) { // We start from (n-1) to avoid repeating the middle row
            // Print leading spaces to center-align the stars
            // We print (n - i) spaces because as rows decrease, spaces increase
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print stars for the current row
            // Again, the number of stars follows (2*i - 1) ensuring symmetry
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }
            // Move to the next line after printing one row
            System.out.println();
        }

        // Close the scanner to prevent resource leak
        sc.close();
    }
}
