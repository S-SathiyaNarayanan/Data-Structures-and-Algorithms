import java.util.Scanner; // Import Scanner class for user input
public class Pattern1{
    public static void main(String[] args){
      
        Scanner sc = new Scanner(System.in);
        int NumOfRows = sc.nextInt();           // number of rows to print
        int NumOfStarsPerRow = sc.nextInt();    // number of stars to print in each row
        
        // Outer loop: controls the number of rows in the pattern
        for(int i = 1; i <= NumOfRows; i++){
            // Inner loop: prints number of stars for the current row
            for(int j = 1; j <= NumOfStarsPerRow; j++){
                System.out.print("* ");    // Print a star followed by a space
            }
            // Move to the next line after completing all columns in the current row
            System.out.println();
        }
      
    }
}
