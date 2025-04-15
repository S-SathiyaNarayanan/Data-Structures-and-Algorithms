/*************************************************************************************************************
🪙GeeksforGeeks - Sum of Natural Numbers
Given an integer n, your task is to compute the sum of all natural numbers from 1 to n (inclusive). If n is 0,
the sum should be 0.
Input: n = 1
Output: 1
Explanation: For n = 1, the sum will be 1
*************************************************************************************************************/

// Solution 1 - Sum of Natural numbers formula (n*(n+1))/2
class Solution {
    public static int seriesSum(int n) {
        return (n*(n+1))/2;
    }
}

// Solution 2
class Solution {
    public static int seriesSum(int n) {
        int sum=0;
        for(int i=0;i<=n;i++){
            sum=sum+i;
        }
        return sum;
    }
}
