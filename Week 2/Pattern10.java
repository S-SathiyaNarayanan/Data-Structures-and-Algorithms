/*************************************************************************************************************
🪙GeeksforGeeks - Pattern 7
Geek is very fond of patterns. Once, his teacher gave him a pattern to solve. He gave Ram an integer n and 
asked him to build a pattern.
Input: 5
Output:
    *
   ***  
  *****
 *******
*********
Explanation:
Complete the function printTriangle() which takes an integer n  as the input parameter and prints the pattern.
*************************************************************************************************************/
class Solution {
    void printTriangle(int n) {
        for (int i = 1; i <= n; i++) {
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
    }
}

