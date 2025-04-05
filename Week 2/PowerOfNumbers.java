import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for base and power from the user
        System.out.print("Enter the value of Base: ");
        int Base = sc.nextInt();
        System.out.print("Enter the value of Power: ");
        int Power = sc.nextInt();

        // Initialize result to 1 (since any number raised to 0 is 1)
        int Result = 1;

        // Multiply base with itself 'Power' times
        for(int i = 1; i <= Power; i++) {
            Result = Result * Base;
        }

        // Display the final result of base raised to the power
        System.out.println("The value of " + Base + " power " + Power + " is " + Result);
    }
}

