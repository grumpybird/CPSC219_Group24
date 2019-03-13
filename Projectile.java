/*#####################################################################################################################################
This class will have all of the events for projectiles if possible. Their properties including speed and determining how they will move
across the board. Lots of if statements to determine which object they are colliding with and events for how they will interact
with the object theyve collided with, ie losing a life or removing an alien from the board. Consider using events so that if the Projectile
class determines an instance of itself has collided with an object of another class, call a method from that class which will contain
the appropriate action
#####################################################################################################################################*/
import java.awt.Rectangle;

public class Projectile extends SpaceInvaders{
  
  
   //Creating an image 
   Image bullet = new Image(new FileInputStream("bullet.jpg"))
   
   //
  //instance variables:
  
  public final int SPEED;
  
  //constructors:
  
  //accessor methods:
  public rectangle getLocationX(){
    return 0.0;
  }
  
  public rectangle getLocationY(){
    
    return 0.0;
  }
  /**
   * While 
   *
   *
   *
   *
   *
   * */
  public void checkCollision(){
    if (avatar.getLocationX()==projectile.getLocation && avatar.getLocationY()==projectile.getLocationY()){
      avatar.collision();
    } else if (obstacle.getLocation()==projectile.getLocationX && obstacle.getLocationY()==projectile.getLocationY()
    {
      obstacle.collision();
    } else if (alien.getLocationX()==projectile.getLocationX && alien.getLocationY()==projectile.getLocationY(){
      alien.collision();
    }
  
  //mutator methods:
  public void shot(){
  }
  
  
  
  
}
