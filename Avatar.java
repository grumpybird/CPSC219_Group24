/**
 * CPSC 219 Group 24 Project: Avatar Class
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
import javafx.event.Event;
import javafx.scene.input.KeyEvent;

/**
 * Class represents the avatar in the game.
 * Avatar class controls the movement of the 
 * avatar as well as attributes such as:
 * name, lives, position, and appearance(not in demo 1).
 *
 * This class only focuses on the movement and health of the
 * avatar. State of health will be updated from classes in the game
 * that handle and track collisions of objects on the board.
 *
 */
public class Avatar {
	
  	//Instance Variables:
 	private boolean alive = True;
 	private int lives = 3;
 	private int locationX;
 	private int locationY;

 	public static final int INITIAL_X;
 	public static final int INITIAL_Y;

  	FileInputStream alienInput = new FileInputStream("CPSC219_Group24/alien.png" );
	private Image alien = new Image(alienInput);

	FileInputStream spriteInput = new FileInputStream("CPSC219_Group24/sprite.png");
	private Image sprite = new Image(spriteInput);

	public Avatar(){

	}

	public void moveLeft(){
	    EventHandler<KeyEvent> moveLeft = new EventHandler<KeyEvent>(){

        }
	}

	public void moveRight(){

	}

	public void avatarCollision(){

	}

	public int getLocationX(){
		return locationX;
	}

	public int getLocationY(){
		return locationY;
	}

	public void setLocationX(amount){
		locationX += amount;
	}

	public void setLocationY(amount){
		locationY += amount;
	}
} 
