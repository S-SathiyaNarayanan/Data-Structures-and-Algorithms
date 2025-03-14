/*************************************************************************************************************
Write a program to check whether a triangle can be formed with the given values for the angles. 
If sum of angles is equal to 180, then triangle can be formed, else it can't be formed.
Input: 45 45 45
Expected Output: 
Triangle cannot be formed
*************************************************************************************************************/

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        
        boolean isTriangle = (a > 0 && b > 0 && c > 0) && (a + b + c == 180);
        
        if (isTriangle) {
            System.out.println("Triangle can be formed");
        } else {
            System.out.println("Triangle cannot be formed");
        }
    }
}
