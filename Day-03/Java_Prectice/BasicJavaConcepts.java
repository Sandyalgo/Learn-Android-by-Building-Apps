package com.example.chapter2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * This program demonstrates fundamental Java concepts without using OOP principles.
 * It covers data types, control flow, arrays, methods, strings, and exception handling.
 */
class BasicJavaConcepts {

    // A static variable (a constant) accessible throughout the class.
    static final double PI = 3.14159;

    // The main method is the entry point of the program.
    public static void main(String[] args) {

        // --- SECTION 1: DATA TYPES AND VARIABLES ---
        System.out.println("--- 1. DATA TYPES AND VARIABLES ---");

        // Primitive data types
        int number = 10;
        double decimal = 5.75;
        boolean isJavaFun = true;
        char initial = 'J';

        // Non-primitive data type (String)
        String message = "This is a String.";

        System.out.println("Integer: " + number);
        System.out.println("Double: " + decimal);
        System.out.println("Boolean: " + isJavaFun);
        System.out.println("Character: " + initial);
        System.out.println("String: " + message);
        System.out.println();

        // --- SECTION 2: CONTROL FLOW ---
        System.out.println("--- 2. CONTROL FLOW (if/else, for, while) ---");

        // An if-else statement for conditional logic.
        if (number > 5) {
            System.out.println("The number is greater than 5.");
        } else {
            System.out.println("The number is not greater than 5.");
        }

        // A for loop to repeat a block of code a specific number of times.
        System.out.print("For loop from 0 to 4: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // A while loop to repeat code as long as a condition is true.
        System.out.print("While loop from 0 to 2: ");
        int count = 0;
        while (count < 3) {
            System.out.print(count + " ");
            count++;
        }
        System.out.println();

        // A switch statement for multi-way branching.
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Other day");
        }
        System.out.println();

        // --- SECTION 3: ARRAYS ---
        System.out.println("--- 3. ARRAYS ---");

        // Declaring and initializing an array of integers.
        int[] numbersArray = {10, 20, 30, 40, 50};
        System.out.println("Array elements: " + Arrays.toString(numbersArray));

        // Accessing and modifying array elements.
        System.out.println("First element: " + numbersArray[0]);
        numbersArray[0] = 5;
        System.out.println("Modified first element: " + numbersArray[0]);
        System.out.println();

        // --- SECTION 4: METHODS ---
        System.out.println("--- 4. METHODS ---");

        // Calling a method with arguments.
        int sumResult = add(10, 20);
        System.out.println("Sum of 10 and 20 is: " + sumResult);

        // Calling a method with no arguments.
        printMessage();
        System.out.println();

        // --- SECTION 5: STRINGS ---
        System.out.println("--- 5. STRINGS ---");

        String str1 = "Java";
        String str2 = "Programming";
        String combined = str1 + " " + str2;
        System.out.println("Combined string: " + combined);

        System.out.println("Length of combined string: " + combined.length());
        System.out.println("Uppercase: " + combined.toUpperCase());
        System.out.println("Contains 'Java'? " + combined.contains("Java"));
        System.out.println();

        // --- SECTION 6: EXCEPTION HANDLING ---
        System.out.println("--- 6. EXCEPTION HANDLING ---");

        // A try-catch block to handle runtime errors gracefully.
        try {
            int result = 10 / 0; // This will throw an ArithmeticException.
        } catch (ArithmeticException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
        System.out.println();

        // --- SECTION 7: USER INPUT ---
        System.out.println("--- 7. USER INPUT ---");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");
        scanner.close(); // It's good practice to close the scanner.
        System.out.println();

        // --- SECTION 8: RANDOM NUMBERS ---
        System.out.println("--- 8. RANDOM NUMBERS ---");
        Random random = new Random();
        int randomNumber = random.nextInt(100); // Generates a number from 0-99.
        System.out.println("Random number (0-99): " + randomNumber);
    }

    // A static method that takes two integer arguments and returns their sum.
    public static int add(int a, int b) {
        return a + b;
    }

    // A static method with no arguments and no return value (void).
    public static void printMessage() {
        System.out.println("This is a message from a method.");
    }
}