import java.util.Scanner;
public class BasicsOfArrayCreation{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        // Two-step Array Declaration and Initialization
        int[] Array1;          // Declare an array reference variable
        Array1= new int[5];    // Create array object with 5 default-initialized integers (0s)

        // Single-line Array Declaration and Initialization
        int[] Array2= new int[5];    // Combine declaration and creation in one line
        
        // Compact Array Initialization (size inferred)
        int[] Array3= { 11 , 12 , 13 , 14 , 15 };    // Array creation with explicit initial values
        
        // Explicit Array Initialization
        int[] Array4= new int[]{ 16 , 17 , 18 , 19 , 20 };
        
        // Runtime-sized Array Initialization
        int n=sc.nextInt();          // Read size from user
        int[] Array5= new int[n];    // Array size determined at runtime

    }
}
