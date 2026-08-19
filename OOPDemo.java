// OOPDemo.java
// Basic example of Object-Oriented Programming in Java

// Class definition
class Student {
    // Data members
    String name;
    int age;

    // Constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Main class
public class OOPDemo {
    public static void main(String[] args) {

        // Creating objects
        Student student1 = new Student("Rahul", 20);
        Student student2 = new Student("Priya", 21);

        // Calling methods
        student1.displayDetails();

        System.out.println();

        student2.displayDetails();
    }
}
