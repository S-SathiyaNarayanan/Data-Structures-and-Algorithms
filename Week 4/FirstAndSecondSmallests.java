/*************************************************************************************************************
🪙GeeksforGeeks - First and Second Smallests
Given an array, arr of integers, your task is to return the smallest and second smallest element in the array.
If the smallest and second smallest do not exist, return -1.
Input: arr[] = [2, 4, 3, 5, 6]
Output: 2 3 
Explanation: 2 and 3 are respectively the smallest and second smallest elements in the array.
*************************************************************************************************************/

class Solution {
    public int[] minAnd2ndMin(int arr[]) {
        // code here
        int FS=arr[0];
        int SS=Integer.MAX_VALUE;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<FS){
                SS=FS;
                FS=arr[i];
            }else if(arr[i]>FS && arr[i]<SS){
                SS=arr[i];
            }
        }
        if(SS==Integer.MAX_VALUE) return new int[]{-1};
        return new int[]{FS,SS};
    }
}
