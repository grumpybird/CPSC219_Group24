
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
  private boolean barrierHit;

  
  public void setBarriersLocation() {
    // https://github.com/leonardo-ono/Java2DSpaceInvaders/blob/master/src/br/ol/spaceinvaders/SpaceInvadersGame.java
        for (int id = 0; id < 4; id++) {
            for (int row = 0; row < 4; row++) {
                for (int col = 0; col < 3; col++) {
                    if (col == 1 && row == 3) {
                        continue;
                    }
                    Shield shield = new Shield(id, col, row);
                    SpaceInvaders.add(shield);
                }
            }
        }
    
  }
 
  
  public boolean getBarrierHit() {
    if (barrierHealth <= 0)
    {
      return barrierHit = true;
    }
    else
    {
      return false;
    }
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
  
  public getbarrierHealth() {
    return barrierHealth;
  }
  
  


}
