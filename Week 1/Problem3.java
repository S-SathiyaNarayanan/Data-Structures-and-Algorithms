/*************************************************************************************************************
Given mark of student, Print the Grade
Grade A if mark is greater than or equal to 90
Grade B if mark is greater than or equal to 80
Grade C if mark if greater than or equal to 60
Grade D if mark if greaer than or equal to 35
Fail if mark is lesser than 35
Input: 95
Expected Output:
Grade A
*************************************************************************************************************/

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);
        int mark = scanner.nextInt(); 
        
        if (mark >= 90) {
            System.out.println("Grade A");
        } else if (mark >= 80) {
            System.out.println("Grade B");
        } else if (mark >= 60) {
            System.out.println("Grade C");
        } else if (mark >= 35) {
            System.out.println("Grade D");
        } else {
            System.out.println("Fail");
        }
    }
}
