/*************************************************************************************************************
🪙GeeksforGeeks - Array Search
Given an array, arr of n integers, and an integer element x, find whether element x is present in the array. 
Return the index of the first occurrence of x in the array, or -1 if it doesn't exist.
Input: arr[] = [1, 2, 3, 4], x = 3
Output: 2
Explanation: There is one test case with array as [1, 2, 3 4] and element to be searched as 3. Since 3 is 
present at index 2, the output is 2.
*************************************************************************************************************/

// Solution 1 
class Solution {
    static int search(int arr[], int x) {  
        for (int i = 0; i < arr.length; i++) {    // Loop through each element of the array   
            if (arr[i] == x) {                    // Check if the current element matches x       
                return i;                         // Return the index of the first occurrence
            }
        } 
        return -1;                                // If x is not found in the array, return -1
    }
}

// Solution 2
class Solution {
    static int search(int arr[], int x) {
        int index=-1;
        for(int i=0;i<arr.length;i++){
            if(x==arr[i]){
                index=i;
                break;
            }
        }
        return index;
    }
}

