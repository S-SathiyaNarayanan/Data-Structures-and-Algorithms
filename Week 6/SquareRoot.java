/*************************************************************************************************************
🪙GeeksforGeeks - Square Root
Given a positive integer n find the square root of n. If n is not a perfect square then return the floor value
Note: Floor value of any number is the greatest Integer which is less than or equal to that number
Input: n = 4
Output: 2
Explanation: Since, 4 is a perfect square, so its square root is 2
*************************************************************************************************************/

// Solution 1 - Using Binary Search 





// Solution 2 - Using Linear Search 
// Time Complexity: O(√n)
class Solution {
    int floorSqrt(int n) {
        int Result=0;
        for(int i=1;i*i<=n;i++){
            Result=i;
        }
        return Result;
    }
}

// Solution 3 - Using Math.sqrt() method
class Solution {
    int floorSqrt(int n) {
        int Result=(int)Math.sqrt(n);
        return Result;
    }
}
