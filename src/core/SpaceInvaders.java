/**
* CPSC 219 Group 24 Project: SpaceInvaders Class
* 
* @author: Paula Almeida
*	    Gabriel Atienza
*	    Sharon Chan
*	    Hayden Kerr
*	    Theresa Lam
*
* @date: April 11th, 2019.
* @version: Space Invaders class of Space Invaders GUI Game for interactive demo.
*/
package core;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.util.Duration;
import obj.Aliens;
import obj.Bullet;
import obj.Obstacles;

/**
 * Space invaders is our main class, which handles most of the functions. It starts the game and handles input from user
 *It draws all the objects, such as aliens, barriers and avatar using javafx. At the current stafe it handles animation
 * for the aliens.
 */

public class SpaceInvaders{

    //Instance Variables
    private Group root = new Group();
    private Pane pane = new Pane();
    private Pane pane2 = new Pane();
    private Aliens aliensprite = new Aliens();
    private Bullet bulletc;
    private EnemyBullet bulleta;
    private Image shipV = new Image("res/sprite.png");
    private ImageView ship = new ImageView(shipV);
    private Text textscore = new Text("SCORE: " + aliensprite.score);
    private boolean rightEnemy = true;
    private boolean bulletIsAlive = false;
    private boolean newLevel = true;
    private static final double BOARD_WIDTH = 800;
    private static final double BOARD_HEIGHT = 800;
    private static Scene boardScene;
    private static GraphicsContext gc;
    private static Obstacles barrier1;
    private static Obstacles barrier2;
    private static Obstacles barrier3;
    public Scene GameScreen() {

        boardScene = new Scene(root, BOARD_WIDTH, BOARD_HEIGHT);
        Canvas canvas = new Canvas(BOARD_WIDTH, BOARD_HEIGHT);

        root.getChildren().add(canvas); //adds canvas to scene
	    root.getChildren().add(pane2); //adds pane2 to scene
	    root.getChildren().add(pane); //adds pane to scene
	    pane.setLayoutY(50); // spaces the starting of the aliens
       
        gc = canvas.getGraphicsContext2D(); //graphic context variable
        ship.setPreserveRatio(true); // prevents source image of ship from changing
	    ship.setFitWidth(80); // setting how big the image is
	    ship.setX(100); // set x coordinate of ship to 100
	    ship.setY(680); // set y coordinate of ship to 680
	    pane.getChildren().add(ship); // adds ship to pane
	    pane2.getChildren().add(textscore); // adds text score to pane2
          
        textscore.setFont(Font.font("Comic Sans MS", 24)); // Sets font style and size
        textscore.setFill(Color.LIMEGREEN); //sets color to lime green
        
        textscore.setX(500); // sets x coordinate of textscore
	    textscore.setY(25); //set y coordinate of textscore
        
        gc.setFill(Color.BLACK); // background set to black
	    gc.fillRect(0, 0, BOARD_WIDTH, BOARD_HEIGHT); //setting background height and width starting at (0,0)

        gc.setFill(Color.LIMEGREEN); //sets color to lime green
	    Font theFont = Font.font("Comic Sans MS", 24); // Sets font style and size
	    gc.setFont(theFont); 
	    gc.fillText("LIVES: ", 100, 25); //text added

        aliensprite.movement(pane); // Calling the movement method in the alien class
        // animation of alien movement
        Duration dI = new Duration(aliensprite.updateTime);
        KeyFrame f = new KeyFrame(dI, e -> aliensprite.movementCore(bulletc, textscore, newLevel, pane));
        Timeline tl = new Timeline(f);
        tl.setCycleCount(Animation.INDEFINITE);
        tl.play();
        boardScene.setOnKeyPressed(e -> keyboardManager(e));
        // Creation of barriers
        barrier1 = new Obstacles(1);
        barrier2 = new Obstacles(2);
        barrier3 = new Obstacles(3);
        //adds barriers on the board
        barrier1.drawBarrier(gc);
        barrier2.drawBarrier(gc);
        barrier3.drawBarrier(gc);

        gc.setFill(Color.BLACK);

        return boardScene;
    }
    
//manages user Input
    public void keyboardManager(KeyEvent ke) {
        if (ke.getCode() == KeyCode.D) { //Moves ship right
            double x = ship.getX();
            x += 10;
            ship.setX(x);
        } else if (ke.getCode() == KeyCode.A) {// moves ship left
            double x = ship.getX();
            x -= 10;
            ship.setX(x);
        } else if (ke.getCode() == KeyCode.SPACE) { // shoot
            bulletc = new Bullet(10, 50, ship.getX(), aliensprite.enemies, pane);
            bulleta = new EnemyBullet(10, 50, ship, aliensprite.enemies, pane);
        }
    }
}
