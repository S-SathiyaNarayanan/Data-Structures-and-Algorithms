// Solution 1 -
class Solution {
    long sumOfFifthPowers(long N) {
        // code here
        long sum=((N*N)*((N+1)*(N+1))*((2*N*N)+(2*N)-1))/12;
        return sum;
    }
}
// Solution 2 - 
class Solution {
    long sumOfFifthPowers(long N) {
        long sum=0;
        for(int i=1;i<=N;i++){
            sum=sum+(long)Math.pow(i,5);
        }
        return sum;
    }
}
