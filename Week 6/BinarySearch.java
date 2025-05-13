/*************************************************************************************************************
💎LeetCode 704 - Binary Search
Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to 
search target in nums. If target exists, then return its index. Otherwise, return -1.
You must write an algorithm with O(log n) runtime complexity.
Input: nums = [-1,0,3,5,9,12], target = 9
Output: 4
Explanation: 9 exists in nums and its index is 4
*************************************************************************************************************/

// STANDARD BINARY SEARCH - Iterative Approach - Time Complexity O(log n) , Space Complexity O(1)
// <<< Calculate mid index to prevent integer overflow >>>
// First, it computes (right - left) this won’t overflow, because right is always >= left in a valid binary search
// Then it divides by 2
// Finally, it adds left.
// This avoids adding two potentially large numbers, and thus prevents overflow.
class Solution {
    public int search(int[] nums, int target) {
        int Left = 0;                   // Left pointer is the index at the start of the array
        int Right = nums.length - 1;    // Right pointer is the index at the end of the array
        while (Left <= Right) {                       // Repeat the steps while the search range is valid
            // Efficient Mid Calculation prevents integer overflow, which can happen with (Left + Right)/2 when values are large
            int Mid = Left + ((Right - Left) / 2);    // Find the middle index between Left and Right 
            if (nums[Mid] == target) return Mid;      // If value at middle index is target, return Mid
            else if (nums[Mid] < target)              // If value at Mid is smaller than target 
                Left = Mid + 1;                       // search in the right half ( move left pointer )
            else                                      // If value at Mid is larger than target 
                Right = Mid - 1;                      // search in the left half ( move right pointer )
        }
        return -1;    // If target is not found in the array, return -1
    }
}



