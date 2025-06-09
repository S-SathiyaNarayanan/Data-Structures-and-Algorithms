/*************************************************************************************************************
🪙GeeksforGeeks - Reverse an Array
Given an array arr[], check whether it is sorted in non-decreasing order. Return true if it is sorted otherwise
false.
Input: arr[] = [10, 20, 30, 40, 50]
Output: true
Explanation: The given array is sorted.
*************************************************************************************************************/
class Solution {
    public void reverseArray(int arr[]) {
        int i=0;
        int j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
}
