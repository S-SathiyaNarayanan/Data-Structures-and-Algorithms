/*************************************************************************************************************
🪙GeeksforGeeks - GCD of two numbers
Given two positive integers a and b, find GCD of a and b.
Note: Don't use the inbuilt gcd function
Input: a = 3, b = 6
Output: 3
Explanation: GCD of 3 and 6 is 3
Input: a = 1, b = 1
Output: 1
Explanation: GCD of 1 and 1 is 1
*************************************************************************************************************/

// Solution 1 - Euclidean algorithm  
// Euclidean algorithm principle is GCD(a, b) = GCD(b, a % b)
class Solution {
    public static int gcd(int a, int b) {
        // Loop runs until b becomes 0
        while(b!=0){
            int temp = b;  // Store the current value of b in a temporary variable
            b = a % b;     // Update b to the remainder of a divided by b  
            a = temp;      // Assign the previous value of b (stored in temp) to a
        }
        // When b becomes 0, a contains the GCD
        return a;
    }
}

