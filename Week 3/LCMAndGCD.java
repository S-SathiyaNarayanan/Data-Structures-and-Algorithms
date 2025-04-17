/*************************************************************************************************************
🪙GeeksforGeeks - LCM And GCD
Given two integers a and b, the task is to compute their LCM and GCD and return an array containing their LCM 
and GCD
Input: a = 5 , b = 10
Output: [10, 5]
Explanation: LCM of 5 and 10 is 10, while their GCD is 5
Input: a = 14 , b = 8
Output: [56, 2]
Explanation: LCM of 14 and 8 is 56, while their GCD is 2
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

