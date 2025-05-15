/*************************************************************************************************************
🪙GeeksforGeeks - First and Second Smallests
Given an array, arr of integers, your task is to return the smallest and second smallest element in the array.
If the smallest and second smallest do not exist, return -1.
Input: arr[] = [2, 4, 3, 5, 6]
Output: 2 3 
Explanation: 2 and 3 are respectively the smallest and second smallest elements in the array.
*************************************************************************************************************/
Variant A (> FS) is crystal-clear about “take only strictly larger values than the current minimum.”
// Solution 1 - one pass algorithm - arr[i] != FS
// Works For :-
// Arrays with positive numbers
// Arrays with negative numbers
// Arrays with duplicate values
// Arrays where no second smallest exists
// WARNING - You might want to handle arrays of size less than 2 case explicitly
class Solution {
    public int[] minAnd2ndMin(int arr[]) {
        int FS = arr[0];               // Initialize first smallest (FS) to the first element of the array
        int SS = Integer.MAX_VALUE;    // Initialize second smallest (SS) to the maximum integer value
        for (int i = 1; i < arr.length; i++) {    // Start iterating from the second element (index 1)
            if (arr[i] < FS) {    
                SS = FS;        // Update SS to previous FS if current element is smaller than FS
                FS = arr[i];    // Update FS to current element
            } else if (arr[i] != FS && arr[i] < SS) {    // skip any duplicate of the minimum and then picks the next-smallest unique value
                SS = arr[i];    // Update SS if current element is not equal to FS and smaller than current SS
            }
        }
        if (SS == Integer.MAX_VALUE) return new int[]{-1};    // If SS was never updated, no second smallest exists
        return new int[]{FS, SS};                             // Return the smallest and second smallest elements
    }
}

// Solution 2 – one pass algorithm – arr[i] > FS
// Works For :-
//  Arrays with positive numbers
//  Arrays with negative numbers
//  Arrays with duplicate values
//  Arrays where no second smallest exists
// WARNING – You might want to handle arrays of size < 2 explicitly
class Solution {
    public int[] minAnd2ndMin(int arr[]) {
        int FS = arr[0];               // Initialize first smallest (FS) to the first element
        int SS = Integer.MAX_VALUE;    // Initialize second smallest (SS) to max int value
        for (int i = 1; i < arr.length; i++) {    // Iterate from the second element onward
            if (arr[i] < FS) {
                SS = FS;        // Current FS becomes SS if we find a new smaller FS
                FS = arr[i];    // Update FS to the new minimum
            } else if (arr[i] > FS && arr[i] < SS) {    // take only strictly larger values than the current minimum
                SS = arr[i];    // Update SS when arr[i] is > FS and < current SS
            }
        }
        if (SS == Integer.MAX_VALUE) {
            return new int[]{-1};    // If SS was never updated, no second smallest exists
        }
        return new int[]{FS, SS};    // Return the smallest and second smallest elements
    }
}

