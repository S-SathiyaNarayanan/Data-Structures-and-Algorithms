/*************************************************************************************************************
🪙GeeksforGeeks - Count Digits
Given a positive integer n, count the number of digits in n that divide n evenly (i.e., without leaving a 
remainder). Return the total number of such digits. 
A digit d of n divides n evenly if the remainder when n is divided by d is 0 (n % d == 0). Digits of n should 
be checked individually. If a digit is 0, it should be ignored because division by 0 is undefined.
Input: n = 12
Output: 2
Explanation: 1, 2 when both divide 12 leaves remainder 0
Input: n = 2446
Output: 1
Explanation: Here among 2, 4, 6 only 2 divides 2446 evenly while 4 and 6 do not
*************************************************************************************************************/

class Solution {
    static int evenlyDivides(int n) {
        int ON=n;
        int count=0;
        while(n>0){
            int LD=n%10;
            if(LD!=0 && ON%LD==0) count++;
            n=n/10;
        }
        return count;
    }
}
