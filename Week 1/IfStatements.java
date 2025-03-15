import java.util.Scanner;

public class IfStatements {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);

        // User inputs
        System.out.println("Enter a number to check positivity:");
        int number = sc.nextInt();
        System.out.println("Enter a number to check even/odd:");
        int checkEvenOdd = sc.nextInt();
        System.out.println("Enter your age:");
        int age = sc.nextInt();
        System.out.println("Enter the Secret Code:");
        int secretcode = sc.nextInt();

        System.out.println("\n==== Results ====\n");

        // 1. Simple if statement
        if (number > 0) {
            System.out.println(number + "Wow you really entered a positive number");
        }

        // 2. if-else statement
        if (checkEvenOdd % 2 == 0) {
            System.out.println(checkEvenOdd + " is even");
        } else {
            System.out.println(checkEvenOdd + " is odd");
        }

        // 3. else-if ladder
        if (age < 13) {
            System.out.println("You are a Child");
        } else if (age < 20) {
            System.out.println("You are a Teenager");
        } else if (age < 65) {
            System.out.println("You are an Adult");

            // 4. Nested if statement
            System.out.println("\nAre you employed ? ");
            boolean isEmployed = sc.nextBoolean();

            if (isEmployed) {
                System.out.println("You are an Employed Adult");
            } else {
                System.out.println("You are an Unemployed Adult");
            }
        } else {
            System.out.println("You are a Senior");
        }

        // 5. Ternary Operator (Short-hand If...Else)
        String isCorrectCode = (secretcode == 007) ? "Correct Password 🍀" : "Wrong Password! 🎭";
        System.out.println(isCorrectCode);

        sc.close();
    }
}
