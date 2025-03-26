/*************************************************************************************************************
🪙GeeksforGeeks - Factorial
Given a positive integer, N. Find the factorial of N.
Input: N = 5
Output: 120
Explanation: 1 x 2 x 3 x 4 x 5 = 120
*************************************************************************************************************/
import java.util.Scanner;    // Import Scanner class for user input
public class FactorialOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // Create Scanner object to take input from user
        System.out.print("Enter the Number: ");
        int N = sc.nextInt();    // Read the integer input from user
        int fact = 1;    // Initialize factorial variable with 1
      
        // Loop from 1 to N to calculate factorial
        for (int i = 1; i <= N; i++) {
            fact = fact * i;    // Multiply fact by the current loop variable i
        }
        // Print the computed factorial
        System.out.println("Factorial of " + N + " is " + fact);
    }
}
