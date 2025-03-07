public class ArithmeticOperations {
    public static void main(String[] args) {
        // Declare two numbers
        int num1 = 20, num2 = 13;

        // Print initial values
        System.out.println("Initial values:");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        // Perform arithmetic operations
        int addition = num1 + num2;
        int subtraction = num1 - num2;
        int multiplication = num1 * num2;
        double division = (double) num1 / num2;  // Casting num1 to double for precision
        int modulus = num1 % num2;   // No casting needed for modulus

        // Increment and Decrement operations
        int prefixIncrement = ++num1;  // num1 is incremented first, then assigned
        int postfixIncrement = num2++;  // num2 is assigned first, then incremented
        int prefixDecrement = --num1;  // num1 is decremented first, then assigned
        int postfixDecrement = num2--;  // num2 is assigned first, then decremented

        // Display results
        System.out.println("\nArithmetic Operations:");
        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);
        System.out.printf("Division: %.2f%n", division); // Precision needed for division
        System.out.println("Modulus: " + modulus);

        System.out.println("\nIncrement and Decrement Operations:");
        System.out.println("Prefix Increment (++num1): " + prefixIncrement);
        System.out.println("Postfix Increment (num2++): " + postfixIncrement);
        System.out.println("Prefix Decrement (--num1): " + prefixDecrement);
        System.out.println("Postfix Decrement (num2--): " + postfixDecrement);

        // Print final values of num1 and num2
        System.out.println("\nFinal values after all operations:");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }
}
