/*######################################################################################################################################
Use hboxes to draw a solid square, and give them a certain number of health points in an instance 
variable. We need to decide if we want the event for a collision between the projectile and the obstacles to be in the obstacles or
a potential projectiles class
######################################################################################################################################*/

/**
 * CPSC 219 Group 24 Project: Obstacles Class
 * 
 * @author: Paula Almeida
 *	        Gabriel Atienza
 *	        Sharon Chan
 *	        Hayden Kerr
 *	        Theresa Lam
 *
 * @date: March 11, 2019.
 *
 * @version: DEMO 2
 *
 */

/**
 * Class represents game obstacles such as barriers.
 * Will vary in number and location on the game board
 * based on the level.
 * Attributes will include:
 * damage - will have different levels of damage based on weapon/collision.
 * Methods will track damage, collision counter, etc. 
 *
 */

https://stackoverflow.com/questions/27359758/detect-collision-in-simple-space-invaders 
public class Obstacles {
  private int barrierHealth = 12;
  private int counter = 0;

  
  public void setBarriersLocation() {
    board.location() = barrier.location();
    
    // CALLS BOARD TO FIND LOCATION 
    
  }
  
  public boolean getBarrierHit() {
    //call Paula's collision for barrier
    //return true if hit collision return false elsewise;
  }
  
  public void setbarrierHealth(int barrierHealth) {
    while counter > 0
      if (getBarrierHit = true)
      { counter -= 1; 
      } 
    else if counter = 0
    {
      getBarrierHit = false
      
     
  }
  public boolean barrierDisplay () {
    if (barrierHealth > 12)
    {
      return true;
    }
    else
    {
      return false;
    }
  
  public getbarrierHealth() {
    return barrierHealth;
  }
  
  


}
