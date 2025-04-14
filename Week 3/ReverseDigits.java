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
        // Code here
        int ReversedNumber=0;
        while(n>0){
            int LastDigit=n%10;    // Get the last digit
            ReversedNumber=ReversedNumber*10+LastDigit;    // Append it to reversed number
            n=n/10;
        }
        return ReversedNumber;
    }
}
