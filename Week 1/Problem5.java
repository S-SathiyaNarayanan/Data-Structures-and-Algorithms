/*************************************************************************************************************
Write a program which takes two values x and y. Prints x for y number of times.
Input:
2 
3
Expected Output:
2
2
2
*************************************************************************************************************/

import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        
        for (int i = 0; i < y; i++) {
            System.out.println(x);
        }
    }
}
