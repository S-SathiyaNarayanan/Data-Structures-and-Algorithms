import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int N = sc.nextInt();

        if (N == 0) {        // Edge case for 0
            System.out.println("Traversing through Last Digits");
            System.out.println(0);
            return;
        }

        System.out.println("Traversing through Last Digits");
        while (N > 0) {
            int LastDigit = N % 10;        // Extract last digit
            System.out.println(LastDigit);
            N = N / 10;        // Remove last digit
        }

        sc.close();        // Close scanner to avoid memory leaks
    }
}
