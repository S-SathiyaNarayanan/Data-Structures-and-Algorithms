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
        int n = arr.length;  // Get the size of the array
        // Loop through each position in the array except the last
        for (int i = 0; i < n - 1; i++) {
            // Assume the current index has the smallest element
            int MI = i;
            // Look through the remaining unsorted elements
            for (int j = i + 1; j < n; j++) {
                // If a smaller element is found, update the minimum index
                if (arr[j] < arr[MI]) {
                    MI = j;
                }
            }
            // Swap the smallest found element with the element at index i
            int temp = arr[MI];
            arr[MI] = arr[i];
            arr[i] = temp;
            // Now, the element at index i is in its correct sorted position
        }
        // After all passes, the array is fully sorted in ascending order
    }
}

