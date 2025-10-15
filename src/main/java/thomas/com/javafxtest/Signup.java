package thomas.com.javafxtest;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.awt.*;

public class Signup extends Application {
    @Override
    public void start(Stage primaryStage) {
        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(20, 20, 20, 20));
        grid.setAlignment(Pos.CENTER);
        grid.setStyle("-fx-background-color: #f0f0f0; -fx-border-radius:10; -fx-background-radius: 10");
        javafx.scene.control.Label nameLabel = new javafx.scene.control.Label("Full Name :");
        javafx.scene.control.TextField nameField = new TextField();
        grid.add(nameLabel, 0, 0);
        grid.add(nameField, 1, 0);

        javafx.scene.control.Label EmailLabel = new javafx.scene.control.Label("Full Email :");
        javafx.scene.control.TextField EmailField = new TextField();
        grid.add(EmailLabel, 0, 1);
        grid.add(EmailField, 1, 1);
        //passoword

        javafx.scene.control.Label passwordLabel = new javafx.scene.control.Label("Enter password :");
        javafx.scene.control.PasswordField passwordField = new javafx.scene.control.PasswordField();
        grid.add(passwordLabel, 0, 2);
        grid.add(passwordField, 1, 2);

        javafx.scene.control.Label ConPasswordLabel = new javafx.scene.control.Label("Confirm password :");
        javafx.scene.control.PasswordField ConPasswordField = new javafx.scene.control.PasswordField();
        grid.add(ConPasswordLabel, 0, 3);
        grid.add(ConPasswordField, 1, 3);


        Label messageLabel = new Label();
        grid.add(messageLabel, 1, 5);


        javafx.scene.control.Button signUpButton = new Button("Sign in");
        grid.add(signUpButton, 1, 4);
        signUpButton.setStyle("""
                                     -fx-background-color: #4CAF50;
                                     -fx-text-fill: white;
                                     -fx-font-weight:bold;
                                     -fx-padding: 8 16 8 16;
                                     -fx-background-radius: 6;
                                  """);

        Scene scene = new Scene(grid, 300, 400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Sign Up form");
        primaryStage.show();
        signUpButton.setOnAction(e -> {
            String name = nameField.getText();
            String email = EmailField.getText();
            String password = passwordField.getText();
            String confirm = ConPasswordField.getText();

            if (name.isEmpty() || email.isEmpty() || password.isEmpty() || confirm.isEmpty()) {
                messageLabel.setText("Please fill all fields!");
            } else if (!password.equals(confirm)) {
                messageLabel.setText("Passwords do not match!");
            } else {
                messageLabel.setText("Signup successful!");
            }
        });
    }

        public static void main(String[] args) {
        launch(args);
    }
}
