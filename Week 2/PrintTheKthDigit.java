/*************************************************************************************************************
🪙GeeksforGeeks - Print the Kth Digit
Given two numbers a and b, find k th digit from right of a power b.
Input: a = 3, b = 3, k = 1
Output: 7
Explanation: 33 = 27 and 1st digit from right is 7
*************************************************************************************************************/
// Solution 1
class Solution {
    static long kthDigit(int a, int b, int k) {
        long LastDigit = 0;
        // Calculate a^b using Math.pow(), which returns a double
        long N = (long) Math.pow(a, b);    // we cast it to long to remove the decimal part
        // Extract digits from the end one by one until we reach the kth digit
        for (int i = 1; i <= k; i++) {
            LastDigit = N % 10;    // Get the last digit of N
            N = N / 10;    // Remove the last digit from N
        }
        return LastDigit;    // Returns the kth digit from the right 
    }
}



