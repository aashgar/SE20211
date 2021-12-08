/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 *
 * @author aashgar
 */
public class MainApp extends Application{
    private Subject subject = new Subject();
    @Override
    public void start(Stage primaryStage) throws Exception {         
       Observer1 observer1 = new Observer1(subject);
       Observer2 observer2 = new Observer2(subject);
       observer1.setX(200);
       observer2.setX(700);
       observer1.setY(100);
       observer2.setY(100);
       observer1.show();
       observer2.show();
    }
    public static void main(String[] args) {
        launch(args);
        
    }
  
}
