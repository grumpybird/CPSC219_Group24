import java.util.Scanner;

public class SpaceInvaders{
  public static void main(String[] args){
    Avatar a = new Avatar();
    Scanner sc = new Scanner(System.in);
    System.out.println("Move character (left 'a' or right 'd') or 'x' to quit game.");
      input = input.nextLine();
    while input != 'x';
    {
      System.out.println("Move character (left 'a' or right 'd') or 'x' to quit game.");
      input = input.nextLine();
        if (input == 'a')
        {
          a.moveLeft();
        } 
       if (input == 'd')
        {
          a.moveRight();
        }
      if (input == 'x')
        {
          break;
        }
        
      else 
      {
        system.out.println("Invalid input, try again");
        System.out.println("Move character (left 'a' or right 'd') or 'x' to quit game.");
        input = input.nextLine();
      }
    }
    
                 
  
  }
}
