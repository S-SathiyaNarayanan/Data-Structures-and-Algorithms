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
            FirstDigit /= 10;
        }

        System.out.println("The first digit is " + FirstDigit);
        System.out.println("The last digit is " + LastDigit);
    }
}
