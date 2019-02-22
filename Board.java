import java.util.Scanner;

public class TicTacToe {

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
		String targetQuads[] = { "*", "*", "*", "*", "*",  "*", "*", "*", "*", "*",  " ", " ", " ", " ", " ",  " ", " ", "Shield ", " ", " ",  " ", "Shield ", " ", " ", " ",};

		System.out.println("Space Invaders");
			
			// Prints array field
			int i;
			for (i = 0; i < targetQuads.length; i++) {
				System.out.print(targetQuads[i] + ",");
				if ((i + 1) % 5 == 0)
					System.out.println("");
			}
			
			
			
		}
		
	
}
