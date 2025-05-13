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
        int FS = arr[0];               // Assume the first element is the smallest initially
        int SS = Integer.MAX_VALUE;    // Initialize Second Smallest to the largest possible integer value
        for (int i = 1; i < arr.length; i++) {    // Start iterating from the second element (index 1)
            if (arr[i] < FS) {
                SS = FS;        // Update SS to previous FS if current element is smaller than FS
                FS = arr[i];    // Update FS to current element
            } else if (arr[i] != FS && arr[i] < SS) {
                SS = arr[i];    // Update SS if current element is not equal to FS and smaller than current SS
            }
        }

        if (SS == Integer.MAX_VALUE) return new int[]{-1};    // If SS was never updated, no second smallest exists
        return new int[]{FS, SS};                             // Return the smallest and second smallest elements
    }
}
