/*************************************************************************************************************
Pattern 8
Write a Program that takes input n and prints the below pattern 
Input:
n = 4
Expected output:
*
**
***
****

*************************************************************************************************************/

// Solution 1
import java.util.Scanner;
public class Pattern8{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

// Solution 2
import java.util.Scanner;
public class Pattern8{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println("*".repeat(i));
        }
    }
}
