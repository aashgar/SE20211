/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRS;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author aashgar
 */
public class LoginScreen extends Application{
    private TextField textFieldLoginName;
    private PasswordField passwordField;
    private Label labelInfo, labelStatus;
    private Button buttonSubmit, buttonClear;
    @Override
    public void start(Stage primaryStage) throws Exception {
        textFieldLoginName = new TextField();
        textFieldLoginName.setPromptText("Login Name");
        passwordField = new PasswordField();
        passwordField.setPromptText("Password");
        labelInfo = new Label("Login Information");
        labelStatus = new Label("Status ...");
        VBox vBox1 = new VBox(labelInfo, textFieldLoginName,
                passwordField, labelStatus);
        vBox1.setAlignment(Pos.CENTER);
        vBox1.setSpacing(10);
        
        buttonSubmit = new Button("Submit");
        buttonClear = new Button("Clear");
        buttonSubmit.setOnAction(new MyEventHandler());
        buttonClear.setOnAction(new MyEventHandler());
        HBox hBox1 = new HBox();
        hBox1.setSpacing(20);
        hBox1.setAlignment(Pos.CENTER);
        hBox1.getChildren().addAll(buttonSubmit, buttonClear);
        
        VBox vBox2 = new VBox(vBox1, hBox1);
        vBox2.setStyle("-fx-border-color: blue");
        vBox2.setPadding(new Insets(20, 20, 20, 20));
        
        FlowPane flowPane = new FlowPane(vBox2);
        flowPane.setAlignment(Pos.CENTER);
        Scene scene = new Scene(flowPane, 400, 400);
        scene.getStylesheets().add("file:./src/CRS/styles.css");
        primaryStage.setScene(scene);       
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
    private class  MyEventHandler implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent event) {
            if(event.getSource() == buttonSubmit)
                labelStatus.setText("Submit Pressed");
            else if(event.getSource() == buttonClear)
                labelStatus.setText("Clear Clear");
        }
        
    }
    
}
