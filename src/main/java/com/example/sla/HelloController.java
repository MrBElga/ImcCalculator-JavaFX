package com.example.sla;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    public BorderPane painel;
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    public void onBtInfo(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("PainelInfo.fxml"));
        painel.setCenter(fxmlLoader.load());
    }

    public void onBtHisto(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("PainelHistorico.fxml"));
        painel.setCenter(fxmlLoader.load());
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try {
            this.onBtInfo(null);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}