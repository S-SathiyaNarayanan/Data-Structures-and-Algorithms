import java.util.ArrayList;

public class ArrayTypesDemo {
    public static void main(String[] args) {
        // ======================
        // Static Array (Fixed-size)
        // ======================
        System.out.println("Static Array Demonstration:");
        
        // Declaration and initialization of static array
        int[] staticArray = new int[5];  // Fixed size of 5
        
        // Initialize values
        for(int i = 0; i < staticArray.length; i++) {
            staticArray[i] = i * 10;
        }
        
        // Access elements using length property
        System.out.println("Static array elements:");
        for(int i = 0; i < staticArray.length; i++) {
            System.out.print(staticArray[i] + " ");
        }
        
        // ======================
        // Dynamic Array (ArrayList)
        // ======================
        System.out.println("\n\nDynamic Array (ArrayList) Demonstration:");
        
        // Create an ArrayList (dynamic array)
        ArrayList<Integer> dynamicArray = new ArrayList<>();
        
        // Initial size
        System.out.println("Initial size: " + dynamicArray.size());
        
        // Add elements (automatically resizes)
        dynamicArray.add(10);
        dynamicArray.add(20);
        dynamicArray.add(30);
        
        System.out.println("After adding 3 elements:");
        System.out.println("Elements: " + dynamicArray);
        System.out.println("Size: " + dynamicArray.size());
        
        // Add more elements to demonstrate dynamic resizing
        dynamicArray.add(40);
        dynamicArray.add(50);
        dynamicArray.add(60);
        
        System.out.println("\nAfter adding 3 more elements:");
        System.out.println("Elements: " + dynamicArray);
        System.out.println("New size: " + dynamicArray.size());
        
        // Remove an element
        dynamicArray.remove(2);  // Remove element at index 2 (30)
        System.out.println("\nAfter removing element at index 2:");
        System.out.println("Elements: " + dynamicArray);
        System.out.println("Updated size: " + dynamicArray.size());
    }
}
