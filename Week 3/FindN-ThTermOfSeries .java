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
        return n*(n+1)/2;    // Using the formula for the sum of the first n natural numbers n * (n + 1) / 2
    }
}

// Solution 2 - Iterative Approach (Loop-based Summation)
class Solution {
    static int findNthTerm(int n) {
        int sum=0;    // Initialize sum to accumulate the series
        for(int i=1;i<=n;i++){
            sum=sum+i;    // Add each number from 1 to n to the sum
        }
        return sum;    // Return the final sum, which is the n-th term
    }
}
