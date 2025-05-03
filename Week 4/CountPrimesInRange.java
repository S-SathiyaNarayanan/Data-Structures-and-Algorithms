/*************************************************************************************************************
🪙GeeksforGeeks - Count Primes In Range
Given a positive integer n, calculate and return all prime numbers less than or equal to n using the Sieve of
Eratosthenes algorithm.
A prime number is a natural number greater than 1 that has no positive divisors other than 1 and itself.
Input : n = 10
Output: 2 3 5 7
Explanation: Prime numbers less than equal to 10 are 2 3 5 and 7
*************************************************************************************************************/

// Solution 1 - Sieve of Eratosthenes O(nloglogn)
class Solution {
    int countPrimes(int L, int R) {
        int count=0;
        int n=R;
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
        for(int i=L;i<=R;i++){
            if(arr[i]) count++;
        }
        return count;
    }
}
