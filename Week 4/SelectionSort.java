/*************************************************************************************************************
🪙GeeksforGeeks - Selection Sort
Given an array arr, use selection sort to sort arr[] in increasing order.
Input: arr[] = [4, 1, 3, 9, 7]
Output: [1, 3, 4, 7, 9]
Explanation: Maintain sorted (in bold) and unsorted subarrays. Select 1. Array becomes 1 4 3 9 7. Select 3. 
Array becomes 1 3 4 9 7. Select 4. Array becomes 1 3 4 9 7. Select 7. Array becomes 1 3 4 7 9. Select 9. Array 
becomes 1 3 4 7 9.
*************************************************************************************************************/

class Solution {
    void selectionSort(int[] arr) {
        // code here
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int MI=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[MI]) MI=j;
            }
            int temp=arr[MI];
            arr[MI]=arr[i];
            arr[i]=temp;
        }
    }
}
