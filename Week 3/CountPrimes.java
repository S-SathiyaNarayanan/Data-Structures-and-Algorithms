/*************************************************************************************************************
💎LeetCode 204 - Count Primes
Given an integer n, return the number of prime numbers that are strictly less than n
Input: n = 10
Output: 4
Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7
*************************************************************************************************************/

class Solution {
    public int countPrimes(int n) {
        int count=0;
        if(n<2) return count;
        boolean[] arr=new boolean[n+1];
        Arrays.fill(arr,true);
        arr[0]=false;
        arr[1]=false;
        for(int i=2;i*i<=n;i++){
            if(arr[i]){
                for(int j=i*i;j<=n;j=j+i){
                    arr[j]=false;
                }
            }
        }
        for(int i=2;i<n;i++){
            if(arr[i]) count++;
        }
        return count;
    }
}
