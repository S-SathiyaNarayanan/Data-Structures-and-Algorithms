/*************************************************************************************************************
Given a range [L, R]. The task is to find the sum of all the prime numbers in the given range from L to R both
inclusive.
Input : L = 10, R = 20
Output : Sum = 60
Explanation : Prime numbers between [10, 20] are 11, 13, 17, 19. Therefore sum = 11 + 13 + 17 + 19 = 60
Note: Use sieve of eratosthenes to solve the problem
*************************************************************************************************************/

import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of L: ");
        int L = sc.nextInt();
        System.out.print("Enter the value of R: ");
        int R = sc.nextInt();
        int n = R;
        int sum = 0;
        boolean[] arr = new boolean[n + 1];
        Arrays.fill(arr, true);
        arr[0] = false;
        arr[1] = false;
        // Sieve of Eratosthenes
        for (int i = 2; i * i <= n; i++) {
            if (arr[i]) {
                for (int j = i * i; j <= n; j = j + i) {
                    arr[j] = false;
                }
            }
        }
        // Sum primes in range [L, R]
        for (int i = L; i <= R; i++) {
            if (arr[i]) {
                sum = sum + i;
            }
        }
        System.out.println("Sum = " + sum);
    }
}

