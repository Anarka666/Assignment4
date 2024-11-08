package com.example.zoomanagementapplication.Model;

public abstract class Animal {
    private String name;
    private int age;

    // Constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Abstract method for animal sound (polymorphism)
    public abstract void makeSound();

    // Display animal information
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

