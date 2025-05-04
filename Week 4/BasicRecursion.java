import java.util.Scanner;
public class BasicRecursion {
    public static void printNumbers(int n) {    // Recursive method to print numbers from n to 1
        if (n == 0) {
            return;                     // Base case: when n reaches 0, stop recursion
        } else {
            System.out.print(n+" ");    // Print the current value of n
            printNumbers(n - 1);        // Recursive call with n decremented by 1
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n=sc.nextInt();
        printNumbers(n);                // Initial call to start recursion with n = 5
    }
}
