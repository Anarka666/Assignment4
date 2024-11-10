package com.example.zoomanagementapplication.Model;

import java.util.ArrayList;
import java.util.List;

public class CompositeAnimalCollection implements AnimalCollection {
    private String name;
    private List<AnimalCollection> animalCollections = new ArrayList<>();

    public CompositeAnimalCollection(String name) {
        this.name = name;
    }

    public void addEnclosure(AnimalCollection animalCollection) {
        animalCollections.add(animalCollection);
    }

    public void removeEnclosure(AnimalCollection animalCollection) {
        animalCollections.remove(animalCollection);
    }

    @Override
    public void displayAnimals() {
        System.out.println("Animals in " + name + ":");
        for (AnimalCollection collection : animalCollections) {
            collection.displayAnimals();
        }
    }

    private List<Animal> collections = new ArrayList<>();
    public String getName() {
        return name;
    }

    public void addAnimal(Animal animal) {
        collections.add(animal);
    }
    public List<Animal> getAnimals() {
        return collections;
    }
    public void removeAnimal(Animal animal) {
        collections.remove(animal);
    }
}
