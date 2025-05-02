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
        // Loop to populate array with user input values
        for(int i=0;i<n;i++){
            System.out.print("Enter the value of "+i+"th Index: ");
            Array5[i]=sc.nextInt();    // Accept elements from user
        }

        // Display Array1 elements before modification
        System.out.print("\nArray 1 Elements Before Modification");
        System.out.print("\nArray 1 Elements: ");
        System.out.print(Array1[0]+" ");
        System.out.print(Array1[1]+" ");
        System.out.print(Array1[2]+" ");
        System.out.print(Array1[3]+" ");
        System.out.print(Array1[4]+" ");
        
        // Modifying Array1 elements with even numbers
        Array1[0]=2;
        Array1[1]=4;
        Array1[2]=6;
        Array1[3]=8;
        Array1[4]=10;
        
        // Display Array1 elements after modification
        System.out.print("\n\nArray 1 Elements After Modification");
        System.out.print("\nArray 1 Elements: ");
        System.out.print(Array1[0]+" ");
        System.out.print(Array1[1]+" ");
        System.out.print(Array1[2]+" ");
        System.out.print(Array1[3]+" ");
        System.out.print(Array1[4]+" ");
        
        // Display Array2 elements
        System.out.print("\n\nArray 2 Elements: ");
        System.out.print(Array2[0]+" ");
        System.out.print(Array2[1]+" ");
        System.out.print(Array2[2]+" ");
        System.out.print(Array2[3]+" ");
        System.out.print(Array2[4]+" ");
        
        // Display Array3 elements using for loop
        System.out.print("\n\nArray 3 Elements: ");
        for(int i=0;i<Array3.length;i++){
            System.out.print(Array3[i]+" ");
        }
        
        // Display Array4 elements using for-each loop
        System.out.print("\n\nArray 4 Elements: ");
        for(int i: Array4){
            System.out.print(i+" ");
        }
        
        // Display Array5 elements using the recursive method
        System.out.print("\n\nArray 5 Elements: ");
        printArrayUserDefinedMethod(Array5,0);
       
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
