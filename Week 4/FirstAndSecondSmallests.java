/*************************************************************************************************************
🪙GeeksforGeeks - First and Second Smallests
Given an array, arr of integers, your task is to return the smallest and second smallest element in the array.
If the smallest and second smallest do not exist, return -1.
Input: arr[] = [2, 4, 3, 5, 6]
Output: 2 3 
Explanation: 2 and 3 are respectively the smallest and second smallest elements in the array.
*************************************************************************************************************/

// Solution 1
class Solution {
    public int[] minAnd2ndMin(int[] arr) {
        // If fewer than 2 elements or null, no valid second smallest.
        if (arr == null || arr.length < 2) {
            return new int[] { -1 };
        }
        // Sentinels for smallest and second smallest.
        int min = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        // Single-pass scan.
        for (int x : arr) {
            if (x < min) {
                second = min;
                min = x;
            } else if (x > min && x < second) {
                second = x;
            }
        }
        // If second never updated, return -1.
        return (second == Integer.MAX_VALUE)
            ? new int[] { -1 }
            : new int[] { min, second };
    }
}

// Solution 2
class Solution {
    public int[] minAnd2ndMin(int arr[]) {
        int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
        for (int num : arr) {
            if (num < first) {
                second = first;
                first = num;
            } else if (num < second && num != first) {
                second = num;
            }
        }
        return second == Integer.MAX_VALUE
            ? new int[]{-1}
            : new int[]{first, second};
    }
}

