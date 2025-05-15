/*************************************************************************************************************
🪙GeeksforGeeks - Third largest element
Given an array, arr of positive integers. Find the third largest element in it. Return -1 if the third largest
element is not found.
Input: arr[] = [2, 4, 1, 3, 5]
Output: 3
Explanation: The third largest element in the array [2, 4, 1, 3, 5] is 3.
*************************************************************************************************************/

class Solution {
    int thirdLargest(int arr[]) {
        if (arr.length <= 2) return -1;    // If there are fewer than 3 elements, third largest doesn't exist
        // Initialize first, second, and third largest values to minimum integer value
        int FL = Integer.MIN_VALUE;
        int SL = Integer.MIN_VALUE;
        int TL = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > FL) {    // If current element is greater than first largest
                TL = SL;
                SL = FL;
                FL = arr[i];      // Update third and second largest before updating first largest
            }
            else if (arr[i] > SL && arr[i] != FL) {    // If current element is not the largest but greater than second largest
                // Update third largest before updating second largest
                TL = SL;
                SL = arr[i];
            }
            // If current element is not among the top two but greater than third largest
            else if (arr[i] > TL && arr[i] != SL && arr[i] != FL) {
                TL = arr[i];
            }
        }
        // Return third largest value found
        return TL;
    }
}

