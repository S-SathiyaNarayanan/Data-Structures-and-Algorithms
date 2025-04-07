import java.util.ArrayList;
import java.util.Scanner;

public class StaticDynamicArrayDemo {
    public static void main(String[] args) {
        // ===== STATIC ARRAY =====
        int[] staticArray = {10, 20, 30, 40, 50}; // size is fixed

        System.out.println("Static Array Elements:");
        for (int i = 0; i < staticArray.length; i++) {
            System.out.println(staticArray[i]);
        }
        System.out.println("Size of static array: " + staticArray.length);

        // ===== DYNAMIC ARRAY =====
        ArrayList<Integer> dynamicArray = new ArrayList<>();

        // Add elements dynamically using Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter 5 integers to add to the dynamic array:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            int number = scanner.nextInt();
            dynamicArray.add(number); // dynamically adds element
        }

        // Display dynamic array
        System.out.println("\nDynamic Array Elements:");
        for (int i = 0; i < dynamicArray.size(); i++) {
            System.out.println(dynamicArray.get(i));
        }
        System.out.println("Size of dynamic array: " + dynamicArray.size());
        
        scanner.close();
    }
}
