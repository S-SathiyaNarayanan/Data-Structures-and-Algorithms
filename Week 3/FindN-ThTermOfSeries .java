/*************************************************************************************************************
🪙GeeksforGeeks - Find n-th term of series 1, 3, 6, 10, 15, 21
Given a number n, find the nth term in the series 1, 3, 6, 10, 15, 21…
Input: n = 4 
Output: 10
Explanation: The 4th term of the Series is 10.
Input: n = 3 
Output: 6
Explanation: The 3rd term of the Series is 6.
*************************************************************************************************************/

// Solution 1 - Mathematical Formula Approach
class Solution {
    static int findNthTerm(int n) {
        return n*(n+1)/2;
    }
}

// Solution 2 - 
class Solution {
    static int findNthTerm(int n) {
        int sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        return sum;
    }
}
