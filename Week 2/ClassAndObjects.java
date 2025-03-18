// Human class with package-private access (default)
class Human {
    // Properties (attributes) of the Human class
    String name;       // Name of the person
    String gender;     // Gender of the person
    int age;           // Age of the person
    String height;     // Height of the person (in meters)
    String weight;     // Weight of the person (in kilograms)
    String occupation; // Occupation of the person

    // Constructor to initialize the object with values for all attributes
    public Human(String name, String gender, int age, String height, String weight, String occupation) {
        this.name = name;           // Set name
        this.gender = gender;       // Set gender
        this.age = age;             // Set age
        this.height = height;       // Set height
        this.weight = weight;       // Set weight
        this.occupation = occupation; // Set occupation
    }

    // Method to display the details of the human (attributes)
    public void displayDetails() {
        // Printing the details of the person
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight);
        System.out.println("Occupation: " + occupation);
    }

    // Method with arguments and parameters: A simple function to calculate BMI
    public void calculateBMI() {
        // Convert height and weight to numeric values for BMI calculation
        double heightInMeters = Double.parseDouble(height.replace("m", "")); // Remove "m" and convert to double
        double weightInKg = Double.parseDouble(weight.replace("kg", ""));    // Remove "kg" and convert to double

        // BMI Formula: BMI = weight (kg) / (height (m) * height (m))
        double bmi = weightInKg / (heightInMeters * heightInMeters);
        System.out.println("BMI: " + bmi); // Output the calculated BMI
    }

    // Method with a return value: A simple function to get a description of the person
    public String getDescription() {
        // Return a description string about the person
        return name + " is a " + age + " years old " + gender + " who works as a " + occupation + ".";
    }
}

// Main class to create objects and interact with the Human class
public class ClassAndObjects {
    public static void main(String[] args) {
        // Creating objects (instances of the Human class)
        Human sathiya = new Human("Sathiya Narayanan", "Male", 24, "1.66m", "69kg", "Software Engineer");
        Human gamana = new Human("Gamana Suresh", "Female", 24, "1.66m", "45kg", "Data Analyst");

        // Calling methods on objects to display details
        System.out.println("Object-1 Details:");
        sathiya.displayDetails();    // Display details of 'sathiya'
        sathiya.calculateBMI();      // Calculate and display BMI of 'sathiya'
        System.out.println("Description: " + sathiya.getDescription()); // Get and display description of 'sathiya'

        System.out.println("\nObject-2 Details:");
        gamana.displayDetails();    // Display details of 'gamana'
        gamana.calculateBMI();      // Calculate and display BMI of 'gamana'
        System.out.println("Description: " + gamana.getDescription()); // Get and display description of 'gamana'
    }
}
