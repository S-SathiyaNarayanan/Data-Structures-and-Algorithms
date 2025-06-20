/*************************************************************************************************************
🪙GeeksforGeeks - Check if array is sorted
Given an array arr[], check whether it is sorted in non-decreasing order. Return true if it is sorted otherwise
false.
Input: arr[] = [10, 20, 30, 40, 50]
Output: true
Explanation: The given array is sorted.
*************************************************************************************************************/

// Solution 1
class Solution {
    public boolean arraySortedOrNot(int[] arr) {
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
}

// Solution 2
class Solution {
    public boolean arraySortedOrNot(int[] arr) {
        if(arr.length==1) return true;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]) return false;
        }
        return true;
    }
}

// Solution 3
class Solution {
    public boolean arraySortedOrNot(int[] arr) {
        if(arr.length==1) return true;
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[i]>arr[j]) return false;
            i++;
        }
        return true;
    }
}
