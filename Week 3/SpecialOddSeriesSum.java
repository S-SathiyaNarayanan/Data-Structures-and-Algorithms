/*************************************************************************************************************
🪙GeeksforGeeks - Special Odd Series Sum
Given the value of n, we need to find the sum of the series where i-th term is sum of first i odd natural 
numbers
NOTE: Sum of the series 1 + (1+3) + (1+3+5) + (1+3+5+7) + …… + (1+3+5+7+…+(2n-1))
Input: n = 2
Output: 5 
Explanation: 1 + (1+3) = 5. Hence sum of the series is 5.
Input: n = 5
Output: 55
Explanation: 1 + (1+3) + (1+3+5) + (1+3+5+7) + (1+3+5+7+9) = 55. Hence sum of the series is 55.
*************************************************************************************************************/

// Solution 1 - Formula Approach ( Sum of squares of the first n natural numbers )
class Solution {
    static long sumOfTheSeries(long n){
        long sum=(n*(n+1)*(2*n+1))/6;
        return sum;
    }
}

// Solution 2 - Iterative Approach
class Solution {
    static long sumOfTheSeries(long n){
        long sum = 0;
        for (long i = 1; i <= n; i++) {
            sum += i * i;
        }
        return sum;
    }
}

