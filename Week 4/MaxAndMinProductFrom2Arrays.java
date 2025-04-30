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
        int Max=arr1[0];
        int Min=arr2[0];
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]>Max) Max=arr1[i];
        }for(int j=0;j<arr2.length;j++){
            if(arr2[j]<Min) Min=arr2[j];
        }
        return Max*Min;
    }
}
