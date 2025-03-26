/*************************************************************************************************************
🪙GeeksforGeeks - Sum of Array
You are given an integer array arr[]. The task is to find the sum of it.
Input: arr[] = [1, 2, 3, 4]
Output: 10
Explanation: 1 + 2 + 3 + 4 = 10.
*************************************************************************************************************/

// User function Template for Java
class Solution {
    int arraySum(int arr[]) {
        // code here
        int n=arr.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
        }
        return sum;
    }
}

