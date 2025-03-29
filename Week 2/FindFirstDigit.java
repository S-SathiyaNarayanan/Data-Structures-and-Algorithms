// Solution 1
import java.util.Scanner;
public class FindFirstDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int N = sc.nextInt();
        int FirstDigit = 0;

        // Loop to extract the first digit
        while (N > 0) {
            FirstDigit = N % 10; // Extract the last digit in each iteration
            N = N / 10;          // Remove the last digit
        }

        // Display the first digit
        System.out.println("The first digit is " + FirstDigit);
    }
}

// Solution 2
import java.util.Scanner;
public class FindFirstDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int N = sc.nextInt();
        int FirstDigit = N;
        int LastDigit = N % 10;

        // Extract first digit
        while (FirstDigit >= 10) {
            FirstDigit = FirstDigit / 10;
        }

        System.out.println("The first digit is " + FirstDigit);
        System.out.println("The last digit is " + LastDigit);
    }
}
