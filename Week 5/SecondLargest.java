/*************************************************************************************************************
🪙GeeksforGeeks - Second Largest
Given an array of positive integers arr[], return the second largest element from the array. If the second 
largest element doesn't exist then return -1.
Input: arr[] = [12, 35, 1, 10, 34, 1]
Output: 34
Explanation: The largest element of the array is 35 and the second largest element is 34.
*************************************************************************************************************/

class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int FL=arr[0];
        int SL=-1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>FL){
                SL=FL;
                FL=arr[i];
            }else if(arr[i]<FL && arr[i]>SL){
                SL=arr[i];
            }
        }
        return SL;
    }
}
