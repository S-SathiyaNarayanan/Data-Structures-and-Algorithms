/*************************************************************************************************************
Write a program that takes an integer, then a string, then a char from the user and prints them in the screen.
Input:  2 Name y
Expected Output:
2
Name
y
*************************************************************************************************************/

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        
        Scanner inputReader = new Scanner(System.in);

        int number = inputReader.nextInt();
        String word = inputReader.next();
        char letter = inputReader.next().charAt(0);

        System.out.println(number);
        System.out.println(word);
        System.out.println(letter);
    }
}
