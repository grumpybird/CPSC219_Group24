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
 * Tutorial used and modified to develop this part of the program. Accessed March 13th, 2019.
 * https://gamedevelopment.tutsplus.com/tutorials/introduction-to-javafx-for-game-development--cms-23835?fbclid=IwAR3fNZ6s8gnO27uIOJH0oGf0eFtqfaU_BBmYGbF4_vaEPlKPi8YBnfFTccI
 * */


public class Projectile extends SpaceInvaders{
  
  
  //instance variables:
  //For demo 2 SPEED is a constant, only one kind of projectile available.
  //private final double SPEED = - 50;
  private double bulletLocationX = avatar.getLocationX() + 25.0;//square png.
  private double bulletLocationY = avatar.getLocationY() - 50.0;//spuare png.
  private double velocityX = 0.0;//restricted to only move up or down.
  private double velocityY = 50.0;// DEFAULT SPEED?
  private double width = 50.0;//square png
  private double height=50.0;//square png
  private double direction;
  
  
   //Creating an image 
  private Image bulletPNG = new Image(new FileInputStream("bullet.jpg"));
   
   //
  
  //constructors:
  //For demo 2 only level 1 is developed, no capabilities to modify projectile defaults. 
  //Bullet starting position is based on the avatar. 
  //Takes no arguments creates a projectile
  public Projectile(){
	  direction = -1.0;//avatar shoots at aliens, projectile moves up in Y direction.
	  // direction = 1.0 for aliens shooting. p moves down in the Y direction.
  }
  
  
  //accessor methods:
  public double getLocationX(){
    return bulletLocationX;
  }
  
  public double getLocationY(){
    return bulletLocationY;
  }
  
  public double getYVelocity(){
	  return velocityY;
  }
  
  public double getDirection(){
	  return direction;
  }
 
 
  //mutator methods:
  //For demo 2 there are no mutator methods, projectile stuck at default.
  
  
  public void update(double time){
	  bulletLocationX += velocityX*direction*time; // should equal zero, omit?
	  bulletLocationY +=velocityY*direction*time;
  }
  
  public void render(GraphicsContext gc) {
	  gc.drawImage(bulletPNG, bulletLocationX, bulletLocationY); 
  }
  
  public Rectangle2D getBoundary(){
	  return new Rectangle2D(bulletLocationX, bulletLocationY, width, height);
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
