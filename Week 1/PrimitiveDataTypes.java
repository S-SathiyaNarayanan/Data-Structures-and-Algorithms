public class PrimitiveDataTypes {
    public static void main(String[] args) {
        // Declare and initialize primitive variables 
        byte myByteValue = 100;    // 1-byte integer
        short myShortValue = 5000;    // 2-byte integer
        int myIntValue = 100000;    // 4-byte integer
        long myLongValue = 15000000000L;    // 8-byte integer 
        float myFloatValue = 5.75f;    // 4-byte floating point
        double myDoubleValue = 19.99;
        char myCharValue = 'A';    // 2-byte Unicode character
        boolean myBooleanValue = true;
        // "L" is required when the value exceeds the int range 
        // "d" is optional for double literals but can enhance code readability
        // Always use "f" for float to avoid implicit double conversion errors

        // Print all primitive values
        System.out.println("Byte value: " + myByteValue);
        System.out.println("Short value: " + myShortValue);
        System.out.println("Int value: " + myIntValue);
        System.out.println("Long value: " + myLongValue);
        System.out.println("Float value: " + myFloatValue);
        System.out.println("Double value: " + myDoubleValue);
        System.out.println("Char value: " + myCharValue);
        System.out.println("Boolean value: " + myBooleanValue);
    }
}
