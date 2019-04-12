/**
 * CPSC 219 Group 24 Project: MovementT Class
 * 
 * @author: Paula Almeida
 *	    Gabriel Atienza
 *	    Sharon Chan
 *	    Hayden Kerr
 *	    Theresa Lam
 *
 * @date: March 1, 2019.
 * @version: Textbased Space Invaders class for interactive demo.
 */


import java.util.Collections;

public class MovementT extends SpaceInvadersT{

//Constructor	
public MovementT () { //gets current state of the game, ie: location of everything, points and state of all elements in the array.
	super(getLocation(), getTargetQuads(), getPoints());
	}
//Mutator Method
/**
* When the user uses the comand to move right, this method shifts the avatar one column over to the right.
* Does this by checking the current location and 1 to the right.
* This is done by swapping the element to the immediate right of the avatar in the list.
* Limits are set, so that the avatar only moves within the 9th row.
* if they reach the limit, an output message tells the user they can't go any farther, and repromts for valid input.
*/
public static void moveRight() {
	if (getLocation() < 62) { //makes sure avatar cannot shift along any other row than the 9th, or off the board.
		Collections.swap(myList, getLocation(), getLocation() + 1);
		location = location + 1;
		System.out.println ("                            points:" + getPoints());
			for (int i = 0; i < myList.size(); i++) {
				System.out.print(myList.get(i) + "          ");
					if ((i + 1) % 7 == 0){
						System.out.println("");
					}
			}	
	
	}
	else 
		System.out.println("Sorry can't move farther right.");
	
}
/**
* When the user uses the comand to move left, this method shifts the avatar one column over to the left.
* Does this by checking the current location and 1 to the left.
* This is done by swapping the element to the immediate left of the avatar in the list.
* Limits are set, so that the avatar only moves within the 9th row.
* if they reach the limit, an output message tells the user they can't go any farther, and repromts for valid input.
*/
public static void moveLeft () {
	if (getLocation() > 56) {//makes sure avatar cannot shift along any other row than the 9th, or off the board.
		Collections.swap(myList, getLocation(), getLocation() - 1); 
		location = location - 1;
		System.out.println ("                            points:" + getPoints());
		for (int i = 0; i < myList.size(); i++) {
			System.out.print(myList.get(i) + "          ");
			if ((i + 1) % 7 == 0){
				System.out.println("");
			}
		}
	
	}
	else 
		System.out.println("Sorry can't move farther left.");	
	
}


}
