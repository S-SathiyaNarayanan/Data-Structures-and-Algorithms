import java.util.Scanner;

public class NestedForLoop {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter the number of outer loop iterations: ");
    int outerCount = sc.nextInt();
    
    System.out.print("Enter the number of inner loop iterations: ");
    int innerCount = sc.nextInt();
    
    // Outer loop
    for (int i = 1; i <= outerCount; i++) {
      System.out.println("\nOuter Loop : " + i);
      
      // Inner loop
      for (int j = 1; j <= innerCount; j++) {
        System.out.println("  Inner Loop: " + j);
      }
    }
    
    sc.close();
  }
}
