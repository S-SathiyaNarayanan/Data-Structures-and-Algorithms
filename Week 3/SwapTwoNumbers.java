/*************************************************************************************************************
🪙GeeksforGeeks - Swap two numbers
You are given two numbers a and b. Your task is to swap the given two numbers
Note: Try to do it without a temporary variable
Input: a = 13, b = 9
Output: 9 13
Explanation: After swapping it becomes 9 and 13.
*************************************************************************************************************/

// Solution 1 - 
class Solution{
    static List<Integer> get(int a,int b)
    {
        a=a+b;
        b=a-b;
        a=a-b;
        return Arrays.asList(a,b);
    }
}

// Solution 2 -
class Solution{
    static List<Integer> get(int a,int b)
    {
        a=a^b;
        b=a^b;
        a=a^b;
        return Arrays.asList(a,b);
    }
}
