/*************************************************************************************************************
🪙GeeksforGeeks - Alternates in an Array
You are given an array arr[], the task is to return a list elements of arr in alternate order. Starting from 
index 0.
Input: arr[] = [1, 2, 3, 4]
Output: 1 3
Explanation:
Take first element: 1
Skip second element: 2
Take third element: 3
Skip fourth element: 4
*************************************************************************************************************/

class Solution {
    public ArrayList<Integer> getAlternates(int arr[]) {   
        ArrayList<Integer> arr2 = new ArrayList<>();    // Create a new ArrayList to store the alternate elements
        for(int i = 0; i < arr.length; i = i + 2) {     // Iterate through the array, incrementing by 2 to get alternate elements
            arr2.add(arr[i]);                           // Add the current element (at even index) to the ArrayList
        }
        return arr2;                                    // Return the ArrayList containing alternate elements
    }
}

