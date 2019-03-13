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

    public static void main(String[] args){
        launch(args);
    }

    public void start(Stage primaryStage){

        primaryStage.setTitle("Space Invaders");

        Group root = new Group();
        Scene boardScene = new Scene(root);
        primaryStage.setScene(boardScene);

        Canvas canvas = new Canvas(BOARD_WIDTH, BOARD_HEIGHT);
        root.getChildren().add(canvas);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        gc.setFill(Color.BLACK);
        gc.fillRect(0, 0, BOARD_WIDTH, BOARD_HEIGHT);

        gc.setFill(Color.LIMEGREEN);
        Font theFont = Font.font("Comic Sans MS", 24);
        gc.setFont(theFont);
        gc.fillText("LIVES: ", 100, 25);
        gc.fillText("SCORE: ", 500, 25);

        primaryStage.show();
    }
}


