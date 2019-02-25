import java.util.Scanner;
import java.util.ArrayList;

public class SpaceInvaders2 {
	
	
  public static void main(String[] args) {
	System.out.println("       Space Invaders     ");
	
	String targetQuads[] = { "*", "*", "*", "*", "*",  "*", "*", "*", "*", "*",  " ", " ", " ", " ", " ",  "-", " ", "-", " ", "-", " ", " ", "X ", " ", " ",};
	
	int i;
	for (i = 0; i < targetQuads.length; i++) {
		System.out.print(targetQuads[i] + "          ");
		if ((i + 1) % 5 == 0)
			System.out.println("");
	}
	
    Avatar a = new Avatar();
    Board b = new Board();
    Scanner input = new Scanner(System.in);
    String sc = "";
  
    while ((sc.equals("x") == false))
    {
    	System.out.println("Move character (left 'a' or right 'd') or 'x' to quit game.");
        sc = input.next();
        
        if (sc.equals("a"))
        {
          a.moveLeft();
        } 
        else if (sc.equals("d")) 
        {
          a.moveRight();
        }
        else if (sc.equals("x")) 
        {
          System.out.println("Game over");
        }
        
        else 
	     {
	        System.out.println("Invalid input, try again");
	        
	     }
	       
       
    }
    
                 
  
  }
}


