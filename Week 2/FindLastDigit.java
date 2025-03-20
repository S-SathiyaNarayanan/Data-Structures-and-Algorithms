import java.util.Scanner;
public class FindLastDigit{
    public static void main(String[] args){
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int N=sc.nextInt();
        
        // When you divide a number by 10, the remainder is always the last digit of that number. 
        // The `%` (modulus) operator gives that remainder, which is why `N % 10` extracts the last digit.
        int LastDigit = N % 10;
        System.out.println("Last digit: "+LastDigit);
    }
}
