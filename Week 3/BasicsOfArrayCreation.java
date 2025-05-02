import java.util.Scanner;
public class BasicsOfArrayCreation{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        // Two-step Array Declaration and Initialization
        int[] Array1;          // Declare an array reference variable
        Array1= new int[5];    // Create array object with 5 default-initialized integers (0s)
                               // Useful when you need to declare the array first and initialize it later

        // Single-line Array Declaration and Initialization
        int[] Array2= new int[5];    // Combine declaration and creation in one line
                                     // Combines declaration and initialization in one line. Functionally identical to the two-step approach
        
        // Inline Array Initialization ( Size automatically determined )
        int[] Array3= { 11 , 12 , 13 , 14 , 15 };    // Array creation with explicit initial values
                                                     // Declares, allocates, and initializes the array in one step
        
        // Explicit Inline Array Initialization with values
        int[] Array4= new int[]{ 16 , 17 , 18 , 19 , 20 };     // Do not specify the size in [] it is inferred from the elements
        
        // Runtime-sized Array Initialization
        int n=sc.nextInt();          // Read size from user
        int[] Array5= new int[n];    // Array size determined at runtime

        // ------------------------------------Important Reminders------------------------------------------------
        // When arrays are created without explicit values, elements are initialized to their type’s default value,
        // 0 for numeric types (int, double, etc...)
        // false for boolean
        // null for objects (e.g., String[])
        // Size cannot be specified in array declaration
        // Arrays are objects, and their size is immutable after creation
        // Arrays are objects in Java. Variables like Array1 or Array2 are references to the array object in memory
        
    }
}
