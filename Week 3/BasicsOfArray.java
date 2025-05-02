import java.util.Scanner;
import java.util.Arrays;
public class BasicsOfArray{
    
    // Recursive method to print array elements starting from given index
    static void printArrayUserDefinedMethod(int[] arr, int index) {
        if (index >= arr.length) return;                // Base case: stop recursion when index reaches array length
        System.out.print(arr[index]+" ");               // Print current element
        printArrayUserDefinedMethod(arr, index + 1);    // Recursive call with next index
    }
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
                
        // Two-step Array Declaration and Initialization
        int[] Array1;          // Declare an array reference variable
        Array1= new int[5];    // Create array object with 5 default-initialized integers (0s)
                               // Useful when you need to declare the array first and initialize it later

        // Single-line Array Declaration and Initialization
        int[] Array2= new int[5];    // Combines declaration and initialization in one line
                                     // Functionally identical to the two-step approach
        // Initialize Array 2 elements individually
        Array2[0]=1; 
        Array2[1]=2;
        Array2[2]=3;
        Array2[3]=4;
        Array2[4]=5;
        
        // Inline Array Initialization ( Size automatically determined )
        int[] Array3= { 11 , 12 , 13 , 14 , 15 };    // Array creation with explicit initial values // Declares, allocates, and initializes the array in one step
                                                     
        
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
        // If you're returning an array directly from a method, and you're creating it inline, you must use new " int[] "
        // System.out.println(Array1); → prints memory address, not the elements
        // Arrays.toString(Array1) → prints entire array as [1, 2, 3, 4, 5] not one-by-one elements
        
    }
}
