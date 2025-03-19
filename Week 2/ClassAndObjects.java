// Human class with package-private access (default)
class Human {
    // Properties (attributes) of the Human class
    String name;       // Name of the person
    String gender;     // Gender of the person
    int age;           // Age of the person
    double height;     // Height of the person (in meters, e.g. 1.66)
    double weight;     // Weight of the person (in kilograms, e.g. 69.0)
    String occupation; // Occupation of the person

    // Constructor to initialize the object with values for all attributes
    public Human(String name, String gender, int age, double height, double weight, String occupation) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.height = height;   // Expecting a numeric value like 1.66
        this.weight = weight;   // Expecting a numeric value like 69.0
        this.occupation = occupation;
    }

    // Method to display the details of the person
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight);
        System.out.println("Occupation: " + occupation);
    }

    // Method to calculate and display the BMI of the person
    public void calculateBMI() {
        // BMI formula: weight / (height * height)
        double bmi = weight / (height * height);
        System.out.println("BMI: " + bmi);
    }

    // Method to get a description of the person
    public String getDescription() {
        return name + " is a " + age + " years old " + gender + " who works as a " + occupation + ".";
    }
}

// Main class to create objects and interact with the Human class
public class ClassAndObjects {
    public static void main(String[] args) {
        // Creating objects (instances of the Human class)
        Human sathiya = new Human("Sathiya Narayanan", "Male", 24, 1.66, 69.0, "Software Engineer");
        Human gamana = new Human("Gamana Suresh", "Female", 24, 1.66, 45.0, "Data Analyst");

        // Displaying details and calculating BMI for the first object
        System.out.println("Object-1 Details:");
        sathiya.displayDetails();
        sathiya.calculateBMI();
        System.out.println("Description: " + sathiya.getDescription());

        System.out.println("\nObject-2 Details:");
        gamana.displayDetails();
        gamana.calculateBMI();
        System.out.println("Description: " + gamana.getDescription());
    }
}
