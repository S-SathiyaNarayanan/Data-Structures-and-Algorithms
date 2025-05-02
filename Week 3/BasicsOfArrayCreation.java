import java.util.Scanner;
public class BasicsOfArrayCreation{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        // Two line Array Declaration and Initialization
        int[] Array1;          // Declare an array of integers
        Array1= new int[5];    // Allocate memory for 5 integers
        
        // One line Array Declaration and Initialization
        int[] Array2= new int[5];    // Combined declaration & initialization
        
        // Inline Array Initialization
        int[] Array3= { 11 , 12 , 13 , 14 , 15 };
        
        // Explicit Array Creation with Initial Values
        int[] Array4= new int[]{ 16 , 17 , 18 , 19 , 20 };
        
        // Runtime-sized Array Initialization
        int n=sc.nextInt();          // Read size from user
        int[] Array5= new int[n];    // Array size determined at runtime

    }
}
