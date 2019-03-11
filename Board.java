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
import javafx.scene.Node;

public class Board {
	
	public static final double BOARD_WIDTH = 800;
	public static final double BOARD_HEIGHT = 600;

	public void Board(){
		setGUI();
	}
	
	public void setGUI() {
		Text playerScore = new Text("SCORE: ");
		playerScore.setFill(Color.LIMEGREEN);
		playerScore.setFont(Font.font("Monaco", FontWeight.EXTRA_BOLD, 20));
		playerScore.setX(100);
		playerScore.setY(100);
		
		Text playerLives = new Text("LIVES: ");
		playerLives.setFill(Color.LIMEGREEN);
		playerScore.setFont(Font.font("Monaco", FontWeight.EXTRA_BOLD, 20));
		playerLives.setX(200);
		playerLives.setY(100);

    	}
}
