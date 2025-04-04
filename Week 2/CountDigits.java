/*************************************************************************************************************
Write a program that gets n as input and print the number of digits in the number
Input : 
325345
Expected output:
6
*************************************************************************************************************/
// Solution 1
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int N = sc.nextInt();
        int LastDigit=0;
        int count = 0;
        
        // Loop to count the number of digits in the given number
        while(N>0){
            LastDigit = N % 10; // Extract the last digit
            count = count + 1;   // Increment the digit count
            N = N / 10;          // Remove the last digit from the number
        }
        
        // Display the total number of digits
        System.out.println("The number of digits is "+count);
    }
}

// Solution 2
public class Main{
    public static void main(String[] args){
        int n=325345;
        int count=0;
        while(n>0){
            n=n/10;
            count++;
        }
        System.out.println(count);
    }
}
