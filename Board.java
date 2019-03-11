/*##################################################################################################################################
Board class will use the height and width to create a central space. The stage itself will be located in the SpaceInvaders class, but
all methods relating to the board itself will be here. Needs methods to draw the board, with the correct size, colour, etc.
##################################################################################################################################*/

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
	
	final int BOARD_WIDTH;
	final int BOARD_HEIGHT;
	
	public void Board(){
	
	}
	
	public Board drawBoard(board){
		return board;
	}
}
