/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sitarescue;

import javafx.scene.Group;

/**
 *
 * @author Student
 */
public interface IState {
    public void setup(Group root);
    public void start();
    public void cleanup();
}
