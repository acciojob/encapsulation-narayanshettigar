package com.driver;


// Main.java
public class Main {
    public static void main(String[] args) {
        // Task 3
        RWOnly obj = new RWOnly();
        // Task 4
        // this will give error, because the variable is private
        // obj.name = "John Doe"; 
        // System.out.println(obj.name);

        // Task 5
        obj.setName("John Doe");
        // Task 6
        System.out.println(obj.getName()); // Output: "John Doe"
    }
}
