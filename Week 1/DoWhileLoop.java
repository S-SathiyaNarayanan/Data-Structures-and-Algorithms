public class DoWhileLoop {
    public static void main(String[] args) {
        int count = 1; 

        // Do block runs at least once before checking the condition
        do {
            System.out.println("Current Count: " + count);
            count++; // Increment counter
        } while (count <= 5); // Condition to continue the loop
        
        System.out.println("\nLoop Finished!");
    }
}
