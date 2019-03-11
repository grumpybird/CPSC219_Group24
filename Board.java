/*##################################################################################################################################
Board class will use the height and width to create a central space. The stage itself will be located in the SpaceInvaders class, but
all methods relating to the board itself will be here. Needs methods to draw the board, with the correct size, colour, etc.
##################################################################################################################################*/

/**
 * CPSC 219 Group 24 Project: Board Class
 * 
 * @author: Paula Almeida
 *	    Gabriel Atienza
 *	    Sharon Chan
 *	    Hayden Kerr
 *	    Theresa Lam
 *
 * @date: March 11, 2019.
 *
 * @version: DEMO 2
 *
 */

/**
 *
 */
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.geometry.Pos;
import javafx.scene.Node;

public class Board extends Application {
	
	public static final int BOARD_WIDTH;
	public static final int BOARD_HEIGHT;
	
	public void start(Stage primaryStage) {
        Label score = new Label("SCORE: " + getScore());
	Label lives = new Label("LIVES: " + getLives());
        primaryStage.setScene(new Scene(label, 300, 250));
        primaryStage.setTitle("Space Invaders");
        primaryStage.show();
    	}
	
	public Board drawBoard(board){
		return board;
	}
}
