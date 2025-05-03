/*************************************************************************************************************
🪙GeeksforGeeks - Count Primes In Range
Given two numbers L and R(L<R). Count all the prime numbers in the range [L, R]
Input : L=1,R=10
Output: 4
Explanation : There are 4 primes in this range, which are 2,3,5 and 7
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
