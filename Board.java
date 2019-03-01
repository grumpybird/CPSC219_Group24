/**
 * CPSC 219 Group 24 Project: Board Class
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
 * Code used from:
 * https://gist.github.com/xSputnicKx/fbf9a329818cff0a4a02f773b22ed9a7?fbclid=IwAR0ojil66TCbkFd4DlJT5zh35pDCxidxa_RFCssuYXWBCaEO2bDXCSfzGk8
 *
 */


import java.util.ArrayList;

/**
 * Represents the game board.
 * Not developed fully for demo 1, instead used as a starting point.
 * Relevant code is present in the SpaceInvaders Class for demo 1 to make the game run.
 * Builds and manages the game board.
 * Sets up the board as a 5 x 5 grid with 25 positions in total.
 * "Invaders" are positioned in the top 2 rows across 5 collumns.
 * Avatar is positioned as a default spawn point at the bottom center.
 * Avatar is constrained to only move on the 5th row of the board.
 * Shields are positioned on the 4th row down. Number & strenght dependent on level.
 *
 */
public class Board {
		//CODE USED AND MODIFIED TO DEVELOP THIS PART OF THE PROGRAM. SEE TOP OF THE FILE FOR ORIGINAL CODE URL.

		String quadrants[] = { "Q1", "Q2", "Q3", "Q4", "Q5", "Q6", "Q7", "Q8", "Q9", "Q10", "Q11", "Q12", "Q13",
				      "Q14", "Q15", "Q16", "Q17", "Q18", "Q19", "Q20", "Q21", "Q22" , "Q23", "Q24", "Q25"
				     };
		String targetQuads[] = { "*", "*", "*", "*", "*",  "*", "*", "*", "*", "*",  " ", " ", " ", " ", " ",  "-", " ", "-", " ", "-", " ", " ", "X ", " ", " ",};
	
		// adds the spaceship
		
		
		// Prints array field
		public String drawBoard()
		{
		int i;
		for (i = 0; i < targetQuads.length; i++) {
			System.out.print(targetQuads[i] + "          ");
			if ((i + 1) % 5 == 0)
				System.out.println("");
		}
		public String getBoard() {
			return targetQuads;
		}
			
	
			
		}
		
}
