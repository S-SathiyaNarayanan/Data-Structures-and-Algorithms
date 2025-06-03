// Solution 1
import java.util.Scanner;
public class FindFirstDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int N = sc.nextInt();
        int FirstDigit = N;       // Initialize FirstDigit with the given number
        int LastDigit = N % 10;   // Extract the last digit using modulo operation
        // Loop to extract the first digit by continuously dividing by 10
        while (FirstDigit >= 10) {          // Loop runs until only one digit remains
            FirstDigit = FirstDigit / 10;   // Remove the last digit in each iteration
        }
        System.out.println("The first digit is " + FirstDigit);
        System.out.println("The last digit is " + LastDigit);
    }
}

// Solution 2
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        int LD=n%10;
        int FD=0;
        while(n!=0){
            FD=n;
            n=n/10;
        }
        System.out.println("The first digit is "+FD);
        System.out.println("The last digit is "+LD);
    }
}
