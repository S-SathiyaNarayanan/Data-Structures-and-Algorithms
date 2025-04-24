/*************************************************************************************************************
🪙GeeksforGeeks - Sum of fifth powers of the first n natural numbers
Given a number N. Find the sum of fifth powers of natural numbers till N i.e. 1^5+2^5+3^5+..+N^5
Input:
N =3
Output:
276
Explanation:
The sum is calculated as 1^5+2^5+3^5 = 1+32+243 = 276.
*************************************************************************************************************/

// Solution 1 - Formula Approach
class Solution {
    long sumOfFifthPowers(long N) {
        long sum=((N*N)*((N+1)*(N+1))*((2*N*N)+(2*N)-1))/12;
        return sum;
    }
}

// Solution 2 - Iterative Approach
class Solution {
    long sumOfFifthPowers(long N) {
        long sum=0;
        for(int i=1;i<=N;i++){
            sum=sum+(long)Math.pow(i,5);
        }
        return sum;
    }
}
