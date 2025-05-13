/*************************************************************************************************************
🪙GeeksforGeeks - Second Largest
Given an array of positive integers arr[], return the second largest element from the array. If the second 
largest element doesn't exist then return -1.
Input: arr[] = [12, 35, 1, 10, 34, 1]
Output: 34
Explanation: The largest element of the array is 35 and the second largest element is 34.
*************************************************************************************************************/

// Works For :-
// Arrays with positive numbers
// Arrays with negative numbers
// Arrays with duplicate values
// Arrays where no second largest exists
// WARNING - You might want to handle arrays of size less than 2 case explicitly
class Solution {
    public int getSecondLargest(int[] arr) {
        int FL = arr[0];               // Assume the first element is the largest initially 
        int SL = Integer.MIN_VALUE;    // Initialize Second Largest to the smallest possible integer value 
        for (int i = 1; i < arr.length; i++) {    // Start iterating from the second element (index 1)
            if (arr[i] > FL) {
                SL = FL;        // Update SL to previous FL if current element is greater than FL
                FL = arr[i];    // Update FL to current element
            } else if (arr[i] < FL && arr[i] > SL) {
                SL = arr[i];    // Update SL if current element is less than FL but greater than current SL
            }
        }
        if(SL==Integer.MIN_VALUE) return -1;    // If SL was never updated, no second largest exists
        return SL;                              // Return the second largest element if it exists
    }
}

