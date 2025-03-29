/*************************************************************************************************************
🪙GeeksforGeeks - Print the Kth Digit
Given two numbers a and b, find k th digit from right of a power b.
Input: a = 3, b = 3, k = 1
Output: 7
Explanation: 33 = 27 and 1st digit from right is 7
*************************************************************************************************************/

class Solution {
    static long kthDigit(int a, int b, int k) {
        // Calculate a^b using Math.pow(), which returns a double
        // We explicitly cast it to long to handle large values correctly
        long result = (long) Math.pow(a, b);
        
        // Extract the k-th digit from the right
        // We repeatedly divide by 10 (k-1) times to remove rightmost digits
        for (int i = 1; i < k; i++) {
            result = result / 10;
        }
        
        // Return the last remaining digit after shifting
        return result % 10;
    }
}

