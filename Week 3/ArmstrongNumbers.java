/*************************************************************************************************************
🪙GeeksforGeeks - Armstrong Numbers
You are given a 3 digit number n, Find whether it is an Armstrong number or not
Note: An Armstrong number of three digits is a number such that the sum of the cubes of its digits is equal to
the number itself. 371 is an Armstrong number since 3^3 + 7^3 + 1^3 = 371 
Input: n = 153
Output: true
Explanation: 153 is an Armstrong number since 1^3 + 5^3 + 3^3 = 153 
Input: n = 372
Output: false
Explanation: 372 is not an Armstrong number since 3^3 + 7^3 + 2^3 = 378 
*************************************************************************************************************/

// Solution 1 - Using Hard Coded Approach 
class Solution {
    static boolean armstrongNumber(int n) {
        // Extract the hundred's place digit
        int ThirdPlace = n / 100;

        // Extract the ten's place digit
        int SecondPlace = (n / 10) % 10;

        // Extract the unit's (one's) place digit
        int FirstPlace = n % 10;

        // Calculate the sum of the cubes of the digits
        int AN = (ThirdPlace * ThirdPlace * ThirdPlace) + 
                 (SecondPlace * SecondPlace * SecondPlace) + 
                 (FirstPlace * FirstPlace * FirstPlace);

        // Check if the sum of the cubes is equal to the original number
        return (AN == n);
    }
}


// Solution 2 - Using Iterative Approach
class Solution {
    static boolean armstrongNumber(int n) {
        int OriginalNumber = n;                 // Store the original number for later comparison
        int size = String.valueOf(n).length();  // Calculate the number of digits in the number
        int sum = 0;           
        // Loop through each digit of the number
        while (n > 0) {
            int LastDigit = n % 10;                       // Extract the last digit
            sum = sum + (int) Math.pow(LastDigit, size);  // Add the digit raised to the power of 'size' to sum
            n = n / 10;                                   // Remove the last digit from the number
        }
        // Check if the sum of powers is equal to the original number
        boolean isArmstrongNumber = (OriginalNumber == sum);
        return isArmstrongNumber;
    }
}

