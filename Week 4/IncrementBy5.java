public class IncrementBy5 {
    public static void main(String[] args) {
      
        // Initialize an integer array with predefined values
        int[] arr = {1, 12, 14, 20, 30}; 
        int n = arr.length;  // Get the length of the array

        // Iterate through the array and add 5 to each element
        for (int i = 0; i < n; i++) { 
            arr[i] = arr[i] + 5; 
        }

        // Iterate through the modified array and print each element
        for (int j = 0; j < n; j++) { 
            System.out.print(arr[j] + " "); 
        }
    }
}
