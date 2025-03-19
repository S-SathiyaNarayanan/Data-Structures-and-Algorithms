/*************************************************************************************************************
Pattern 3
1 
1 2 
1 2 3 
1 2 3 4 
*************************************************************************************************************/
public class Main {
    public static void main(String[] args) {
        int N = 4; // Number of rows in the pattern 
        // Outer loop to control the number of rows
        for (int i = 1; i <= N; i++) { 
            // Inner loop to print numbers from 1 to i in each row
            for (int j = 1; j <= i; j++) { 
                System.out.print(j + " "); // Print the current value of j
            } 
            System.out.println(); // Move to the next line after printing each row
        }
    }
}
