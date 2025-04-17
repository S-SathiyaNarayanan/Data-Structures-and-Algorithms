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
        int Base=n;
        int ReversedPower=0;
        int Result=0;
        while(n>0){
            int LastDigit=n%10;
            ReversedPower=ReversedPower*10+LastDigit;
            n=n/10;
        }
        Result=(int)Math.pow(Base,ReversedPower);
        return Result;
    }
}

