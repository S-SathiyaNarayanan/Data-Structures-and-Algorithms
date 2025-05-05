import java.util.Scanner;
public class Main{
    static int LinearSearch(int[] array,int value){    // Method to perform linear search on an array
        for(int i=0;i<array.length;i++){    // Iterate over each element in the array
            if(array[i]==value) {           // Check if the current element matches the target value    
                return i;                   // Return index if found
            }
        }
        return -1;                          // Return -1 if value is not found in the array
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[]{1,3,6,10,15,21,28,36,45,55};               // Predefined array of integers
        System.out.print("Enter the value to find in the array: ");    // Prompt user to enter the value to search
        int n=sc.nextInt();                                            // Read user input
        int Index=LinearSearch(arr,n);                                 // Call the LinearSearch method and store the result
        if(Index>=0) {                                                 // Check if the value was found and print the corresponding message
            System.out.println("The Index of the value in the array is "+Index);
        }else {
            System.out.println("The value is not found in the array");
        }
        sc.close();                         // Close the scanner to release resources
    }
}
