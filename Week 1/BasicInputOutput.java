import java.util.Scanner;

public class BasicInputOutput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        // ========== PRIMITIVE TYPES ========== //

        // Byte 
        System.out.print("Enter a byte: ");
        byte b = sc.nextByte();
        
        // Short 
        System.out.print("Enter a short: ");
        short s = sc.nextShort();
        
        // Integer
        System.out.print("Enter an integer: ");
        int i = sc.nextInt();
        
        // Long
        System.out.print("Enter a long: ");
        long l = sc.nextLong();
        
        // Float
        System.out.print("Enter a float: ");
        float f = sc.nextFloat();
        
        // Double
        System.out.print("Enter a double: ");
        double d = sc.nextDouble();
        
        // Boolean
        System.out.print("Enter boolean (true/false): ");
        boolean bool = sc.nextBoolean();
        
        // Character  
        System.out.print("Enter a character: ");                 
        char c = sc.next().charAt(0);            // There is no direct method for character use next().charAt(0)                 
        
        // ========== NON-PRIMITIVE TYPES ========== //

        // String (single word)
        System.out.print("Enter a single word: ");
        String word = sc.next();
        
        // String (entire line)
        sc.nextLine();  // Clear buffer
        System.out.print("Enter full sentence: ");
        String sentence = sc.nextLine();
        
        sc.close();    // closing the scanner
        
        // ========== OUTPUT RESULTS ========== //

        System.out.println("\n==== Results ====\n");
        System.out.println("Byte: " + b);
        System.out.println("Short: " + s);
        System.out.println("Integer: " + i);
        System.out.println("Long: " + l);
        System.out.println("Float: " + f);
        System.out.println("Double: " + d);
        System.out.println("Boolean: " + bool);
        System.out.println("Character: " + c);
        System.out.println("Word: " + word);
        System.out.println("Sentence: " + sentence);
    }
}
