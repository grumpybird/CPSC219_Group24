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
 * @version: DEMO 2
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
import javafx.scene.image.Image;

/**
 * Class represents the avatar in the game.
 * Avatar class controls the movement of the 
 * avatar as well as attributes such as:
 * name, lives, position, and appearance.
 *
 * This class only focuses on the movement and health of the
 * avatar. State of health will be updated from classes in the game
 * that handle and track collisions of objects on the board.
 *
 */
public class Avatar {

	// Instance variables
 	private static final double INITIAL_AVATAR_X = 362.5;
 	private static final double AVATAR_Y = 550;
 	private static final int AVATAR_VELOCITY_X = 14;
 	private static final Image SPRITE = new Image("sprite.png");
 	private static final int SPRITE_WIDTH = 75;
    private static final int SPRITE_HEIGHT = 50;

    private boolean alive;
    private int lives;
    private double locationX;

	// Constructor
	public Avatar(){
        double locationY = AVATAR_Y;
        int velocityX = AVATAR_VELOCITY_X;
        Image avatarSprite = SPRITE;
        int width = SPRITE_WIDTH;
        int height = SPRITE_HEIGHT;

        alive = true;
        lives = 3;
        locationX = INITIAL_AVATAR_X;
	}

	// drawAvatar method uses the GraphicsContext to draw the sprite for the avatar, and overwrite the previous
	// Instance of the sprite
	public void drawAvatar(GraphicsContext gc){
        gc.fillRect(0, 550, 800, 50);
        gc.drawImage(SPRITE, locationX, AVATAR_Y, SPRITE_WIDTH, SPRITE_HEIGHT);
    }

	// moveLeft method moves the avatar a given distance to the left, so long as it is not at the left edge of the board
	public void moveLeft(){
	    if (locationX - AVATAR_VELOCITY_X >= 0) {
            locationX -= AVATAR_VELOCITY_X;
        }
	    else{

        }
	}

	// moveLeft method moves the avatar a given distance to the right, so long as it is not at the right edge of the board
	public void moveRight(){
	    if (locationX + AVATAR_VELOCITY_X <= 725){
            locationX += AVATAR_VELOCITY_X;
        }
        else{

        }
	}

	// Getter methods
	public double getLocationX(){
		return locationX;
	}

	public double getLocationY(){
		return AVATAR_Y;
	}

} 
