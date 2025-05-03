/*************************************************************************************************************
🪙GeeksforGeeks - Find element at a given Index
Given an array arr of integers and an index key(0-based index). Your task is to return the element present at 
the index key in the array.
Input: key = 4 , arr = [10, 20, 30, 40, 50, 60, 70]
Output: 50
Explanation: The value of the arr[4] is 50 .
*************************************************************************************************************/

class Solution {
    static ArrayList<Integer> sieveOfEratosthenes(int n) {
        ArrayList<Integer> PN = new ArrayList<>();
        if (n < 2) {
            return PN;
        }
        boolean[] arr = new boolean[n + 1];
        Arrays.fill(arr, true);
        arr[0] = false;
        arr[1] = false;
        for (int i = 2; i * i <= n; i++) {
            if (arr[i]) {
                for (int j = i * i; j <= n; j += i) {
                    arr[j] = false;
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if (arr[i]) {
                PN.add(i);
            }
        }
        return PN;
    }
}
