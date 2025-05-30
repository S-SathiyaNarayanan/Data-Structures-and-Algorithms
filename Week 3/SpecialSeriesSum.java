/*************************************************************************************************************
🪙GeeksforGeeks - Special Series Sum
Given the value of n, we need to find the sum of the series where i-th term is sum of first i natural numbers
Note: Sum of the series 1 + (1+2) + (1+2+3) + (1+2+3+4) + …… + (1+2+3+4+…+n)
Input: n = 5
Output: 35 
Explanation: 1 + (1+2) + (1+2+3).. = 35. Hence sum of the series is 35
Input: n = 10
Output: 220
Explanation: 1 + (1+2) + (1+2+3) + (1+2+3+4) + (1+2+3+4+5)... = 220. Hence sum of the series is 220
*************************************************************************************************************/

// Solution 1 - Formula Approach ( Sum of the First n triangular numbers ) 
class Solution {
    static long sumOfTheSeries(long n){
        return (n*(n+1)*(n+2))/6;
    }
}

// Solution 2 - Formula Approach ( Nth triangular number )
class Solution {
    static long sumOfTheSeries(long n){
        long sum=0;
        for(int i=1;i<=n;i++){
            sum= sum+ (i*(i+1)/2);
        }
        return sum;
    }
}

// Solution 3 - Brute Force Approach
class Solution {
    static long sumOfTheSeries(long n){
        int count=0;
        long sum=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                count++;
            }
            sum=sum+count;
        }
        return sum;
    }
}
