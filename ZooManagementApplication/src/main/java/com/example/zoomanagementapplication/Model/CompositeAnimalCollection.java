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
}

