/*************************************************************************************************************
💎LeetCode 204 - Count Primes
Given an integer n, return the number of prime numbers that are strictly less than n
Input : n = 20
Output: [“1”, “2”, “Fizz”, “4”, “Buzz”, “Fizz”, “7”, “8”, “Fizz”, “Buzz”, “11”, “Fizz”, “13”, “14”, “FizzBuzz”,
“16”, “17”, “Fizz”, “19”, “Buzz”]
*************************************************************************************************************/

class Solution {
    public int countPrimes(int n) {
        int count=0;
        ArrayList<Integer> PN=new ArrayList<>();
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
