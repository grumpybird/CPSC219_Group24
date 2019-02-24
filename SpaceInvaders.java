import java.util.Scanner;

public class SpaceInvaders {
  public static void main(String[] args){
	System.out.println("       Space Invaders     ");
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
          //a.moveLeft();
        } 
        else if (sc.equals("d")) 
        {
          //a.moveRight();
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
