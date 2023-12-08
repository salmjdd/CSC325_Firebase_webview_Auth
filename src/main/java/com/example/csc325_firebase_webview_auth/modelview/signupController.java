package com.example.csc325_firebase_webview_auth.modelview;

import com.example.csc325_firebase_webview_auth.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import com.example.csc325_firebase_webview_auth.App;
import javafx.scene.control.TextField;

import java.io.IOException;


public class signupController {
    @FXML
    TextField usernameText;
    @FXML
    TextField passwordText;
    @FXML
    private void signUpbuttonHandler(ActionEvent event) throws IOException {
        //signUp(usernameText.getText(),passwordText.getText());
        App.setRoot("AccessFBView.fxml");
    }

    private void signUp(String username, String password) throws IOException {
        App.setRoot("AccessFBView.fxml");
    }


}
