/*************************************************************************************************************
🪙GeeksforGeeks - Pattern 10
Geek is very fond of patterns. Once, his teacher gave him a pattern to solve. He gave Geek an integer n and 
asked him to build a pattern. Help Geek to build a star pattern.
Input: 5
Output:
* 
* * 
* * * 
* * * * 
* * * * *
* * * *
* * *
* *
*
*************************************************************************************************************/

public class Pattern9{
    public static void main(String[] args){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=n-1;i>=1;i--){
            for(int j=i;j>=1;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
