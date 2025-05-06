/*************************************************************************************************************
💎LeetCode 704 - Binary Search
Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to 
search target in nums. If target exists, then return its index. Otherwise, return -1.
You must write an algorithm with O(log n) runtime complexity.
Input: nums = [-1,0,3,5,9,12], target = 9
Output: 4
Explanation: 9 exists in nums and its index is 4
*************************************************************************************************************/

class Solution {
    public int search(int[] nums, int target) {
        int Left = 0; // Left is the index at the start of the array
        int Right = nums.length - 1; // Right is the index at the end of the array

        while (Left <= Right) { // Repeat the steps while the search range is valid
            int Mid = Left + ((Right - Left) / 2); // Find the middle index between Left and Right

            if (nums[Mid] == target) return Mid; // If value at middle index is target, return Mid
            else if (nums[Mid] < target) 
                Left = Mid + 1; // If value at Mid is smaller than target, search in the right half
            else 
                Right = Mid - 1; // If value at Mid is larger than target, search in the left half
        }

        return -1; // If target is not found in the array, return -1
    }
}



