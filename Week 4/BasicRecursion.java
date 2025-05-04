public class BasicRecursion {
    public static void printNumbers(int n) {    // Recursive method to print numbers from n to 1
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
