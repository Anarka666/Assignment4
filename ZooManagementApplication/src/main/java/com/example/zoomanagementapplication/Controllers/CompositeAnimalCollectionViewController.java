package com.example.zoomanagementapplication.Controllers;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import com.example.zoomanagementapplication.Model.CompositeAnimalCollection;
import com.example.zoomanagementapplication.Model.Animal;

public class CompositeAnimalCollectionViewController {

    @FXML
    private Label collectionNameLabel;

    @FXML
    private ListView<String> enclosureListView;

    private CompositeAnimalCollection collection;

    public void setCollection(CompositeAnimalCollection collection) {
        this.collection = collection;
        collectionNameLabel.setText(collection.getName());

        // Clear previous items and add animal names
        enclosureListView.getItems().clear();

        // Add animal names from the collection (converted to String)
        for (Object obj : collection.getAnimals()) {
            if (obj instanceof Animal) {
                Animal animal = (Animal) obj;
                enclosureListView.getItems().add(animal.getClass().getSimpleName());  // Add only the class name (e.g., "Lion", "Tiger")
            }
        }
    }

    @FXML
    private void onViewButtonClick() {
        // Create a new window (Stage) for displaying "Tiger Habitat" and "Tiger Cubs"
        Stage newStage = new Stage();
        VBox layout = new VBox(20);
        layout.setStyle("-fx-padding: 20;");

        // Add the ListView and buttons (to match the format of the first window)
        ListView<String> newListView = new ListView<>();
        newListView.getItems().addAll("Tiger Habitat", "Tiger Cubs");

        Button viewButton = new Button("View");
        Button backButton = new Button("Back");

        // Add event handlers for the buttons
        viewButton.setOnAction(e -> {
            // Handle the view button logic (e.g., opening more details or navigation)
            System.out.println("View button clicked.");
        });

        backButton.setOnAction(e -> {
            // Handle back button logic (e.g., closing this window and returning to the previous one)
            newStage.close();
        });

        // Add the ListView and buttons to the layout
        layout.getChildren().addAll(newListView, viewButton, backButton);

        // Set the scene for the new window
        Scene scene = new Scene(layout, 300, 200);
        newStage.setScene(scene);
        newStage.setTitle("Tiger Details");

        // Make the first window modal
        Stage currentStage = (Stage) collectionNameLabel.getScene().getWindow();
        newStage.initModality(Modality.APPLICATION_MODAL);
        newStage.initOwner(currentStage);

        // Show the new window
        newStage.show();
    }

    @FXML
    private void onBackButtonClick() {
        Stage stage = (Stage) collectionNameLabel.getScene().getWindow();
        stage.close();
    }
}