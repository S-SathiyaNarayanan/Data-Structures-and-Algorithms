/*************************************************************************************************************
💎LeetCode 204 - Count Primes
Fizz Buzz Problem involves that given an integer n, for every integer 0 < i <= n, the task is to output,
"FizzBuzz" if i is divisible by 3 and 5,
"Fizz" if i is divisible by 3,
"Buzz" if i is divisible by 5,
"i" as a string, if none of the conditions are true.
Return an array of strings.
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
