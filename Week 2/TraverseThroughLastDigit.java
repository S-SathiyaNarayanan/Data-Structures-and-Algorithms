import java.util.Scanner;
public class TraverseThroughLastDigit{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int N=sc.nextInt();
        int LastDigit=0;
        System.out.println("Traversing through Last Digits");
        while(N>0){
            LastDigit=N%10;
            N=N/10;
            System.out.println(LastDigit);;
        }
    }
}

