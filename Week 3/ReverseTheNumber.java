/*************************************************************************************************************
Write a program that gets n as input and print the reverse of the number
Input:
n = 325345
Output:
543523
*************************************************************************************************************/
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n=sc.nextInt();
        int ReversedNumber=0;
        while(n>0){
            int LastDigit=n%10;    // Get the last digit
            ReversedNumber=ReversedNumber*10+LastDigit;    // Append it to reversed number
            n=n/10;    // Remove the last digit
        }
        // Value of n becomes 0
        System.out.println("The Reversed value is "+ReversedNumber);
    }
}
