/*************************************************************************************************************
Pattern 5
1 2 3 4  
1 2 3 
1 2  
1  
*************************************************************************************************************/

// Solution 1
public class Pattern5 {
    public static void main(String[] args) {
        int N = 4;    // Define the number of rows for the pattern
        // Outer loop controls the number of rows
        for (int i = 1; i <= N; i++) {
            // The number of elements in each row decreases as i increases
            // Inner loop prints numbers from 1 to (N - i + 1)
            for (int j = 1; j <= (N - i + 1); j++) {
                System.out.print(j + " ");    // Print the number with a space
            }
            System.out.println();    // Move to the next line after printing a row
        }
    }
}

// Solution 2
public class Main{
    public static void main(String[] args){
        int n=4;
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
