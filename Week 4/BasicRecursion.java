public class BasicRecursion {
    public static void printNumbers(int n) {    // Recursive method to print numbers from n to 1
        if (n == 0) {
            return;                   // Base case: when n reaches 0, stop recursion
        } else {
            System.out.println(n);    // Print the current value of n
            printNumbers(n - 1);      // Recursive call with n decremented by 1
        }
    }
    public static void main(String[] args) {
        printNumbers(5);              // Initial call to start recursion with n = 5
    }
}
