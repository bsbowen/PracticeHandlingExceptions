
package org.example;

// Declare the Person class
public class Person {

    // Declare a private field for name
    private String name;

    // Declare a private field for age
    private int age;

    // Constructor for the Person class
    public Person(String name, int age) {

        // Check if the name is null, empty, or longer than 40 characters
        if (name == null || name.isEmpty() || name.length() > 40) {
            // Throw an IllegalArgumentException with a specific message if the name is invalid
            throw new IllegalArgumentException("Name must not be empty, null or greater than 40 characters!");
        }

        // Check if the age is outside the range of 0 to 120
        else if (age < 0 || age > 120) {
            // Throw an IllegalArgumentException with a specific message if the age is out of range
            throw new IllegalArgumentException("Age out of range");
        }

        // Assign the valid name to the field
        this.name = name;

        // Assign the valid age to the field
        this.age = age;
    }

    // Getter method for name
    public String getName() {
        // Return the name
        return name;
    }

    // Getter method for age
    public int getAge() {
        // Return the age
        return age;
    }
}