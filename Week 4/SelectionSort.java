/*************************************************************************************************************
🪙GeeksforGeeks - Selection Sort
Given an array arr, use selection sort to sort arr[] in increasing order.
Input: arr[] = [4, 1, 3, 9, 7]
Output: [1, 3, 4, 7, 9]
Explanation: Maintain sorted (in bold) and unsorted subarrays. Select 1. Array becomes 1 4 3 9 7. Select 3. 
Array becomes 1 3 4 9 7. Select 4. Array becomes 1 3 4 9 7. Select 7. Array becomes 1 3 4 7 9. Select 9. Array 
becomes 1 3 4 7 9.
*************************************************************************************************************/

class Solution {
    void selectionSort(int[] arr) {
        int n = arr.length;  // Get the total number of elements in the array

        // Outer loop: runs from 0 to n-2
        // On each iteration, it places the correct element at position i
        for (int i = 0; i < n - 1; i++) {

            int MI = i;  // Assume the current index i is the minimum index

            // Inner loop: search for the smallest element in the remaining unsorted part
            for (int j = i + 1; j < n; j++) {

                // If a smaller element is found, update the minimum index (MI)
                if (arr[j] < arr[MI]) {
                    MI = j;
                }
            }

            // After finding the minimum element in the unsorted part,
            // swap it with the element at the current index i

            int temp = arr[MI];  // Store the minimum value in a temporary variable
            arr[MI] = arr[i];    // Move the current value to the position of the minimum
            arr[i] = temp;       // Place the minimum value at index i

            // Now, arr[0..i] is sorted, and the rest is still unsorted
        }

        // After the loop ends, the entire array is sorted in ascending order
    }
}

