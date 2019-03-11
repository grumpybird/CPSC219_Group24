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
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.Node

public class Board extends Application {
	
	public static final int BOARD_WIDTH;
	public static final int BOARD_HEIGHT;
	
	public void setBoard(){
	
	}
	
	public void setGUI() {
        	Text playerScore = new Text("SCORE: " + getScore());
		playerScore.setFill(Color.LIMEGREEN);
		playerScore.setFont(Font.font("Monaco", FontWeight.EXTRA_BOLD, 20));
		playerScore.setX();
		playerScore.setY();
		
		Text playerLives = new Text("LIVES: " + getLives());
		playerLives.setFill(Color.LIMEGREEN);
		playerScore.setFont(Font.font("Monaco", FontWeight.EXTRA_BOLD, 20));
		playerLives.setX();
		playerLives.setY();
		
        	primaryStage.setScene(new Scene(label, 300, 250));
        	primaryStage.setTitle("Space Invaders");
    	}
}
