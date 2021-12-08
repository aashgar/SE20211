/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author aashgar
 */
public class Observer1 extends Stage implements Observer{
    private TextField textField;
    private Subject subject;
    
    public Observer1(Subject subject){             
        textField = new TextField();
        textField.setPromptText("Observer1");
        textField.setStyle("-fx-text-fill: blue");
        Button button = new Button("Update");
        button.setOnAction(e->
        this.subject.setData(textField.getText())
        );
    
        VBox vBox = new VBox(textField, button);
        vBox.setSpacing(10);
        vBox.setAlignment(Pos.CENTER);
        FlowPane flowPane = new FlowPane(vBox);
        flowPane.setAlignment(Pos.CENTER);
        flowPane.setStyle("-fx-font-size: 16pt");
        Scene scene = new Scene(flowPane, 300,300);
        this.setScene(scene);
        
        this.subject = subject;
        this.subject.attach(this);
         
    }  

    @Override
    public void update() {
        textField.setText(this.subject.getData().toLowerCase());
    }
    
}
