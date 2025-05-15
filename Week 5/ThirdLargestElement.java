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
        // Your code here
        if(arr.length<=2) return -1;
        int FL=Integer.MIN_VALUE;
        int SL=Integer.MIN_VALUE;
        int TL=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>FL){
                TL=SL;
                SL=FL;
                FL=arr[i];
            }else if(arr[i]>SL){
                TL=SL;
                SL=arr[i];
            }else if(arr[i]>TL){
                TL=arr[i];
            }
        }
        return TL;
    }
}
