/*************************************************************************************************************
🪙GeeksforGeeks - Max and Min Product from 2 Arrays
Given two arrays of arr1 and arr2, the task is to calculate the product of the maximum element of the first 
array arr1, and minimum element of the second array arr2.
Input : arr1 = [5, 7, 9, 3, 6, 2]  arr2 = [1, 2, 6, 1, 9]
Output : 9
Explanation: The max in arr1 is 9. The min element in arr2 is 1. The product is 9*1 = 9.
*************************************************************************************************************/

class Solution {
    public long findMultiplication(int[] arr1, int[] arr2) {
        int Max=arr1[0];    // Initialize Max with the first element of arr1
        int Min=arr2[0];    // Initialize Min with the first element of arr2
        for(int i=0;i<arr1.length;i++){     // Loop through arr1 to find the maximum element
            if(arr1[i]>Max) Max=arr1[i];    // If the current element is greater than the current Max, update Max
        }for(int j=0;j<arr2.length;j++){    // Loop through arr2 to find the minimum element
            if(arr2[j]<Min) Min=arr2[j];    // If the current element is less than the current Min, update Min
        }
        return Max*Min;     // Return the product of the maximum from arr1 and minimum from arr2
    }
}
