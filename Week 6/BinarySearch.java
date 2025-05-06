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
        int L=0;
        int R=nums.length-1;
        while(L<=R){
            int mid=L+((R-L)/2);
            if(nums[mid]==target) return mid;
            else if(nums[mid]<target) L=mid+1;
            else R=mid-1;
        }
        return -1;
    }
}


