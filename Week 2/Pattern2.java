import java.util.Scanner; // Import Scanner to read user input
public class Pattern2 {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        int NumOfRows = sc.nextInt();            // Total number of rows in the pattern
        int NumOfElementsPerRow = sc.nextInt();  // Number of elements to print per row

        // Outer loop: Controls the number of rows to print
        for (int i = 1; i <= NumOfRows; i++) {
            // Inner loop: Prints numbers 1 to NumOfElementsPerRow for the current row
            for (int j = 1; j <= NumOfElementsPerRow; j++) {
                System.out.print(j + " "); 
            }
            System.out.println(); // New line after each row
        }
      
    }
}
