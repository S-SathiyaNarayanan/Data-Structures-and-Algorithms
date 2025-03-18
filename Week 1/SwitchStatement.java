import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a day number (1-7): ");
        int day = scanner.nextInt();
        
        // Use a switch when you have one variable and need to check it against multiple fixed values using exact matches
        // Use switch with: byte, short, char, int, String (Java 7+), and enum (Java 5+)
        // Avoid switch with: long, float, double, boolean, and non-String objects

        // Switch statement to determine and print the day name
        switch (day) {
            case 1:
                System.out.println("The day is Monday");
                break;
            case 2:
                System.out.println("The day is Tuesday");
                break;
            case 3:
                System.out.println("The day is Wednesday");
                break;
            case 4:
                System.out.println("The day is Thursday");
                break;
            case 5:
                System.out.println("The day is Friday");
                break;
            case 6:
                System.out.println("The day is Saturday");
                break;
            case 7:
                System.out.println("The day is Sunday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}
