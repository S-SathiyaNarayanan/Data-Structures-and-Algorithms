/*************************************************************************************************************
Pattern 13
Input: 
n = 5
Expected output:
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
*************************************************************************************************************/

import java.util.Scanner;        // Import Scanner class for user input
public class Pattern13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();        // Read the integer value from user
        int num = 1;        // Initialize the number to start from 1

        // Outer loop controls the number of rows
        for (int i = 1; i <= n; i++) { 
            // Inner loop prints numbers in each row
            for (int j = 1; j <= i; j++) { 
                System.out.print(num + " ");        // Print current number
                num++;        // Increment number for the next iteration
            }
            System.out.println();        // Move to the next line after each row
        }
    }
}
