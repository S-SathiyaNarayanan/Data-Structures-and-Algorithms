import java.util.ArrayList;
import java.util.Scanner;

public class UserDefinedArrayDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ===== STATIC ARRAY WITH USER-DEFINED SIZE =====
        System.out.print("Enter size of static array: ");
        int staticSize = scanner.nextInt();

        int[] staticArray = new int[staticSize];

        System.out.println("Enter " + staticSize + " elements for the static array:");
        for (int i = 0; i < staticSize; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            staticArray[i] = scanner.nextInt();
        }

        System.out.println("\nStatic Array Elements:");
        for (int i = 0; i < staticSize; i++) {
            System.out.println(staticArray[i]);
        }
        System.out.println("Size of static array: " + staticArray.length);

        // ===== DYNAMIC ARRAY WITH USER-DEFINED SIZE =====
        ArrayList<Integer> dynamicArray = new ArrayList<>();

        System.out.print("\nEnter number of elements to add to the dynamic array: ");
        int dynamicSizeInput = scanner.nextInt();

        System.out.println("Enter " + dynamicSizeInput + " elements for the dynamic array:");
        for (int i = 0; i < dynamicSizeInput; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            int value = scanner.nextInt();
            dynamicArray.add(value);
        }

        System.out.println("\nDynamic Array Elements:");
        for (int i = 0; i < dynamicArray.size(); i++) {
            System.out.println(dynamicArray.get(i));
        }
        System.out.println("Size of dynamic array: " + dynamicArray.size());

        scanner.close();
    }
}

