/*************************************************************************************************************
🪙GeeksforGeeks - Power Of Numbers
Given a number n, find the value of n raised to the power of its own reverse
Note: The result will always fit into a 32-bit signed integer.
Input: n = 2
Output: 4
Explanation: The reverse of 2 is 2, and 2^2 = 4.
*************************************************************************************************************/

class Solution {
    public int reverseExponentiation(int n) {
        int Base = n;             // Store the original number as base
        int ReversedPower = 0;    // This will hold the reversed digits of n
        int Result = 0;           // This will store the final result
        // Reverse the digits of n
        while(n > 0){
            int LastDigit = n % 10;                         // Get the last digit
            ReversedPower = ReversedPower * 10 + LastDigit; // Append digit to reversed number
            n = n / 10;                                     // Remove the last digit
        }
        // Calculate base raised to the power of the reversed number
        Result = (int)Math.pow(Base, ReversedPower);
        return Result; 
    }
}


