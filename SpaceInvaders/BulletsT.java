/**
 * CPSC 219 Group 24 Project: BulletsT Class
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
public class BulletsT extends SpaceInvadersT{
// Constructor
public BulletsT () { //gets current state of game
super(getLocation(), getTargetQuads(), getPoints());
}

//Mutator Method
/**
* When the user uses the command to fire, THis method is called
* It takes the coordinates of where the avatar is currently located and fires a bullet
* The bullet moves up the column
* A collision is registered when the method checks if there is either barrier or alien in the path of the bullet.
* It gets rid of the object involved in the collision
* If there are no more aliens on the board, it tells the user they won the game and ends the turn
*
*/

public static void fire() {
	int count = 1; //count variable initiated to help check for collisions.
	//checks for collisions by checking each row along the tragectory of the bullet for any obstacle. 
	for (count = 1; count<=8 ;count++) {
	 if (getTargetQuads()[(getLocation() - 7*(count))].equals (" ") == false){
		 getTargetQuads()[(getLocation() - 7*count)] = " ";
  		myList.set((getLocation() - 7*(count)), " ");
  		break;	
	 }
	}
	System.out.println ("                            points:" + getPoints());//displays points on-screen.
  	for (int i = 0; i < myList.size(); i++) {//prints updated board and elements.
  		System.out.print(myList.get(i) + "          ");
  		if ((i + 1) % 7 == 0){
		System.out.println("");
				}
  			}
  	if (myList.contains("*") == false) {//if no aliens left in array, you won.
  		System.out.println("YOU WON!!!");
  	}
}
}
