/*************************************************************************************************************
Pattern 6
* * * * 
* * * 
* * 
* 
*************************************************************************************************************/
public class Pattern6 {
    public static void main(String[] args) {
        int N = 4;  // Define the number of rows for the pattern
        // Outer loop controls the number of rows
        for (int i = 1; i <= N; i++) {
            // The number of elements in each row decreases as i increases
            // Inner loop prints star from 1 to (N - i + 1)
            for (int j = 1; j <= (N - i + 1); j++) {
                System.out.print("* ");  // Print a star with a space
            }
            System.out.println();  // Move to the next line after printing a row
        }
    }
}
