/*#####################################################################################################################################
This class will have all of the events for projectiles if possible. Their properties including speed and determining how they will move
across the board. Lots of if statements to determine which object they are colliding with and events for how they will interact
with the object theyve collided with, ie losing a life or removing an alien from the board. Consider using events so that if the Projectile
class determines an instance of itself has collided with an object of another class, call a method from that class which will contain
the appropriate action
#####################################################################################################################################*/
import java.awt.Rectangle;
import javafx.geometry.Rectangle2D;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

/**
 * This Class represents the projectiles being fired and their
 * repective attributes.
 * FOR DEMO 2: 
 * There is only one type of projectile and attributes will
 * remain set to defaults. 
 * Movement is only allowed in the Y-direction on the canvas,
 * direction will be determined by who is shooting the projectile.
 * UP to the aliens, or down toward the avatar.
 * X-direction will depend on where the projectile was first 
 * fired from. It will stay constant throughout its tragectory.
 * Velocity is set to a default of 50.0
 * bullet.png is originally 1280x1280 size is set to be 50x50.
 * 
 * */


public class Projectile {
  
  
  //instance variables:
  //For demo 2 speed is a constant, only one kind of projectile available.
  
  private double BULLETLOCATION_X = player.getLocationX() + 32.5;//square png.
  private static final double BULLETLOCATION_Y = player.getLocationY() - 15.0;//spuare png.
  private static final double VELOCITY_X = 0.0;//restricted to only move up or down.
  private static final double VELOCITY_Y = 5.0;// DEFAULT SPEED?
  private static final Image BULLET_PNG = new Image("bullet.jpg");
  private static final int IMAGE_WIDTH = 15;//spuare png
  private static final int IMAGE_HEIGHT = 15;//square png
  private double direction;
   
  
  //constructors:
  //For demo 2 only level 1 is developed, no capabilities to modify projectile defaults. 
  //Bullet starting position is based on the avatar. 
  //Takes no arguments creates a projectile
  public Projectile(){
	  direction = -1.0;//avatar shoots at aliens, projectile moves up in Y direction.
	  // direction = 1.0 for aliens shooting. p moves down in the Y direction.
	  double velocity_X = VELOCITY_X;
	  double velocity_Y = VELOCITY_Y;
	  double location_X = BULLETLOCATION_X;
	  double location_Y = BULLETLOCATION_Y;
	  Image bullet = BULLET_PNG;
	  int bWidth = IMAGE_WIDTH;
	  int bHeight = IMAGE_HEIGHT;
  }
  
  
  //accessor methods:
  /**
   * @return Current x-coordinate of the bullet at time of the call. 
   */
  public double getLocationX(){
    return location_X;
  }
  
  /**
   * Takes no arguments returns double of bullet's location's y-coordinate.
   * @return Current y-coordinate of the bullet at time of the call. 
   */
  public double getLocationY(){
    return location_Y;
  }
  
  /**
   * @return Current velocity in the y-direction of the bullet at time of the call. 
   */
  public double getYVelocity(){
	  return velocity_Y;
  }
  
  /**
   * @return Current x-coordinate of the bullet at time of the call. 
   */
  public double getDirection(){
	  return direction;
  }
 
 
  //mutator methods:
  //For demo 2 there are no mutator methods, projectile stuck at default.
  
  
  public void update(double time){
	  location_X += velocityX*direction*time; // should equal zero, omit?
	  location_Y +=velocityY*direction*time;
  }
  
  public void render(GraphicsContext gc) {
	  gc.drawImage(bullet, location_X, location_Y); 
  }
  
  public Rectangle2D getBoundary(){
	  return new Rectangle2D(location_X, location_Y, bWidth, bHeight);
  }
  
  //Checks if projectile interesects with any aliens.
  public boolean intersects(Alien anAlien){
	  return anAlien.setBoundary().intersects(this.getBoundary());
  }
  
  //Checks if projectile interesects with any obstacles
  public boolean intersects(Obstacle anObstacle){
	  return anObstacle.setBoundary().intersects(this.getBoundary());
  }
  
  
  //Checks if projectile interesects with the avatar.
  public boolean intersects(Avatar theAvatar) {
	  return theAvatar.setBoundary().intersects(this.getBoundary());
  }
  

}
