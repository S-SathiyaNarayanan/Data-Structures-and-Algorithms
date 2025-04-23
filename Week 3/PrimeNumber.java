/*************************************************************************************************************
🪙GeeksforGeeks - Prime Number
Given a number n, determine whether it is a prime number or not. 
Input: n = 7
Output: true
Explanation: 7 has exactly two divisors: 1 and 7, making it a prime number.
Input: n = 1
Output: false
Explanation: 1 has only one divisor (1 itself), which is not sufficient for it to be considered prime.
*************************************************************************************************************/

// Solution 1 - Uses i * i <= n
// WARNING: Potential integer overflow in loop condition
// i*i becomes negative when i > 46340 (sqrt(Integer.MAX_VALUE))
// This can cause infinite loops for large primes near 2^31-1
class Solution {
    static boolean isPrime(int n) {
        if(n<=1) return false;
        if(n==2) return true;
        if(n%2==0) return false;
        for(int i=3;i*i<=n;i=i+2){
            if(n%i==0) return false;
        }
        return true;
    }
}

// Solution 2 - Uses Math.sqrt(n)
class Solution {
    static boolean isPrime(int n) {
        if (n <= 1) return false;        // Check if n is less than or equal to 1 (not prime)
        if (n == 2) return true;         // 2 is the only even prime number 
        if (n % 2 == 0) return false;    // Eliminate even numbers greater than 2
        // Precompute square root once to:
        // 1. Avoid expensive sqrt calculation in each iteration
        // 2. Prevent integer overflow that can occur with i*i in loop condition
        int sqrtN = (int) Math.sqrt(n);  // Calculate square root of n to reduce number of iterations
        // Check only odd divisors from 3 up to sqrt(n) using precomputed value
        for (int i = 3; i <= sqrtN; i += 2) {    // This is safe for all n <= Integer.MAX_VALUE (2^31-1)
            if (n % i == 0) return false;  // If any divisor is found, n is not prime
        }
        return true;  // If no divisors found, n is prime
    }
}

