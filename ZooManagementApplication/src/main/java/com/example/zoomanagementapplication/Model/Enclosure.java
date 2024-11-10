package com.example.zoomanagementapplication.Model;

import java.util.ArrayList;
import java.util.List;

public class Enclosure implements AnimalCollection {
    private String name;
    private List<Animal> animals = new ArrayList<>();

    public Enclosure(String name) {
        this.name = name;
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void removeAnimal(Animal animal) {
        animals.remove(animal);
    }

    @Override
    public void displayAnimals() {
        System.out.println("Enclosure " + name + " contains:");
        for (Animal animal : animals) {
            animal.displayInfo();
        }
    }

    //added to remove error
    @Override
    public List<Animal> getAnimals() {
        return List.of();
    }
}

