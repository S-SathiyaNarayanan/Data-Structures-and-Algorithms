public class Main {
    public static void main(String[] args) {
        int n = 3250345; 
        int counteven = 0;    // Counter for even digits
        int countodd = 0;     // Counter for odd digits

        // Loop through each digit of the number
        while (n > 0) {
            int LastDigit = n % 10;    // Extract the last digit

            
            // Check if the digit is even or odd and update the counters
            if (LastDigit % 2 == 0) {
                counteven++;    // Increment even counter
            } else {
                countodd++;    // Increment odd counter
            }

            n = n / 10;    // Remove the last digit from the number
        }

        // Print the count of even and odd digits
        System.out.println("no of even digits is " + counteven);
        System.out.println("no of odd digits is " + countodd);
    }
}

