import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class SpaceInvaders {
	
	
  public static void main(String[] args) {
	System.out.println("       Space Invaders     ");
	
    Scanner input = new Scanner(System.in);
    String sc = "";
	
	int location = 22;
	
	ArrayList<String> myList = new ArrayList<String>();
	
	String[] targetQuads = { "*", "*", "*", "*", "*",  "*", "*", "*", "*", "*",  " ", " ", " ", " ", " ",  "-", " ", "-", " ", "-", " ", " ", "X", " ", " "};
	
	int i;
	
	for (i = 0; i < targetQuads.length; i++) {
		myList.add(targetQuads[i]);
	}

	while ((sc.equals("x") == false))
    {
    	System.out.println("Move character (left 'a' or right 'd') or 'x' to quit game.");
        sc = input.next();
        
        if (sc.equals("a"))
        {
			Collections.swap(myList, location, location - 1);
			location = location - 1;
			for (i = 0; i < myList.size(); i++) {
				System.out.print(myList.get(i) + "          ");
				if ((i + 1) % 5 == 0){
					System.out.println("");
				}
			}
        } 
        else if (sc.equals("d")) 
        {
			Collections.swap(myList, location, location + 1);
			location = location + 1;
			for (i = 0; i < myList.size(); i++) {
				System.out.print(myList.get(i) + "          ");
				if ((i + 1) % 5 == 0){
					System.out.println("");
				}
			}
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


