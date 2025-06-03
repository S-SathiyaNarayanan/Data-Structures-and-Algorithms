/*************************************************************************************************************
🪙GeeksforGeeks - Pattern 1
Geek is very fond of patterns. Once, his teacher gave him a square pattern to solve. He gave Geek an integer n
and asked him to build a pattern. 
Input:
N = 3
Output:
* ** ***
Explanation:
First, print 1 asterisk then space after that print 2 asterisk and space after that  print 3 asterisk now 
stop as N is 3.
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
