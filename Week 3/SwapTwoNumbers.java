/*************************************************************************************************************
🪙GeeksforGeeks - Swap two numbers
You are given two numbers a and b. Your task is to swap the given two numbers
Note: Try to do it without a temporary variable
Input: a = 13, b = 9
Output: 9 13
Explanation: After swapping it becomes 9 and 13.
*************************************************************************************************************/

// Solution 1 - Using Arithmetic Operators
// ❌ Readability: Slightly confusing
// ❌ Risk of Integer Overflow if a + b exceeds limit
// ❌ Works only with numeric types (int, float, etc.)
// ⚡ Performance: Very fast
// ❌ Not fail proof – can crash or give wrong results
class Solution{
    static List<Integer> get(int a,int b)
    {
        a = a + b;
        b = a - b;
        a = a - b;
        return Arrays.asList(a,b);
    }
}

// Solution 2 - Using Bitwise XOR
// ❌ Readability: More confusing, less intuitive
// ✅ Safe from Overflow
// ❌ Works only with integers (not float or objects)
// ⚡ Performance: Very fast
// ❌ Not fail-proof – hard to debug if things go wrong
class Solution{
    static List<Integer> get(int a,int b)
    {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        return Arrays.asList(a,b);
    }
}
