package src.core;

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
import src.obj.Aliens;
import src.obj.Bullet;
import src.obj.EnemyBullet;
import src.obj.Obstacles;

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
    
   
    //exp
    private Bullet bulletc;
    private EnemyBullet bulleta;
    private Image shipV = new Image("src/res/sprite.png");
    private ImageView ship = new ImageView(shipV);
 
    private Text textscore = new Text("SCORE: " + aliensprite.score);
    private Text lifepoint = new Text("LIFE: " + EnemyBullet.life);

    //exp
    private boolean rightEnemy = true;
    private boolean bulletIsAlive = false;
    private boolean newLevel = false;
    public static int life = 3;
    
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

        root.getChildren().add(canvas);
        root.getChildren().add(pane2);
        root.getChildren().add(pane);
       
        pane.setLayoutY(50);
       
        gc = canvas.getGraphicsContext2D();

        //exp
        ship.setPreserveRatio(true);
        ship.setFitWidth(80);
        ship.setX(100);
        ship.setY(680);
        pane.getChildren().add(ship);
        pane2.getChildren().add(textscore);
        pane2.getChildren().add(lifepoint);
        textscore.setFont(Font.font("Comic Sans MS", 24));
        textscore.setFill(Color.LIMEGREEN);
        
        textscore.setX(500);
        textscore.setY(25);
        
        lifepoint.setFont(Font.font("Comic Sans MS", 24));
        lifepoint.setFill(Color.LIMEGREEN);
        lifepoint.setX(100);
        lifepoint.setY(25);
        
        gc.setFill(Color.BLACK);
        gc.fillRect(0, 0, BOARD_WIDTH, BOARD_HEIGHT);

        gc.setFill(Color.LIMEGREEN);
        Font theFont = Font.font("Comic Sans MS", 24);
        gc.setFont(theFont);
        //gc.fillText("LIVES: " + life, 100, 25);

        aliensprite.movement(pane);

        Duration dI = new Duration(aliensprite.updateTime);
        KeyFrame f = new KeyFrame(dI, e -> aliensprite.movementCore(bulletc, textscore, newLevel, pane, ship));
        Timeline tl = new Timeline(f);
        tl.setCycleCount(Animation.INDEFINITE);
        tl.play();
        boardScene.setOnKeyPressed(e -> keyboardManager(e));
        
        Duration d2 = new Duration(650);
        KeyFrame f2 = new KeyFrame(d2, e -> bulleta = new EnemyBullet(10, 10, ship, Aliens.enemies, pane, lifepoint, barrier1, barrier2, barrier3));
        Timeline tl2 = new Timeline(f2);
        tl2.setCycleCount(Animation.INDEFINITE);
        tl2.play();
        
        if (ship == null) {
        	tl2.stop();
        }
        barrier1 = new Obstacles(1);
        barrier2 = new Obstacles(2);
        barrier3 = new Obstacles(3);

        barrier1.drawBarrier(gc);
        barrier2.drawBarrier(gc);
        barrier3.drawBarrier(gc);

        gc.setFill(Color.BLACK);

        return boardScene;
    }
    
    //exp
    public void keyboardManager(KeyEvent ke) {
        if (ke.getCode() == KeyCode.D) {
            double x = ship.getX();
            x += 10;
            ship.setX(x);
        } else if (ke.getCode() == KeyCode.A) {
            double x = ship.getX();
            x -= 10;
            ship.setX(x);
        } else if (ke.getCode() == KeyCode.SPACE) { // shoot
            bulletc = new Bullet(10, 50, ship.getX(), aliensprite.enemies, pane);
            
        }
    }
}
