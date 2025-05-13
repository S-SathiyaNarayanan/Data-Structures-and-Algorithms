/*************************************************************************************************************
🪙GeeksforGeeks - First and Second Smallests
Given an array, arr of integers, your task is to return the smallest and second smallest element in the array.
If the smallest and second smallest do not exist, return -1.
Input: arr[] = [2, 4, 3, 5, 6]
Output: 2 3 
Explanation: 2 and 3 are respectively the smallest and second smallest elements in the array.
*************************************************************************************************************/

// Works For :-
// Arrays with positive numbers
// Arrays with negative numbers
// Arrays with duplicate values
// Arrays where no second smallest exists
// WARNING - You might want to handle arrays of size less than 2 case explicitly
class Solution {
    public int[] minAnd2ndMin(int arr[]) {
        if (arr.length < 2) return new int[]{-1}; // Handle arrays with less than 2 elements
        int FM = arr[0];               // Assume first element is the minimum initially
        int SM = Integer.MAX_VALUE;    // Initialize Second Minimum to the largest possible integer value

        for (int i = 1; i < arr.length; i++) {  // Iterate from second element
            if (arr[i] < FM) {
                SM = FM;        // Update SM to previous FM if current element is smaller
                FM = arr[i];    // Update FM to current element
            } else if (arr[i] != FM && arr[i] < SM) {
                SM = arr[i];    // Update SM if current is greater than FM but smaller than current SM
            }
        }

        if (SM == Integer.MAX_VALUE) return new int[]{-1}; // If SM was never updated, no valid second min
        return new int[]{FM, SM};                          // Return the minimum and second minimum
    }
}
