/*************************************************************************************************************
🪙GeeksforGeeks - Count Odd and Even
Given an array arr[] of positive integers. The task is to return the count of the number of odd and even 
elements in the array.
Input: arr[] = [1, 2, 3, 4, 5]
Output: 3 2
Explanation: There are 3 odd elements (1, 3, 5) and 2 even elements (2 and 4).
*************************************************************************************************************/

// User function Template for Java
class Solution {
    public int[] countOddEven(int[] arr) {
        // Code here
        int n=arr.length;
        int even=0;
        int odd=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                even=even+1;
            }
            else{
                odd=odd+1;
            }
        }
        return new int[]{odd,even};
    }
}
