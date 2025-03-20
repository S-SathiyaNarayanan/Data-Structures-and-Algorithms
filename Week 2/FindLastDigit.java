import java.util.Scanner;
public class FindLastDigit{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int N=sc.nextInt();
        int LastDigit=N%10;
        System.out.println("Last digit: "+LastDigit);
    }
}
