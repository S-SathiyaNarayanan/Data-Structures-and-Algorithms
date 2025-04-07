import java.util.ArrayList;
import java.util.Scanner;

public class StaticDynamicArrayWithSize {
    public static void main(String[] args) {
        // ===== STATIC ARRAY =====
        int[] staticArray = {10, 20, 30, 40, 50}; // fixed size
        int staticSize = staticArray.length; // size of static array

        System.out.println("Static Array Elements:");
        for (int i = 0; i < staticSize; i++) {
            System.out.println(staticArray[i]);
        }
        System.out.println("Size of static array: " + staticSize);

        // ===== DYNAMIC ARRAY =====
        ArrayList<Integer> dynamicArray = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter 5 integers to add to the dynamic array:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            int number = scanner.nextInt();
            dynamicArray.add(number); // dynamic insert
        }

        int dynamicSize = dynamicArray.size(); // size of dynamic array

        System.out.println("\nDynamic Array Elements:");
        for (int i = 0; i < dynamicSize; i++) {
            System.out.println(dynamicArray.get(i));
        }
        System.out.println("Size of dynamic array: " + dynamicSize);

        scanner.close();
    }
}
