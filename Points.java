
/**
Currently this is a class that increases the points everytime there is a collision event between the projectile from the avatar 
and the aliens
In the future we also plan to include a method to keep track of levels when the first stage of a game is complete, however for
simplicity wisewe will only have one level

*/


public class Points extends SpaceInvaders{
//Instance Variables  
  private int level = 1;
  private int score = 0;
  
/** from the collision class, it takes whether the collision is true or not, if it is true it means the missile from the avatar
has hit the ship and increases the score. for simplicity our current model will increase 1 point for each alient hit.
we plan to have an increase in score as the aliens get farther
*/
public setScore(){
  if (alien.collision() = true)
    score += 1;
}
public getScore(){
  return score;
}
  

}

