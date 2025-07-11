/*************************************************************************************************************
🪙GeeksforGeeks - Reverse an Array
You are given an array of integers arr[]. Your task is to reverse the given array.
Input: arr = [1, 4, 3, 2, 6, 5]
Output: [5, 6, 2, 3, 4, 1]
Explanation: Modify the array in place.
*************************************************************************************************************/

// Solution 1
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

// Solution 2
class Solution {
    public void reverseArray(int arr[]) {
        int n=arr.length;
        for(int i=0;i<n/2;i++){
            int temp=arr[i];
            arr[i]=arr[n-1-i];
            arr[n-1-i]=temp;
        }
    }
}
