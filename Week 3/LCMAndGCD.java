/*************************************************************************************************************
🪙GeeksforGeeks - LCM And GCD
Given two positive integers a and b, find GCD of a and b.
Note: Don't use the inbuilt gcd function
Input: a = 3, b = 6
Output: 3
Explanation: GCD of 3 and 6 is 3
Input: a = 1, b = 1
Output: 1
Explanation: GCD of 1 and 1 is 1
*************************************************************************************************************/

class Solution {
    public static int[] lcmAndGcd(int a, int b) {
        // Store original values of a and b for LCM calculation
        int x = a;
        int y = b;
        // Use Euclidean algorithm to find GCD
        while (b != 0) {
            int temp = b;     // Temporarily store the value of b
            b = a % b;        // Update b to the remainder of a divided by b
            a = temp;         // Update a to the previous value of b
        }
        int GCD = a;  
        int LCM = (int)((long)x * (long)y) / GCD;    // Calculate LCM using the formula: (x * y) / GCD
        return new int[]{LCM, GCD};
    }
}

