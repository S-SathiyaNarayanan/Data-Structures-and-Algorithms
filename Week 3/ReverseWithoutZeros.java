/*************************************************************************************************************
💎LeetCode 7 - Reverse Integer
Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go 
outside the signed 32-bit integer range [-2^31, 2^31 - 1], then return 0.
Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
Input : x = 123
Output: 321
*************************************************************************************************************/













/*************************************************************************************************************
🪙GeeksforGeeks - Reverse digits
You are given an integer n. Your task is to reverse the digits, ensuring that the reversed number has no 
leading zeroes.
Input : n = 200
Output: 2
Explanation: By reversing the digits of number, number will change into 2.
*************************************************************************************************************/
class Solution {
    public int reverseDigits(int n) {
        int ReversedNumber=0;    // Initialize the value of ReversedNumber as 0
        while(n>0){
            int LastDigit=n%10;    // Get the last digit
            ReversedNumber=ReversedNumber*10+LastDigit;    // Append it to reversed number
            n=n/10;    // Remove the last digit
        }
        // Value of n becomes 0
        return ReversedNumber;   
    }
}
