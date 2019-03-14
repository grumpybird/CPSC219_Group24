/* ####################################################################################################################################
Use this class for the behavior of the aliens. I think the best way to do this would be with a timer (nested for loops) and a gridbox,
which has the aliens move between rows and columns at each interval. Timer will also have them shoot, will probably need an if loop
to determine which aliens are on the bottom row, and are therefore permitted to shoot
#####################################################################################################################################*/
import javafx.animation.Animation;
import javafx.animation.AnimationTimer;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

//this works for pane instead of vbox or hbox
//implement Aliens in the main app under stage to implement variables, then call constructor
public class Aliens extends Application{
  //instance variables
   static Rectangle pointer = new Rectangle();
   boolean rightEnemy = true;
	 public int MOV = 0;
  
  Image enemiesV = new Image(
            "alien1.gif");
   Image enemiesVI = new Image(
            "alien2.gif");
   ImageView[] enemies = new ImageView[ENEMY_COLUMN * ENEMY_ROW];
   int updateTime = 28;
  
  class movement {
            if (rightEnemy) { //check if the enemy is going toward right
            if (pointer.getX() + ENEMY_EDGE >= SCREEN_WIDTH) { //check collision on right edge
                rightEnemy = false;
                for (int i = 0; i < enemies.length; i++) {
                    if (enemies[i] != null) {
                        enemies[i].setY(enemies[i].getY() + 50);
                    }
                }
            }
            for (int i = 0; i < enemies.length; i++) {
                if (enemies[i] != null) {
                    enemies[i].setX(enemies[i].getX() + SPEED); //move the enemy 
                }
            }
            pointer.setX(pointer.getX() + SPEED); //move the pointer
        } else {
            if (pointer.getX() - ((ENEMY_EDGE * (ENEMY_COLUMN + 2))) <= 0) {
                rightEnemy = true;
                for (int i = 0; i < enemies.length; i++) {
                    if (enemies[i] != null) {
                        enemies[i].setY(enemies[i].getY() + 50);
                    }
                }
            }
            for (int i = 0; i < enemies.length; i++) {
                if (enemies[i] != null) {
                    enemies[i].setX(enemies[i].getX() - SPEED);
                }
            }
            pointer.setX(pointer.getX() - SPEED);
        }
        MOV++; //animation block 
        if (MOV == 20) { //first frame
            for (int j = 0; j < enemies.length; j++) {
                if (enemies[j] != null) {
                    enemies[j].setImage(enemiesVI);
                }
            }
        } else if (MOV == 40) { //second frame
            for (int j = 0; j < enemies.length; j++) {
                if (enemies[j] != null) {
                    enemies[j].setImage(enemiesV);
                }
            }
            MOV = 0;
        }
  }
  // call this in the main app
  
   public void alientemplate() {
        for (int j = 0; j < ENEMY_ROW; j++) {
            for (int i = 0; i < ENEMY_COLUMN; i++) {
                enemies[j * ENEMY_COLUMN + i] = new ImageView(enemiesV);
                enemies[j * ENEMY_COLUMN + i].setPreserveRatio(true);
                enemies[j * ENEMY_COLUMN + i].setX(i * 50);
                enemies[j * ENEMY_COLUMN + i].setY(j * 50);
                enemies[j * ENEMY_COLUMN + i].setFitWidth(ENEMY_EDGE);
                pane.getChildren().add(enemies[j * ENEMY_COLUMN + i]);
                if (i == ENEMY_COLUMN - 1 && j == 0) {
                    pointer.setWidth(ENEMY_EDGE);
                    pointer.setHeight(ENEMY_EDGE);
                    pointer.setFill(Color.TRANSPARENT);
                    pointer.setX(enemies[i].getX() + ENEMY_EDGE);
                }
            }
        }
        updateTime-=3;
    }
  
  public void animation (){
    
    Duration dI = new Duration(updateTime);
        KeyFrame f = new KeyFrame(dI, e -> movementCore());
        Timeline tl = new Timeline(f);
        tl.setCycleCount(Animation.INDEFINITE);
        tl.play(); 
  }
 
   
   //
  
  
}
