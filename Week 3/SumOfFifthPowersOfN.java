// Solution 1 -
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
