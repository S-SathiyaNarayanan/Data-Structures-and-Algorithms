class Solution {
    static long squaresDiff(int N){
        long sumOfSquares = (long) N * (N + 1) * (2 * N + 1) / 6;
        long sumOfFirst = (long) N * (N + 1) / 2;
        long squareOfSum = sumOfFirst * sumOfFirst;
        long result = Math.abs(sumOfSquares - squareOfSum);
        return result;
    }
} 
