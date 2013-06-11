/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sitarescue;

import javafx.application.Application;
import javafx.event.EventType;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
/**
 *
 * @author Student
 */
public class SitaRescue extends Application {
   
    private FSM fsm;
    
    @Override
    public void start(Stage primaryStage) {
        // TODO: create FSM
        
        primaryStage.setTitle(" Sita Rescue");

        Group root = new Group();
        Scene scene = new Scene(root,800,700, Color.BLUEVIOLET);


        primaryStage.setScene(scene);
        fsm = new FSM(root);
        fsm.loadState(StartState.NAME);
        primaryStage.show();
        
        root.addEventHandler(EventType.ROOT, this); // listen for state change
    }

    
    // main method call
    public static void main(String[] args) {
        launch(args);
    }

}