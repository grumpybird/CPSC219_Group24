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

import java.awt.Rectangle;


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
 	private String name;
  	private char sprite;
 	private int lives;
  	private Rectangle location;
	
	//Constructor:
	/**
	 * Initiates name variable to be compatible with other classes in the program.
	 * Sets default location when starting a game to instance variable.
	 * Sets the appropriate number of lives to the avatar.
	 */
	public Avatar(){
		name = "a";
		sprite = 'o';
		lives = 3;
		location = new Rectangle(2,4);
	}
	
	// Mutator Methods:
	/**
	 * Moves the avatar one position to the right from 
	 * the position where the avatar was positioned when
	 * the method was invoked. 
	 * Takes no parameters.
	 */
	public void moveRight(){
		location.width += 1;
	}
	
	/**
	 * Moves the avatar one position to the left from 
	 * the position where the avatar was positioned when
	 * the method was invoked.  
	 * Takes no parameters.
	 */
	public void moveLeft(){
		location.width -= 1;
	}
	
  // Accessor methods:	
  /**
   * Retrieves and returns location of the avatar at the time when the method was called.
   * @return location - the avatar's position as a rectangle.
   */
  public Rectangle getLocation(){
		return location;
  }
} 
