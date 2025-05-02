/*************************************************************************************************************
🪙GeeksforGeeks - Palindrome Array
Given an array arr, the task is to find whether the arr is palindrome or not. If the arr is palindrome then 
return true else return false.
An array is said to be palindrome if its reverse array matches the original array. 
Input: arr = [1, 2, 3, 4, 5]
Output: false
Explanation: Here we can see we have [1, 2, 3, 4, 5] if we reverse it we find [5, 4, 3, 2, 1] which is the not
same as before. So, the answer false.
*************************************************************************************************************/

class Solution {
    public static boolean isPerfect(int[] arr) {
        int n = arr.length;                  // Get the length of the array
        for (int i = 0; i < n / 2; i++) {    // Iterate from start to the middle of the array (exclusive)
            // In a palindrome, we only need to compare mirrored pairs
            // For odd sized arrays, the middle element doesn't need a pair check
            // i < n/2 avoids unnecessary comparisons and ensures cleaner logic
            if (arr[i] != arr[n - i - 1])    // Compare element from start with corresponding element from end
                return false;                // If any pair doesn't match, array is not a palindrome
        }
        return true;                         // If all pairs match, array is a palindrome (perfect)
    }
}

