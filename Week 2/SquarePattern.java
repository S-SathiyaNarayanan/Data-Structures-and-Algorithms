/*************************************************************************************************************
🪙GeeksforGeeks - Pattern 1
Geek is very fond of patterns. Once, his teacher gave him a square pattern to solve. He gave Geek an integer n
and asked him to build a pattern. 
Input:
n = 5
Output:
* * * * *
* * * * *
* * * * *
* * * * *
* * * * *
Explanation:
You don't need to input anything. Complete the function printSquare() which takes  an integer n  as the input
parameter and print the pattern.
*************************************************************************************************************/

class Solution {
    void printSquare(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
