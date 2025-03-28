/*************************************************************************************************************
🪙GeeksforGeeks - Pattern 10
Geek is very fond of patterns. Once, his teacher gave him a pattern to solve. He gave Geek an integer n and 
asked him to build a pattern. Help Geek to build a star pattern.
Input: 5
Output:
* 
* * 
* * * 
* * * * 
* * * * *
* * * *
* * *
* *
*
*************************************************************************************************************/

public class Pattern9 {
    public static void main(String[] args) {
        int n = 5; // Number of rows for the top half of the pattern

        // Loop to print the top half of the pattern (increasing triangle)
        for (int i = 1; i <= n; i++) {    // Controls the number of rows
            for (int j = 1; j <= i; j++) {    // Prints '*' in each row
                System.out.print("* ");
            }
            System.out.println(); // Moves to the next line after printing a row
        }

        // Loop to print the bottom half of the pattern (decreasing triangle)
        for (int i = n - 1; i >= 1; i--) { // Starts from n-1 to avoid repeating the middle row
            for (int j = i; j >= 1; j--) { // Prints '*' in each row
                System.out.print("* ");
            }
            System.out.println(); // Moves to the next line after printing a row
        }
    }
}

