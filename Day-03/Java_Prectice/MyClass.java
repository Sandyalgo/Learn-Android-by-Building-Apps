package com.example.chapter2;

// Main class to demonstrate OOP concepts
class OOPSConcept {

    public static void main(String[] args) {
        // --- INHERITANCE and POLYMORPHISM example ---
        System.out.println("--- Inheritance and Polymorphism Example ---");
        // Creating objects of both the base and derived classes
        Animal myAnimal = new Animal();
        Dog myDog = new Dog("Buddy");

        // Calling methods to demonstrate inheritance
        myAnimal.makeSound(); // Calls the base class method
        myDog.makeSound();    // Calls the overridden derived class method (Polymorphism)
        myDog.eat();          // Calls the inherited method from the base class
        myDog.fetch();        // Calls the specific method of the derived class
        System.out.println();

        // --- ENCAPSULATION example ---
        System.out.println("--- Encapsulation Example ---");
        // Using the Dog class again to demonstrate encapsulation
        // We can't directly access 'name' because it's private
        // myDog.name = "Max"; // This would cause a compile-time error
        System.out.println("Dog's name using getter: " + myDog.getName()); // Accessing via a public getter
        myDog.setName("Max"); // Modifying via a public setter
        System.out.println("Dog's new name: " + myDog.getName());
        System.out.println();

        // --- ABSTRACTION example ---
        System.out.println("--- Abstraction Example ---");
        // We can't create an instance of the abstract class directly
        // Shape myShape = new Shape(); // This would cause an error

        // Creating objects of the concrete classes
        Shape myCircle = new Circle(5.0);
        Shape myRectangle = new Rectangle(4.0, 6.0);

        // Calling the abstract method 'calculateArea'
        // The JVM knows which implementation to call based on the object type (Polymorphism again)
        System.out.println("Area of Circle: " + myCircle.calculateArea());
        System.out.println("Area of Rectangle: " + myRectangle.calculateArea());
    }
}

// -------------------------------------------------------------
// --- INHERITANCE and ENCAPSULATION CLASSES ---

// Base class (Parent)
class Animal {
    // Encapsulation: 'protected' allows subclasses to access, but not other classes
    protected String species;
    public Animal() {
        this.species = "Generic Animal";
    }
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
    public void eat() {
        System.out.println("The animal is eating.");
    }
}

// Derived class (Child) inheriting from Animal
// This demonstrates Inheritance
class Dog extends Animal {
    // Encapsulation: 'private' instance variable
    private String name;
    // Constructor to set the name, and also the species from the parent class
    public Dog(String name) {
        super(); // Calls the constructor of the parent class (Animal)
        this.name = name;
        this.species = "Canine"; // Inherited protected field can be accessed
    }
    // Encapsulation: Public getters and setters for the private variable
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    // Polymorphism: Method overriding
    // This method has the same signature as in the parent class but a different implementation
    @Override
    public void makeSound() {
        System.out.println(name + " barks: Woof! Woof!");
    }
    // A specific method for the Dog class
    public void fetch() {
        System.out.println(name + " is fetching a ball.");
    }
}
// -------------------------------------------------------------
// --- ABSTRACTION CLASSES ---

// Abstract class
// This demonstrates Abstraction. It cannot be instantiated and may contain abstract methods.
abstract class Shape {
    // An abstract method has no body and must be implemented by concrete subclasses
    public abstract double calculateArea();
    // A non-abstract method can also exist in an abstract class
    public void displayInfo() {
        System.out.println("This is a shape.");
    }
}
// Concrete class inheriting from the abstract class
// It must provide an implementation for the abstract method
class Circle extends Shape {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
// Another concrete class
class Rectangle extends Shape {
    private double length;
    private double width;
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    @Override
    public double calculateArea() {
        return length * width;
    }
}