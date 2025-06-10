/*************************************************************************************************************
🪙GeeksforGeeks - Reverse an Array
You are given an array of integers arr[]. Your task is to reverse the given array.
Input: arr = [1, 4, 3, 2, 6, 5]
Output: [5, 6, 2, 3, 4, 1]
Explanation: Modify the array in place.
*************************************************************************************************************/

class Solution {
    public int removeDuplicates(int[] arr) {
        // Initialize NI (New Index) to 1 because the first element is always considered unique
        int NI = 1;
        // Start looping from the second element (index 1) to the end of the array
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {    // Compare current element with previous element
                // If current element is not equal to previous element, it's a unique element
                arr[NI] = arr[i];          // Assign it to the NI position in the array
                NI++;                      // Increment NI to point to the next position for next unique element
            }
            // If duplicate is found, skip it ( "NI" doesn't move, "i" increments automatically )
        }
        return NI;    // Return the count of unique elements ( The length of the updated array without duplicates )
    }
}

