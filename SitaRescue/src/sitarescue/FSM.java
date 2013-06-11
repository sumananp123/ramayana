/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sitarescue;

import java.util.HashMap;
import javafx.application.Application;
import javafx.scene.Group;

/**
 *
 * @author Student
 */
public class FSM {
    
    private HashMap<String, IState> states;

    private IState currentState;
    private Group root;
    
    public FSM(Group root) {
        this.root = root;
        this.states = new HashMap<>();
        states.put(StartState.NAME, new StartState());
        states.put(StoryState.NAME, new StoryState());
}
    
    public void loadState(String name) {
        if(states.containsKey(name)) {
            IState nextState = states.get(name);
            if(currentState != null) {
                currentState.cleanup();
            }
            nextState.setup(root);
            nextState.start();
            currentState = nextState;
        }
    }
    
}
