import java.util.Scanner;

public class Board {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int a = 1;
		int n = 0;
		Boolean player1 = false;
		Boolean player2 = false;
		Boolean positionMessage = false;
		Boolean quadFound = false;
		String answer;
		String player;
		String quadrants[] = { "Q1", "Q2", "Q3", "Q4", "Q5", "Q6", "Q7", "Q8", "Q9", "Q10", "Q11", "Q12", "Q13",
				      "Q14", "Q15", "Q16", "Q17", "Q18", "Q19", "Q20", "Q21", "Q22" , "Q23", "Q24", "Q25"
				     };
		String targetQuads[] = { "*", "*", "*", "*", "*",  "*", "*", "*", "*", "*",  " ", " ", " ", " ", " ",  " ", " ", " ", " ", " ",  " ", " ", " ", " ", " ",};

		System.out.println("Space Invaders");
		while (a <= 9) {
			// Resets boolean variables for each iteration
			quadFound = false;
			positionMessage = false;
			
			// Alternate player turns
			if (n % 2 == 0) {
				player = "x";
				System.out.println("It's your turn Player 1. (X)");
			} else {
				player = "o";
				System.out.println("It's your turn Player 2. (O)");
			}
			// Input player quadrant
			System.out.println("What quadrant do you want? (Q1-Q9)");
			answer = input.nextLine();
			
			int i;
			outerloop:
			for (i = 0; i < quadrants.length; i++) {
				if (answer.equals(quadrants[i]) && " " != targetQuads[i].intern()) {
					positionMessage = true;
					quadFound = true;
					a--;
					break outerloop;
				}
				if (answer.equalsIgnoreCase(quadrants[i])) {
					targetQuads[i] = player;
					quadFound = true;
				}
			}
			/*
			 * Checks player win conditions
			 * after every turn of the game
			 */
			
			// Horizontal wins P1
			if (targetQuads[0] == "x" && targetQuads[1] == "x" && targetQuads[2] == "x") {
				player1 = true;
				a = 9;
			}
			if (targetQuads[3] == "x" && targetQuads[4] == "x" && targetQuads[5] == "x") {
				player1 = true;
				a = 9;
			}
			if (targetQuads[6] == "x" && targetQuads[7] == "x" && targetQuads[8] == "x") {
				player1 = true;
				a = 9;
			}
			// Vertical wins P1
			if (targetQuads[0] == "x" && targetQuads[3] == "x" && targetQuads[6] == "x") {
				player1 = true;
				a = 9;
			}
			if (targetQuads[1] == "x" && targetQuads[4] == "x" && targetQuads[7] == "x") {
				player1 = true;
				a = 9;
			}
			if (targetQuads[2] == "x" && targetQuads[5] == "x" && targetQuads[8] == "x") {
				player1 = true;
				a = 9;
			}
			// Diagonal wins P1
			if (targetQuads[0] == "x" && targetQuads[4] == "x" && targetQuads[8] == "x") {
				player1 = true;
				a = 9;
			}
			if (targetQuads[2] == "x" && targetQuads[4] == "x" && targetQuads[6] == "x") {
				player1 = true;
				a = 9;
			}
			
			// Horizontal wins P2
			if (targetQuads[0] == "o" && targetQuads[1] == "o" && targetQuads[2] == "o") {
				player2 = true;
				a = 9;
			}
			if (targetQuads[3] == "o" && targetQuads[4] == "o" && targetQuads[5] == "o") {
				player2 = true;
				a = 9;
			}
			if (targetQuads[6] == "o" && targetQuads[7] == "o" && targetQuads[8] == "o") {
				player2 = true;
				a = 9;
			}
			// Vertical wins P2
			if (targetQuads[0] == "o" && targetQuads[3] == "o" && targetQuads[6] == "o") {
				player2 = true;
				a = 9;
			}
			if (targetQuads[1] == "o" && targetQuads[4] == "o" && targetQuads[7] == "o") {
				player2 = true;
				a = 9;
			}
			if (targetQuads[2] == "o" && targetQuads[5] == "o" && targetQuads[8] == "o") {
				player2 = true;
				a = 9;
			}
			// Diagonal wins P2
			if (targetQuads[0] == "o" && targetQuads[4] == "o" && targetQuads[9] == "o") {
				player2 = true;
				a = 9;
			}
			if (targetQuads[2] == "o" && targetQuads[4] == "o" && targetQuads[6] == "o") {
				player2 = true;
				a = 9;
			}
			
			// Prints array field
			for (i = 0; i < targetQuads.length; i++) {
				System.out.print(targetQuads[i] + ",");
				if ((i + 1) % 5 == 0)
					System.out.println("");
			}
			
			// Prints out error messages if the player does not follow rules

			if(positionMessage == true) {
				System.out.println("That position is already used.");
			}
			if(quadFound == false && positionMessage == false) {
				System.out.println("The string " + '"' + answer + '"' + " did not match any quadrant number. (Q1-Q9)");
				a--;
			}
			
			n++;
			a++;
			
		}
		
		// Checks the winner
		if (player1) {
			System.out.println("Player 1 wins!");
			System.exit(0);
		}
		if (player2) {
			System.out.println("Player 2 wins!");
			System.exit(0);
		}
		else {
			System.out.println("It's a draw!");
		    System.exit(0);
		}
	}
}
