// Actual Logic but this approach is Inefficient
class Solution {
    static int trailingZeroes(int n) {
        int fact=1;
        int count=0;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        while(fact>0){
            int LastDigit=fact%10;
            if(LastDigit==0){
                count++;
            }
            fact=fact/10;
        }
        return count;
    }
}

// Optimized correct Solution
class Solution {
    static int trailingZeroes(int n) {
        int count = 0;
        // Keep dividing n by 5 and add the quotient to count
        // This counts how many times 5 is a factor in the numbers from 1 to n
        // Each 5 (paired with a 2) contributes to a trailing zero in n!
        while (n > 0) {
            n = n / 5;
            count = count + n;
        }
        // Return the total number of trailing zeroes in n!
        return count;
    }
}
