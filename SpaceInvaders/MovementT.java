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


import java.util.Collections;

public class MovementT extends SpaceInvadersT{
	
public MovementT () {
	super(getLocation(), getTargetQuads(), getPoints());
	}

public static void moveRight() {
	if (getLocation() < 62) {
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
public static void moveLeft () {
	if (getLocation() > 56) {
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
