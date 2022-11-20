package com.example.javaformpractice;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class HelloController {
    @FXML
    private TextField Age;

    @FXML
    private TextField FirstName;

    @FXML
    private TextField Gender;

    @FXML
    private TextField LastName;

    @FXML
    void onButtonClick(ActionEvent event) {
        //welcomeText.setText(inputID.getText());
        int count=0;

        if (Age.getText().isEmpty()){
            Alert alertAge = new Alert(Alert.AlertType.ERROR);
            alertAge.setContentText("Age is empty;\n");
            alertAge.show();
            count++;
        }
        if(FirstName.getText().isEmpty()){
            Alert alertFirstName = new Alert(Alert.AlertType.ERROR);
            alertFirstName.setContentText("First Name is empty;\n");
            alertFirstName.show();
            count++;
        }
        if(LastName.getText().isEmpty()){
            Alert alertLastName = new Alert(Alert.AlertType.ERROR);
            alertLastName.setContentText("Last Name is empty;\n");
            alertLastName.show();
            count++;
        }
        if(Gender.getText().isEmpty()){
            Alert alertGender = new Alert(Alert.AlertType.ERROR);
            alertGender.setContentText("Gender is empty;\n");
            alertGender.show();
            count++;
        }
        if(count == 0){
            Alert alertSuccess = new Alert(Alert.AlertType.CONFIRMATION);
            alertSuccess.setContentText("User name: " + FirstName.getText() + " " + LastName.getText() + "\nGender: " + Gender.getText() + "\nAge: " + Age.getText() + "\nwas registered");
            alertSuccess.show();

        }

    }
}