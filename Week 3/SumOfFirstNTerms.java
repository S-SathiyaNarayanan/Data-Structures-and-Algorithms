// Solution 1 - Using Mathematical Formula
class Solution {
    int sumOfSeries(int n) {
        // Calculate the sum of first n natural numbers using the formula n(n+1)/2
        int sum = (n * (n + 1)) / 2;
        // Return the square of the sum, which is equal to "the sum of cubes of first n natural numbers"
        return sum * sum;
    }
}

// Solution 2 - Brute Force Approach
class Solution {
    int sumOfSeries(int n) {
        int sum = 0;
        
        // Loop through 1 to n and add the cube of each number to the sum
        for (int i = 1; i <= n; i++) {
            sum = sum + (int)Math.pow(i, 3);  // Calculate i^3 and add it to the sum
        }
        
        // Return the total sum of cubes
        return sum;
    }
}
