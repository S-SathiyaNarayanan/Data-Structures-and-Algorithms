/*************************************************************************************************************
Write a program to get firstName and lastName and n as input and print fullName that is firstName+lastName 
for n number of times.
Input:
Sathiya  
Narayanan  
5  
Expected output:
SathiyaNarayanan  
SathiyaNarayanan  
SathiyaNarayanan  
SathiyaNarayanan  
SathiyaNarayanan  
Explanation :- Sathiya is the firstName, Narayanan is the lastName, and n is 5, so the expected output has 
SathiyaNarayanan printed 5 times.
*************************************************************************************************************/

import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();
        int n = scanner.nextInt();
      
        String fullName = firstName + lastName;
      
        for (int i = 0; i < n; i++) {
            System.out.println(fullName);
        }
    }
}
