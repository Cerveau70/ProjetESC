package org.esc.controller;


import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;

public class LoginController {
    @FXML private TextField usernameField;
    @FXML private PasswordField passwordField;

    @FXML
    private void handleLogin() {
        String user = usernameField.getText();
        String pass = passwordField.getText();

        if ("admin".equals(user) && "1234".equals(pass)) {
            System.out.println("Connexion réussie !");
            // TODO : Rediriger vers dashboard.fxml
        } else {
            System.out.println("Identifiants incorrects.");
        }
    }
}