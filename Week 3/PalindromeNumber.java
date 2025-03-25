/*************************************************************************************************************
💎LeetCode 9 - Palindrome Number 
🪙GeeksforGeeks - Palindrome
You are given an integer N. Your task is to determine whether it is a palindrome.
Input: N = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121- and it is not a palindrome
*************************************************************************************************************/
public class PalindromeNumber {
    public static void main(String[] args) {
        int N = 121; // Change this number to test different values
        int OriginalNumber = N;
        int ReversedNumber = 0;

        while (N > 0) {
            int digit = N % 10;  // Get the last digit
            ReversedNumber = ReversedNumber * 10 + digit;  // Append it to reversed number
            N = N / 10;  // Remove the last digit
        }

        if (OriginalNumber == ReversedNumber) {
            System.out.println(OriginalNumber + " is a palindrome.");
        } else {
            System.out.println(OriginalNumber + " is not a palindrome.");
        }
        // Value of N becomes 0
    }
}

