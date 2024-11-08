package com.example.zoomanagementapplication.Model;

import java.util.List;

public interface AnimalCollection {
    // Adds an animal to the collection (could be an Enclosure or a CompositeAnimalCollection)
    void addAnimal(Animal animal);

    // Removes an animal from the collection
    void removeAnimal(Animal animal);

    // Displays the list of animals in the collection
    void displayAnimals();

    // Returns a list of all animals in the collection
    List<Animal> getAnimals();
}

