/*************************************************************************************************************
🪙GeeksforGeeks - Implement Lower Bound
Given sorted array arr[] and a number target,the task is to find the lower bound of the target in this given
array. The lower bound of a number is defined as the smallest index in the sorted array where the element is 
greater than or equal to the given number.
Note: If all the elements in the given array are smaller than the target, the lower bound will be the length 
of the array. 
Input:  arr[] = [2, 3, 7, 10, 11, 11, 25], target = 9
Output: 3
Explanation: 3 is the smallest index in arr[] where element (arr[3] = 10) is greater than or equal to 9
*************************************************************************************************************/

// BINARY SEARCH LOWER BOUND - Time Complexity O(log n) , Space Complexity O(1) 
// Use Cases :-
// Finds the Index of first occurrence of the target if it exists in a sorted list with duplicates
// Finds the position where it can be Inserted if the target doesnt exist, while maintaining the sorted order 
class Solution {
    int lowerBound(int[] arr, int target) {
        int L=0;
        int R=arr.length;
        while(L<R){
            int mid=L+(R-L)/2;
            if(arr[mid]<target){
                L=mid+1;
            }else{
                R=mid;
            }
        }
        return L;
    }
}
