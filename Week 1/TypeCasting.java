public class TypeCasting {
    public static void main(String[] args) {
        
        // Widening Casting (Automatic)
        // Rules:
        // 1. Converts smaller types to larger compatible types automatically
        // 2. No explicit casting required
        // 3. Order: byte -> short -> int -> long -> float -> double
        // 4. char can be promoted to int (using ASCII value)

        System.out.println("\nWidening Casting Examples:");
        
        int intValue = 100;
        long longValue = intValue;    // Automatic int->long conversion
        System.out.println("int to long: " + longValue);

        float floatValue = intValue;     // Automatic int->float conversion
        System.out.println("int to float: " + floatValue);

        short shortValue = 50;
        int promotedInt = shortValue;    // Automatic short->int conversion
        System.out.println("short to int: " + promotedInt);

        byte byteValue = 8;
        double doubleValue = byteValue;    // Automatic byte->double conversion
        System.out.println("byte to double: " + doubleValue);

        char charValue = 'A';
        int charToInt = charValue;  // Automatic char->int (ASCII value)
        System.out.println("char to int: " + charToInt);

        // ----------------------------
        // Narrowing Casting (Manual)
        // ----------------------------
        // Rules:
        // 1. Converts larger types to smaller compatible types manually
        // 2. Requires explicit casting using (target-type)
        // 3. May lose data or precision
        // 4. Can produce overflow if value is too large for target type

        System.out.println("\nNarrowing Casting Examples:");
        
        double bigDouble = 1234.5678;
        int doubleToInt = (int) bigDouble;  // Explicit cast, truncates decimal
        System.out.println("double to int: " + doubleToInt);

        long bigLong = 2147483648L;  // Larger than Integer.MAX_VALUE (2,147,483,647)
        int longToInt = (int) bigLong;  // Overflow occurs
        System.out.println("long to int (overflow): " + longToInt);

        float floatNum = 9.99f;
        int floatToInt = (int) floatNum;  // Truncates to integer part
        System.out.println("float to int: " + floatToInt);

        int number = 65;
        char intToChar = (char) number;  // Cast to ASCII character
        System.out.println("int to char: " + intToChar);

        // -----------------
        // Type Promotion
        // -----------------
        // Rules:
        // 1. Automatic conversion in expressions with mixed types
        // 2. All byte, short, char values promoted to int in expressions
        // 3. If operands differ, promoted to larger type
        // 4. Final result type same as promoted operands
        // 5. Assignment may require explicit cast

        System.out.println("\nType Promotion Examples:");
        
        byte byteNum = 10;
        short shortNum = 20;
        // byte + short promoted to int
        int promotionResult = byteNum + shortNum;
        System.out.println("byte + short = int: " + promotionResult);

        int intNum = 5;
        float floatNum2 = 3.5f;
        // int promoted to float, result is float
        float floatResult = intNum * floatNum2;
        System.out.println("int * float = float: " + floatResult);

        char char1 = 'a';  // ASCII 97
        char char2 = 'b';  // ASCII 98
        // char + char promoted to int
        int charSum = char1 + char2;
        System.out.println("char + char = int: " + charSum);

        // Explicit cast required for assignment
        byte result = (byte) (byteNum + 50);  // (60 is within byte range)
        System.out.println("byte operation with cast: " + result);

        // Constant value within target range doesn't need cast
        byte constByte = 127;  // Maximum byte value
        System.out.println("Direct byte assignment: " + constByte);

        // Type promotion in method arguments
        printPromotedValue(byteNum);  // byte promoted to int
    }

    // Demonstrates type promotion in method parameters
    private static void printPromotedValue(int num) {
        System.out.println("Promoted to int in method: " + num);
    }
}
