package com.example.zoomanagementapplication.Controllers;

import com.example.zoomanagementapplication.Model.BigCat;
import com.example.zoomanagementapplication.Model.Cougar;
import com.example.zoomanagementapplication.Model.Lion;
import com.example.zoomanagementapplication.Model.Tiger;

public class AnimalViewController {
        private AnimalView animalView; // The view for displaying animal details
        private AnimalCollection animalCollection; // The model for managing animals

        public AnimalViewController(AnimalView animalView, AnimalCollection animalCollection) {
            this.animalView = animalView;
            this.animalCollection = animalCollection;
        }

        public void addAnimal(String name, int age, String type) {
            Animal animal = createAnimal(type, name, age);
            animalCollection.addAnimal(animal);
            animalView.updateAnimalList(animalCollection);
        }

        private Animal createAnimal(String type, String name, int age) {
            switch (type) {
                case "Lion":
                    return new Lion(name, age, "Fur");
                case "Tiger":
                    return new Tiger(name, age, 2.5); // Example wingspan
                case "Cougar":
                    return new Cougar(name, age, "Freshwater");
                default:
                    return null;
            }
        }

        public void removeAnimal(String name) {
            animalCollection.removeAnimal(name);
            animalView.updateAnimalList(animalCollection);
        }
    }

}
