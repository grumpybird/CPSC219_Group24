/**
 * CPSC 219 Group 24 Project: Alien Class
 *
 * @author: Paula Almeida
 *	        Gabriel Atienza
 *	        Sharon Chan
 *	        Hayden Kerr
 *	        Theresa Lam
 *
 * @date: April 11th, 2019.
 * @version: Alien class of Space Invaders GUI Game for interactive demo.
 */

package CPSC219_Group24.src.obj;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.geometry.Rectangle2D;
import CPSC219_Group24.src.main.Main;


/**
* implement Aliens in the main app under stage to implement variables, then call constructor
*/
public class Aliens {
    //instance variables
    private static Image enemiesV = new Image("CPSC219_Group24/src/res/alien1-2.gif");
    private static boolean rightEnemy = true;
    public int MOV = 0;
     private static int ENEMY_EDGE = 40;
     private static int ENEMY_ROW = 5;
     private static int ENEMY_COLUMN = 7;
     private static int SPEED = 3;
     public static int score = 0;
     private static double Sprite_BoardW = 800;
     static Rectangle pointer = new Rectangle();
     public static ImageView[] enemies = new ImageView[ENEMY_COLUMN * ENEMY_ROW];
     public int updateTime = 65;

    public Rectangle2D getBoundary(){
        return new Rectangle2D(1, 1, 1, 1);
    }
    /**
    * This movement class class sets the loxaiton (x, y) of each alien
    * There are a total of 35 aliens  initially, set up in 5 rows of 7.
    */
    public void movement(Pane hbox) {
        for (int j = 0; j < ENEMY_ROW ; j++) {
            for (int i = 0; i < ENEMY_COLUMN; i++) {
                enemies[j * ENEMY_COLUMN + i] = new ImageView(enemiesV);
                enemies[j * ENEMY_COLUMN + i].setPreserveRatio(true);
                enemies[j * ENEMY_COLUMN + i].setX(i * 50);
                enemies[j * ENEMY_COLUMN + i].setY(j * 50);
                enemies[j * ENEMY_COLUMN + i].setFitWidth(ENEMY_EDGE);
                hbox.getChildren().add(enemies[j * ENEMY_COLUMN + i]);
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

    /**
    * As the game progresses the aliens will move side to side, and moving down when they reach the edge.
    * the class movementCore keeps track of where the enemies are located
    * checking for collsions with the edge of the screen.
    * WHen there is a collsion with the edge, the enemy will movedown.
    */ 
    public void movementCore(Bullet bulletc, Text punt, Pane pane, ImageView ship) {
        if (rightEnemy) { //check if the enemy is going toward right
            if (pointer.getX() + ENEMY_EDGE >= Sprite_BoardW) { //check collision on right edge
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
        
        if (bulletc != null) {
            score += bulletc.getScore();
            punt.setText("Score: " + score);
        }
        
        if (score == 1700 || ship == null){
            Main.closeStage(Main.getStage());
        }
     
     
    }

    public static int getScore() {
        return score;
    }
}
