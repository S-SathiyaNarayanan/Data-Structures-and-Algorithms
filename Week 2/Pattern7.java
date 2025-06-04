/*************************************************************************************************************
Write a Program which takes input n and prints the below pattern.
Input:
n = 4
Expected output:
4 3 2 1
3 2 1
2 1
1
*************************************************************************************************************/

// Solution 1
public class Pattern7 {
    public static void main(String[] args) {
        int n = 4;  // Define the number of rows for the pattern
        // Outer loop: Controls the number of rows, starting from 'n' down to 1
        for (int i = n; i >= 1; i--) {
            // Inner loop: Prints numbers from 'i' down to 1 in each row
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");  // Print the current number with a space
            }
            System.out.println();  // Move to the next line after printing one row
        }
    }
}

// Solution 2
import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

