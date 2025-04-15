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
class Solution {
    public static int gcd(int a, int b) {
        // code here
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}

