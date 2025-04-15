/*************************************************************************************************************
🪙GeeksforGeeks - Middle of Three
Given three distinct numbers a, b and c. Find the number with a value in the middle (Try to do it with minimum
comparisons)
Input: a = 978, b = 518, c = 300
Output: 518
Explanation: Since 518>300 and 518<978, so 518 is the middle element.
*************************************************************************************************************/
// Solution 1 - XOR Approach
class Solution {
    int middle(int a, int b, int c) {
        // If a lies between b and c, then (a > b) != (a > c) will be true
        if ((a > b) != (a > c)) {
            return a;
        }
        // If b lies between a and c, then (b > a) != (b > c) will be true
        else if ((b > a) != (b > c)) {
            return b;
        }
        // If above both are false, then c must be the middle value
        else {
            return c;
        }
    }
}

