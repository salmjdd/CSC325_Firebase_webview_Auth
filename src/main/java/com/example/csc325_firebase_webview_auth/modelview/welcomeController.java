package com.example.csc325_firebase_webview_auth.modelview;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import com.example.csc325_firebase_webview_auth.App;

import java.io.IOException;


public class welcomeController {

    public static Scene scene;
    @FXML
    private void signInHandler(ActionEvent event) throws IOException {
        App.setRoot("signin.fxml");

    }

    @FXML
    private void signUpHandler(ActionEvent event) throws IOException {
        App.setRoot("signup.fxml");

    }
}
