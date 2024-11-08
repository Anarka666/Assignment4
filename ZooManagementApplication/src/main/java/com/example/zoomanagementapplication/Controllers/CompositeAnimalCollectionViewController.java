package com.example.zoomanagementapplication.Controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class CompositeAnimalCollectionViewController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}