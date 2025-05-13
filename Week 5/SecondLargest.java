/*************************************************************************************************************
🪙GeeksforGeeks - Second Largest
Given an array of positive integers arr[], return the second largest element from the array. If the second 
largest element doesn't exist then return -1.
Input: arr[] = [12, 35, 1, 10, 34, 1]
Output: 34
Explanation: The largest element of the array is 35 and the second largest element is 34.
*************************************************************************************************************/

class Solution {
    public int getSecondLargest(int[] arr) {
        int FL = arr[0];    // Initialize the first largest (FL) with the first element
        int SL = -1;        // Initialize the second largest (SL) with -1 (assuming all elements are non-negative)
        for (int i = 1; i < arr.length; i++) {    // Start iterating from the second element (index 1)
            if (arr[i] > FL) {
                SL = FL;        // Update SL to previous FL if current element is greater than FL
                FL = arr[i];    // Update FL to current element
            } else if (arr[i] < FL && arr[i] > SL) {
                SL = arr[i];    // Update SL if current element is less than FL but greater than current SL
            }
        }
        return SL;    // Return the second largest element
    }
}

