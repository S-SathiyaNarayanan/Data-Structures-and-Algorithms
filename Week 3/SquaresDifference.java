/*************************************************************************************************************
🪙GeeksforGeeks - Squares Difference
Given an integer N, find the absolute difference between sum of the squares of first N natural numbers and 
square of sum of first N natural numbers
Input: N = 3
Output: 22
Explanation: abs|(1^2 + 2^2 + 3^2) - (1 + 2 + 3)^2| = 22
*************************************************************************************************************/

class Solution {
    static long squaresDiff(int N){
        // Calculate the sum of squares of first N natural numbers using the formula: N(N+1)(2N+1)/6
        long sumOfSquares = (long) N * (N + 1) * (2 * N + 1) / 6;    
        // Calculate the sum of first N natural numbers using the formula: N(N+1)/2
        long sumOfFirst = (long) N * (N + 1) / 2;
        // Calculate the square of the sum of first N natural numbers
        long squareOfSum = sumOfFirst * sumOfFirst;
        // Calculate & return the absolute difference between the sum of squares and the square of the sum
        long result = Math.abs(sumOfSquares - squareOfSum);
        return result;
    }
} 
