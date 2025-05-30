/*************************************************************************************************************
🪙GeeksforGeeks - GCD of two numbers
Given two positive integers a and b, find GCD of a and b.
Note: Don't use the inbuilt gcd function
Input: a = 3, b = 6
Output: 3
Explanation: GCD of 3 and 6 is 3
Input: a = 1, b = 1
Output: 1
Explanation: GCD of 1 and 1 is 1
*************************************************************************************************************/

// Solution 1 - Euclidean algorithm  
// Euclidean algorithm principle is GCD(a, b) = GCD(b, a % b)
class Solution {
    public static int gcd(int a, int b) {
        // Loop runs until b becomes 0
        while(b!=0){
            int temp = b;  // Store the current value of b in a temporary variable
            b = a % b;     // Update b to the remainder of a divided by b  
            a = temp;      // Assign the previous value of b (stored in temp) to a
        }
        // When b becomes 0, a contains the GCD
        return a;
    }
}

// Solution 2 - Normal thought process ( Brute-force approach )
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a=sc.nextInt();
        System.out.print("Enter the value of b: ");
        int b=sc.nextInt();
        int n=0;
        int GCD=0;
        // Determine the smaller number between a and b
        if(a<b){
            n=a;
        }else{
            n=b;
        }
        // Iterate from 1 to the smaller number to find common divisors
        for(int i=1;i<=n;i++){
            if(a%i==0 && b%i==0){
                GCD=i;    // If i divides both a and b, update GCD
            }
        }
        System.out.println("The GCD of "+a+" and " +b+" is "+GCD);
    }
}
