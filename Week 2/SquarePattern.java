/*************************************************************************************************************
🪙GeeksforGeeks - Pattern Printing
Given a number N. The task is to print a series of asterisk(*) from 1 till N terms with increasing order and 
difference being 1.
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
