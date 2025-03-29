/*************************************************************************************************************
Pattern 14
Input: 
n = 5
Expected output:
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5
*************************************************************************************************************/

import java.util.Scanner; 
public class Pattern14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();        // Read input from user

        // Outer loop controls the number of rows
        for (int i = 1; i <= n; i++) {
            // Inner loop prints the number 'i', 'i' times
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " "); // Print 'i'
            }
            System.out.println(); // Move to the next line
        }
    }
}

