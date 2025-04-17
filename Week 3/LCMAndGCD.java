class Solution {
    public static int[] lcmAndGcd(int a, int b) {
        // Store original values of a and b for LCM calculation
        int x = a;
        int y = b;
        // Use Euclidean algorithm to find GCD
        while (b != 0) {
            int temp = b;     // Temporarily store the value of b
            b = a % b;        // Update b to the remainder of a divided by b
            a = temp;         // Update a to the previous value of b
        }
        int GCD = a;  // After the loop, 'a' holds the GCD
        // Calculate LCM using the formula: (x * y) / GCD
        int LCM = (int)((long)x * (long)y) / GCD;
        // Return result as an array: {LCM, GCD}
        return new int[]{LCM, GCD};
    }
}

