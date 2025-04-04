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
        // If the number is a single digit number, return it directly
        if(n <= 9){
            return n;
        }

        int LastDigit = n % 10;        // Get the last digit by taking modulus 10
        int FirstDigit = n;         // Initialize FirstDigit with the original number

        // Loop to extract the first digit by continuously dividing by 10
        while(FirstDigit >= 10){
            FirstDigit = FirstDigit / 10;        // Remove the last digit in each step
        }

        return FirstDigit + LastDigit;        // Return the sum of the first and last digits
    }
}
