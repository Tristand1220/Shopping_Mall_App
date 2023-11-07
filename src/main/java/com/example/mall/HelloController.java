package com.example.mall;




import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.Parent;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController {

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Label errorLabel;

    @FXML
    private void exit(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    private void login(ActionEvent event) throws IOException {
        String username = usernameField.getText();
        String password = passwordField.getText();

        // Your static username-password pairs
        String customerUsername = "customer";
        String customerPassword = "customer123";
        String staffUsername = "staff";
        String staffPassword = "staff123";
        String ceoUsername = "ceo";
        String ceoPassword = "ceo123";

        if (username.equals(customerUsername) && password.equals(customerPassword)) {
            errorLabel.setText(""); // Clear error message
            // TODO: Handle customer login
            switchScene(event, "shoppingmall.fxml");
        } else if (username.equals(staffUsername) && password.equals(staffPassword)) {
            errorLabel.setText(""); // Clear error message
            // TODO: Handle staff login
            switchScene(event, "staffinterface.fxml");
        } else if (username.equals(ceoUsername) && password.equals(ceoPassword)) {
            errorLabel.setText(""); // Clear error message
            // TODO: Handle CEO login
            switchScene(event, "CEOinterface.fxml");
        } else {
            errorLabel.setVisible(true);

        }
    }
    private void switchScene(ActionEvent event,String fxmlFileName) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlFileName));
        Scene newScene = new Scene(loader.load());
        Stage primaryStage = (Stage) ((Node)event.getSource()).getScene().getWindow();

        primaryStage.setScene(newScene);
        primaryStage.show();
    }
}

