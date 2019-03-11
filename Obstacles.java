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
public class Obstacles {
  private int barrierHealth = 0;
  private int counter = 0;
  private ArrayList<Barrier> barriers = new ArrayList<>();

  
  public void setBarriersLocation() {
    // CALLS BOARD TO FIND LOCATION 
    
  }
  
  public getBarrierHit() {
  }
  
  public void setbarrierHealth(int barrierHealth) {
    while counter <= 12 
      if (b.collision = true)
      { counter += 1; 
      } 
  }
  
  public getbarrierHealth() {
    return barrierHealth;
  }
  
  public void checkBarrierCollision(Barrier barrier) {
     for (int b = 0; b < barrier.getBarrierHit(); b++)
          barrier.getProjectile(b).detectCollision(alien);
    
     if (barrier.isActive() == true && alien.isActive())
                {
                    barrier.detectCollision(alien);
                }   
            }
            else if (alien.isActive() == false)
            {
                totalscore = totalscore + avatar.GetScore();
            }
        }



      
  } 

}
