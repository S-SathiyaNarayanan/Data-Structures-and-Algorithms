/*************************************************************************************************************
🪙GeeksforGeeks - Print Elements of Array
Given an array arr[], print all its elements space-separated.
Input: arr[] = [1, 2, 3, 4, 5]
Output: 1 2 3 4 5
Note: You don't need to move to the next line after printing all elements of the array (space-separated)
*************************************************************************************************************/

// User function Template for Java
class Solution {
    // Just print the space seperated array elements
    void printArray(int arr[]) {
        // code here
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
