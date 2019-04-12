/**
 * CPSC 219 Group 24 Project: SpaceInvadersT Class
 * 
 * @author: Paula Almeida
 *	    Gabriel Atienza
 *	    Sharon Chan
 *	    Hayden Kerr
 *	    Theresa Lam
 *
 * @date: April 11th, 2019.
 * @version: Textbased Space Invaders class of Space Invaders Textbased Game for interactive demo.
 *
 * URL OF CODE USED AND MODIFIED TO DEVELOP THIS PART OF THE PROGRAM:
 * https://gist.github.com/xSputnicKx/fbf9a329818cff0a4a02f773b22ed9a7?fbclid=IwAR0ojil66TCbkFd4DlJT5zh35pDCxidxa_RFCssuYXWBCaEO2bDXCSfzGk8
 *
 */

/**
 * This class represents a game. It launches the game and quits the game. 
 * 
 * Initializes all elements in the game. Including:
 * Setting up the board
 * Initializing and placing the user's avatar at the designated place for the appropriate level.
 * Placing obstacles and enemies at their designated positions.
 * This is carried out through calls to each object's respective classes.
 * The game has the function of moving avatar and shooting at the aliens through user input
 */
 
  
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;


public class SpaceInvadersT {
	//Instance Variables
	public static int location = 59;
	private static String[] targetQuads = { " ","*", "*", "*", "*", "*"," ", " " , "*", "*", "*", "*", "*"," ", " ", "*", "*", "*", "*", "*"," ", " ", "*", "*", "*", "*", "*"," ", " ", " ", " ", " ", " ", " "," ", " ", " ", " ", " ", " ", " ", " "," ", "-", " ", "-", " ", "-"," ", " " , " ", " ", " ", " ", " ", " ", " ", " ", " ", "X", " ", " ", " "};
	static ArrayList<String> myList = new ArrayList<String>();
	private static int point;
	private static  String sc = "";
//Constructors	
public SpaceInvadersT(int location, String[] targetQuads, int point ){
 this.location = location;
 this.targetQuads = targetQuads;
 this.point = point;
}
//Copy Constructor
public SpaceInvadersT( SpaceInvadersT toCopy) {
	this.location = toCopy.getLocation();
	this.targetQuads = toCopy.getTargetQuads();
	this.point = toCopy.getPoints();
}
//Accessor Methods
/**
* retrives location of the avatar and returns it as an int, which can be indexed into the target quads list containing 
* elements used to print the board.
* @return: Gets location of the avatar and returns as an int
**/
public static int getLocation() {
	return location; 
}
/**
* Retrieves array of targetWuads which is a list of string elements used to create the board
* Contains aliens, barriers and the avatar.
* @return: targetQuads as a string array.
*/
public static String[] getTargetQuads() {
	return targetQuads;
}
/**
* This updates the points for every alien removed from the array. 
* Takes the difference from the original amount of aliens and the current alien to find the number of aliens deleted.
* For each alien deleted it adds 50 points.
*
**/
public static int getPoints() {
int countStars= 0;
	
	for(int i= 1; i < myList.size(); i++)
		if (targetQuads[i] == ("*"))
		countStars++;
	point = 20;
	
	return (point - countStars)*50;
	
}

//Main Method
/**
* This main method handles all input from the user and manages the game
* It initially prints the title along with starting game, where the avatar is in the default position.
* In a board of 7 x 9, The first four rows are designated to 20 aliens centred in a cluster of 5 x 4.
* The barriers are located along the 7th row and are static in their position
* The avatar is located on the 9th row, and is free to move within that row.
* The avatar can only move one space for every turn, with input from the user.
* Commands are as follows:
* "a" to move left
* "d" to move right
* "f" to shoot
* "x" to quit the game
* Invalid input will prompt user to enter correct output to continue the game.
* Movement commands call their respective class
*/

public static void main(String[] args) {
	System.out.println("                          Space Invaders     "); //print title at the top of the screen at the start of the game
	System.out.println ("                            points:" + point); //print the number of points
	
	for (int i = 0; i < targetQuads.length; i++) { 
		myList.add(targetQuads[i]); // adds the string array targetQuads to myList
	}
	for (int i1 = 0; i1 < myList.size(); i1++) {
		System.out.print(myList.get(i1) + "          "); // formats myList containing targetQuad stings into 9 rows of 7.
		if ((i1 + 1) % 7 == 0){
			System.out.println("");
		}
	}
	Scanner input = new Scanner(System.in);
   
	while( sc.equals("x") == false && myList.contains("*") == true) { // While the user does not input x and aliens still exist in the board
		System.out.println("Move character (left 'a' or right 'd'), 'f' to fire and 'x' to quit game."); // ask for user input
        sc = input.next();	
        if (sc.equals("a")) { // if input =  "a" it takes an instance of the class MovementT and calls method moveleft
        	MovementT b = new MovementT();
   		 	b.moveLeft();
        	}	
        	
        if (sc.equals("d")) { // if input =  "d" it takes an instance of the class MovementT and calls method moveRight
        		MovementT b = new MovementT();
       		 	b.moveRight();
        	}
        	
        	}
        if (sc.equals("f")) { //if input = "f" it takes an instance of the class BulletsT and calls method fire
        	 BulletsT a = new BulletsT();
        		 a.fire();
            }
        	
        else if (sc.equals("x")) { // if user input is "x" end game
              System.out.println("Game over");
            }
            
        	else  {
    	        System.out.println("Invalid input, try again"); // if input is invalid, prompts user to input valid input
    	        
    	     }
        
	}
	
}

