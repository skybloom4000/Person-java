public class Person {
    // Fields for the person's name, age, and address
    private String name;
    private int age;
    private String address;

    // Constructor to initialize the fields
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Method to display the person's details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }

    // Method that accepts a Person object and calls the displayDetails method
    public void myDetails(Person person) {
        person.displayDetails();
    }

    // Method to print the current instance of the Person object
    public void printCurrentInstance() {
        myDetails(this);
    }

    // Main method to demonstrate the functionality
    public static void main(String[] args) {
        // Create an object of the Person class
        Person grace = new Person("Grace", 22 , " 123, Kiambu, Kenya");
        
        // Use the object to call the printCurrentInstance method
        grace.printCurrentInstance();
    }
}
