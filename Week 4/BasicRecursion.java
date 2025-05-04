public class BasicRecursion {
    public static void printNumbers(int n) {
        if (n == 0) {
            return;                   // Base case: stop recursion
        } else {
            System.out.println(n);    // Print current number
            printNumbers(n - 1);      // Recursive call
        }
    }
    public static void main(String[] args) {
        printNumbers(5); 
    }
}
