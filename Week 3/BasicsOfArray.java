public class ArrayDeclarationDemo {
    public static void main(String[] args) {
        // 1. Declaration and then initialization
        int[] array1; // declaration
        array1 = new int[3]; // initialization
        array1[0] = 5;
        array1[1] = 10;
        array1[2] = 15;

        
        // 2. Declaration and initialization in one line using 'new'
        int[] array2 = new int[] {20, 25, 30};

        // 3. Declaration and initialization using shorthand
        int[] array3 = {35, 40, 45};

        // Print sizes using .length
        System.out.println("Size of array1: " + array1.length);
        System.out.println("Size of array2: " + array2.length);
        System.out.println("Size of array3: " + array3.length);

        // Print all arrays
        System.out.println("\nArray1 elements:");
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }

        System.out.println("\nArray2 elements:");
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }

        System.out.println("\nArray3 elements:");
        for (int i = 0; i < array3.length; i++) {
            System.out.println(array3[i]);
        }
    }
}
