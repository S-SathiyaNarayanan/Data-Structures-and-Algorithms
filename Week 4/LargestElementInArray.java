/*************************************************************************************************************
🪙GeeksforGeeks - Largest Element in Array
Given an array arr[]. The task is to find the largest element and return it.
Input: arr[] = [1, 8, 7, 56, 90]
Output: 90
Explanation: The largest element of the given array is 90.
*************************************************************************************************************/

class Solution {
    public static int largest(int[] arr) {
        // code here
        int n=arr.length;
        // Initializing MAX with arr[0] ensures the correct maximum is found, even if all numbers are negative.
        int Max=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>Max){
                Max=arr[i];
            }
        }
        return Max;
    }
}
