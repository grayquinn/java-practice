// Define a Person class with attributes and methods
public class Person {

    // Attributes
    private String name;
    private int age;

    // Constructor to initialize the object
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display person's details
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

// Main class to run the program
public class Main {
    public static void main(String[] args) {
        // Create a new Person object
        Person person = new Person("Alice", 30);

        // Call the displayInfo method
        person.displayInfo();

        // Update person's age
        person.setAge(31);

        // Display updated info
        person.displayInfo();
    }
}
