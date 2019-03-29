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
 * @version: DEMO 2
 * For demo 2 our program is currently interactive with the user through the arrowkeys,
 * moving the avatar left and right from the input. When the main program runs, aliens, barriers and avatars are displayed on
 * the screen. Defaults for each objects are specified in their respective class.
 *
 * URL OF CODE USED AND MODIFIED TO DEVELOP THIS PART OF THE PROGRAM:
 * https://gist.github.com/xSputnicKx/fbf9a329818cff0a4a02f773b22ed9a7?fbclid=IwAR0ojil66TCbkFd4DlJT5zh35pDCxidxa_RFCssuYXWBCaEO2bDXCSfzGk8
 *
 */

import javafx.animation.Animation;
import javafx.animation.AnimationTimer;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.input.KeyEvent;
import javafx.event.EventHandler;
import javafx.util.Duration;
import java.util.HashSet;

import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 * Space invaders is our main class, which handles most of the functions. It starts the game and handles input from user
 *It draws all the objects, such as aliens, barriers and avatar using javafx. At the current stafe it handles animation
 * for the aliens.
 */


public class SpaceInvaders extends Application {

    //Instance Variables
    Group root = new Group();
    Group root2 = new Group();
    VBox box = new VBox();
    
    HBox hbox = new HBox();
    
    Aliens aliensprite = new Aliens();
    
    
    Bullet bulletc;
    
    boolean rightEnemy = true;
    boolean bulletIsAlive = false;
    boolean newLevel = true;
    
    private static final double BOARD_WIDTH = 800;
    private static final double BOARD_HEIGHT = 800;

    private static HashSet<String> currentlyActiveKeys;
    private static Scene boardScene;
    private static Avatar player;
    private static GraphicsContext gc;
    private static Obstacles barrier1;
    private static Obstacles barrier2;
    private static Obstacles barrier3;
    private Projectile fromAvatar;

/**
 * It uses an image view to store the images into an arraylist of the aliens, sets the width of the blocks using the instance
 * variables ENEMY_EDGE. Also in a 7 by 5 arrangment. Sets the size of the image of each alien.
 */

    /**
     * Launches program and starts game
     */
    public static void main(String[] args) {
        launch(args);
    }

    /**
     * This makes the stage and scenes for everything in the game. Displays all information relevant to user including the Lives,
     * score, aliens, barriers and avatar. Also has an animation tiemr to time the movements of the aliens
     */
    @Override
    public void start(Stage primaryStage) {

        primaryStage.setTitle("Space Invaders");
        

        boardScene = new Scene(root, BOARD_WIDTH, BOARD_HEIGHT);
        primaryStage.setScene(boardScene);

        Canvas canvas = new Canvas(BOARD_WIDTH, BOARD_HEIGHT);
       
        root2.getChildren().add(canvas);
        root.getChildren().add(root2);
        root.getChildren().add(hbox);
        gc = canvas.getGraphicsContext2D();
        
        
        
        root.getChildren().add(box);

        PrepareActionHandler();

        gc.setFill(Color.BLACK);
        gc.fillRect(0, 0, BOARD_WIDTH, BOARD_HEIGHT);

        gc.setFill(Color.LIMEGREEN);
        Font theFont = Font.font("Comic Sans MS", 24);
        gc.setFont(theFont);
        gc.fillText("LIVES: ", 100, 25);
        gc.fillText("SCORE: ", 500, 25);

        aliensprite.movement(root2);

        Duration dI = new Duration(aliensprite.updateTime);
        KeyFrame f = new KeyFrame(dI, e -> aliensprite.movementCore());
        Timeline tl = new Timeline(f);
        tl.setCycleCount(Animation.INDEFINITE);
        tl.play();

        barrier1 = new Obstacles(1);
        barrier2 = new Obstacles(2);
        barrier3 = new Obstacles(3);

        barrier1.drawBarrier(gc);
        barrier2.drawBarrier(gc);
        barrier3.drawBarrier(gc);

        gc.setFill(Color.BLACK);

        player = new Avatar();
        player.drawAvatar(gc);


        new AnimationTimer() {
            public void handle(long currentNanoTime) {
                actionHandler();
                fromAvatar = new Projectile();
                if (fromAvatar.intersects(barrier1)) {
                    fromAvatar.setIntersect(true);
                    System.out.println("shot hit");
                    fromAvatar = null;
                }
            }
        }.start();

        primaryStage.show();
    }

    /**
     * Method to take input from user. Everytime a key is pressed it includes it in a list, and deletes it when its released allowing
     * handler to user press more than 1 key at a time
     */

    public static void PrepareActionHandler() {

        currentlyActiveKeys = new HashSet<String>();

        boardScene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            public void handle(KeyEvent event) {
                currentlyActiveKeys.add(event.getCode().toString());
            }
        });

        boardScene.setOnKeyReleased(new EventHandler<KeyEvent>() {
            public void handle(KeyEvent event) {
                currentlyActiveKeys.remove(event.getCode().toString());
            }
        });
    }

    /**
     * Moves take the input in the list and initiates it onto the avatar. Can move left, right and eventually shoots.
     * avatar moves by removing previous location of avatar and drawing new location of avatar in its place.
     */
    public void actionHandler() {

        if (currentlyActiveKeys.contains("LEFT")) {
            player.moveLeft();
            player.drawAvatar(gc);
        }

        if (currentlyActiveKeys.contains("RIGHT")) {
            player.moveRight();
            player.drawAvatar(gc);
        }

        if (currentlyActiveKeys.contains("SPACE")) {
            fromAvatar.avatarShoot(player, gc);
        }
    }
}
/**
 * Sets the limits of the movement of the alien and the blank rectangle (spacing between aliens).
 * Also sets condition for the aliens to move downwards after hitting the sides.
 */


