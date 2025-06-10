/*************************************************************************************************************
💎LeetCode 26 - Remove Duplicates from Sorted Array
🪙GeeksforGeeks - Remove Duplicates Sorted Array
Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each 
unique element appears only once. The relative order of the elements should be kept the same. Then return the 
number of unique elements in nums.
Input: nums = [0,0,1,1,1,2,2,3,3,4]
Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 
respectively. It does not matter what you leave beyond the returned k (hence they are underscores).
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

