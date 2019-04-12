/**
 * CPSC 219 Group 24 Project: ScreenController Class
 * 
 * @author: Paula Almeida
 *	    Gabriel Atienza
 *	    Sharon Chan
 *	    Hayden Kerr
 *	    Theresa Lam
 *
 * @date: April 11th, 2019.
 * @version: ScreenController class of Space Invaders GUI Game for interactive demo.
 */

package core;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;

import java.util.HashMap;

/**
*
*
*/
public class ScreenController {
    //Instance Variables:
    private HashMap<String, Pane> screenMap = new HashMap<>();
    private Scene main;
    
    //Constructors:
    public ScreenController(Scene main) {
        this.main = main;
    }

    //Mutator Methods:
     /**
     *
     */
    public void addScreen(String name, Pane pane){
        screenMap.put(name, pane);
    }
    
     /**
     *
     */
    public void removeScreen(String name){
        screenMap.remove(name);
    }

     /**
     *
     */
    public void activate(String name){
        main.setRoot( screenMap.get(name) );
    }
}
