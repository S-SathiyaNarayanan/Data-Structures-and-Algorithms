import java.util.Scanner; // Import Scanner class for user input
public class Pattern1{
    public static void main(String[] args){
      
        Scanner sc = new Scanner(System.in);
        int inner = sc.nextInt();    // number of rows to print
        int outer = sc.nextInt();    // number of stars to print in each row
        
        // Outer loop: controls the number of rows in the pattern
        for(int i = 1; i <= inner; i++){
            // Inner loop: prints number of stars for the current row
            for(int j = 1; j <= outer; j++){
                System.out.print("* ");    // Print a star followed by a space
            }
            // Move to the next line after completing all columns in the current row
            System.out.println();
        }
      
    }
}
