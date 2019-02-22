public class Board {
 char[][] grid;
	
	public static void main(String[] args) {
		char[][] startConfiguration = new char[3][3];
		for (int row = 0; row < 3; row++) {
			for (int column = 0; column < 3; column++) {
				startConfiguration[row][column] = args[row*3+column].charAt(0)
 
 }
