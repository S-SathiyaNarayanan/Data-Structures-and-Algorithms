
// Solution 1 - 


// Solution 2 - Brute Force Approach
class Solution {
    int sumOfSeries(int n) {
        int sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+(int)Math.pow(i,3);
        }
        return sum;
    }
}
