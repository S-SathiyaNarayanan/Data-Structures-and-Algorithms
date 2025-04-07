public class ArrayDemo {
    public static void main(String[] args) {
        // 1. Declaration and initialization separately
        int[] numbers1;          // Declaration
        numbers1 = new int[3];   // Initialization with size 3
        
        // Assigning values individually
        numbers1[0] = 10;
        numbers1[1] = 20;
        numbers1[2] = 30;

        // 2. Declaration with direct initialization
        int[] numbers2 = {40, 50, 60, 70};  // Size automatically determined
        
        // 3. Using new keyword with explicit values
        String[] cities = new String[] {"Paris", "London", "Berlin"};
        
        // 4. Declaration then initialization with default values
        double[] prices;
        prices = new double[4];  // All elements initialized to 0.0

        // Demonstrating array length property
        System.out.println("\nArray lengths:");
        System.out.println("numbers1 length: " + numbers1.length);  // 3
        System.out.println("numbers2 length: " + numbers2.length);  // 4
        System.out.println("cities length: " + cities.length);      // 3
        System.out.println("prices length: " + prices.length);      // 4

        // Using length in array operations
        System.out.println("\nnumbers1 elements:");
        for(int i = 0; i < numbers1.length; i++) {
            System.out.println("Index " + i + ": " + numbers1[i]);
        }

        System.out.println("\ncities elements:");
        for(int i = 0; i < cities.length; i++) {
            System.out.println(cities[i].toUpperCase());
        }

        // Accessing elements using length
        System.out.println("\nLast elements:");
        System.out.println("Last number: " + numbers2[numbers2.length - 1]);
        System.out.println("Last city: " + cities[cities.length - 1]);
    }
}
