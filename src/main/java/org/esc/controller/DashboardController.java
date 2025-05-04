package org.esc.controller;

import javafx.fxml.FXML;

public class DashboardController {

    @FXML
    private void showEtudiants() {
        System.out.println("Navigation vers le module Étudiants...");
    }

    @FXML
    private void showProfs() {
        System.out.println("Navigation vers le module Profs...");
    }

    @FXML
    private void showCours() {
        System.out.println("Navigation vers le module Cours...");
    }

    @FXML
    private void handleLogout() {
        System.out.println("Déconnexion !");
        // TODO : retour à login.fxml
    }
}
