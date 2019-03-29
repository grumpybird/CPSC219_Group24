/**
* CPSC 219 Group 24 Project: Alien Class
*
* @author: Paula Almeida
*          Gabriel Atienza
*          Sharon Chan
*          Hayden Kerr
*          Theresa Lam
*
* @date: March 29, 2019.
*
* @version: DEMO 3
*
*/

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.geometry.Rectangle2D;

/**
* Class represents the alien in the game.
* Alien class controls the movement of the alien
* as well as attributes such as:
* lives, position, and apperance. 
*
* This class only focuses on the movement and health of the alien.
*
*/

//implement Aliens in the main app under stage to implement variables, then call constructor
public class Aliens {
    
    //Instance Variables
    private Image enemiesV = new Image(
            "alien1-2.gif");
    boolean rightEnemy = true;
     int MOV = 0;
     int ENEMY_EDGE = 40;
     int ENEMY_ROW = 5;
     int ENEMY_COLUMN = 7;
     int SPEED = 3;
     double Sprite_BoardW = 800;
     static Rectangle pointer = new Rectangle();
     ImageView[] enemies = new ImageView[ENEMY_COLUMN * ENEMY_ROW];
     int updateTime = 65;
    


 /**
 * Movement method sets the image array for the aliens in the stage.
 * @param Pane hbox that allows it when called in the main class SpaceInvaders, whatever
 * the given argument is it will attach the aliens to it.
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
* movementCore checks to see if the enemy or avatar is moving left or right
and then checking for collision as it hits the right side
*/ 
    public void movementCore() {
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
     
     
    }

    


}
