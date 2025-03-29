/*************************************************************************************************************
🪙GeeksforGeeks - Corner Digits Sum
Given a number N, find the sum of first and last digit of N.
Input: N = 12345
Output: 6
Explanation: 1st and last digits are 1 and 5.
*************************************************************************************************************/

class Solution
{
    public int corner_digitSum(int n)
    {
        int lastDigit = n % 10;    // Get the last digit by taking modulus 10
        int firstDigit = n;        // Initialize firstDigit with the given number  

        // Extract the first digit by repeatedly dividing by 10
        while (firstDigit >= 10) {
            firstDigit /= 10;      // Remove the last digit in each step
        }

        return firstDigit + lastDigit;    // Return the sum of the first and last digits
    }
}
