/*************************************************************************************************************
💎LeetCode 172 - Factorial Trailing Zeroes
🪙GeeksforGeeks - Trailing zeroes in factorial
Given an integer n, return the number of trailing zeroes in n!
Note: That n! = n * (n - 1) * (n - 2) * ... * 3 * 2 * 1
Input: n = 3
Output: 0
Explanation: 3! = 6, no trailing zero
Input: n = 5
Output: 1
Explanation: 5! = 120, one trailing zero
*************************************************************************************************************/

class Solution {
    public int trailingZeroes(int n) {
        int count = 0;
        while (n > 0) {
            n = n / 5;          // Divide n by 5 to count how many multiples of 5 are present
            count = count + n;  // Add the result to count (to include higher powers of 5)
        }
        return count;           // Return total number of trailing zeroes in n!
    }
}

