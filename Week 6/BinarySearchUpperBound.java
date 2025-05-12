// BINARY SEARCH UPPER BOUND - Time Complexity O(log n), Space Complexity O(1)
// Use Cases :-
// Finds the Index of the first element greater than the target in a sorted list with duplicates
// Finds the position where target can be inserted after all its duplicates to maintain sorted order
class Solution {
    public int upperBound(int[] arr, int target) {
        int L = 0;             // Left pointer is the index at the start of the array
        int R = arr.length;    // Right pointer is set to one past the last index (because we're searching for an upper bound)
        while (L < R) {                   // Repeat the process while L is less than R
            int mid = L + (R - L) / 2;    // Efficient mid calculation to avoid integer overflow
            if (arr[mid] <= target) {     // If the value at mid is less than or equal to the target
                L = mid + 1;              // search in the right half ( move left pointer )
            } else {                      // If the value at mid is greater than target
                R = mid;                  // move the right pointer
            }
        }
        return L;    // When L equals R, L will be the first index where arr[L] > target
    }
}

