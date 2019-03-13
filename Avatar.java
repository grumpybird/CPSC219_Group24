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
import javafx.scene.image.Image;

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

 	private static final double INITIAL_AVATAR_X = 362.5;
 	private static final double AVATAR_Y = 550;
 	private static final int AVATAR_VELOCITY_X = 14;
 	private static final Image SPRITE = new Image("sprite.png");
 	private static final int SPRITE_WIDTH = 75;
    private static final int SPRITE_HEIGHT = 50;

    private boolean alive;
    private int lives;
    private double locationX;

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

	public void drawAvatar(GraphicsContext gc){
        gc.drawImage(SPRITE, locationX, AVATAR_Y, SPRITE_WIDTH, SPRITE_HEIGHT);
    }

	public void moveLeft(){
        locationX -= AVATAR_VELOCITY_X;
	}

	public void moveRight(){
        locationX += AVATAR_VELOCITY_X;
	}

	public double getLocationX(){
		return locationX;
	}

	public double getLocationY(){
		return AVATAR_Y;
	}

} 
