// Solution 1 - Swapping variables with temporary variable
// ✅ Readable: Easy to understand
// ✅ Safe from Overflow: No risk
// ✅ Works with all types (int, float, string, etc.)
// ✅ Performance: Very fast
// ✅ Fail-proof: 100% reliable
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();  // Asking user to enter the value of 'a'
        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();  // Asking user to enter the value of 'b'
        // Swapping logic begins
        int temp = a;    // Step 1: Store the value of 'a' in a temporary variable 'temp'
        a = b;           // Step 2: Assign the value of 'b' to 'a'        
        b = temp;        // Step 3: Assign the value stored in 'temp' (original 'a') to 'b'
        System.out.println("\n--Values after Swapping--");  
        System.out.println("The value of a is " + a);
        System.out.println("The value of b is " + b);
    }
}

