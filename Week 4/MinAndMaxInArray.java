/*************************************************************************************************************
🪙GeeksforGeeks - Min and Max in Array
Given an array arr. Your task is to find the minimum and maximum elements in the array.
Input: arr[] = [3, 2, 1, 56, 10000, 167]
Output: 1 10000
Explanation: minimum and maximum elements of array are 1 and 10000.
*************************************************************************************************************/

// Solution 1
class Solution {
    public Pair<Integer, Integer> getMinMax(int[] arr) {
        int n = arr.length;
        int min = arr[0], max = arr[0];       
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] < min) {    // Using else if reduces unnecessary loops
                min = arr[i];
            }
        }        
        return new Pair<>(min, max);
    }
}

// Solution 2
class Solution {
    public Pair<Integer, Integer> getMinMax(int[] arr) {
        // Code Here
        int Min=arr[0];
        int Max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>Max) Max=arr[i];
            if(arr[i]<Min) Min=arr[i];
        }
        return new Pair<>(Min,Max);
    }
}

