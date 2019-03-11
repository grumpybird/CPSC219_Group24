/**
 * CPSC 219 Group 24 Project: Board Class
 * 
 * @author: Paula Almeida
 *	    Gabriel Atienza
 *	    Sharon Chan
 *	    Hayden Kerr
 *	    Theresa Lam
 *
 * @date: March 1, 2019.
 *
 * @version: DEMO 1
 *
 * URL OF CODE USED AND MODIFIED TO DEVELOP THIS PART OF THE PROGRAM:
 * https://gist.github.com/xSputnicKx/fbf9a329818cff0a4a02f773b22ed9a7?fbclid=IwAR0ojil66TCbkFd4DlJT5zh35pDCxidxa_RFCssuYXWBCaEO2bDXCSfzGk8
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

public class SpaceInvaders extends Application {

	public static final double BOARD_WIDTH = 800;
	public static final double BOARD_HEIGHT = 600;
	
	public void start(Stage primaryStage){
		primaryStage.setTitle("Space Invaders");
		Group root = new Group();

		Scene mainScene = new Scene(root, BOARD_WIDTH, BOARD_HEIGHT, Color.BLACK);
		mainScene.setFill(Color.BLACK);

		Canvas canvas = new Canvas(BOARD_WIDTH, BOARD_HEIGHT);
		GraphicsContext gc = canvas.getGraphicsContext2D();

		root.getChildren().add(canvas);
		primaryStage.show();
	}

	public static void main(String[] args){
		launch(args);
		Board board = new Board();
	}
}


