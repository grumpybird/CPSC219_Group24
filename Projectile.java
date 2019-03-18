import java.awt.Rectangle;
import javafx.animation.Animation;
import javafx.animation.AnimationTimer;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.event.EventHandler;
import javafx.util.Duration;
import javafx.geometry.Rectangle2D;

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
  
  private static final double BULLET_INITIAL_X = player.getLocationX() + 32.5;//square png.
  private static final double BULLET_INITIAL_Y = player.getLocationY() - 15.0;//square png.
  private static final double VELOCITY_Y = 10.0;// DEFAULT SPEED?
  private static final Image BULLET_PNG = new Image("bullet.jpg");
  private static final double IMAGE_WIDTH = 15;//spuare png
  private static final double IMAGE_HEIGHT = 15;//square png
  private static final double DIRECTION_FROM_AVATAR = -1.0;
  private static final double DIRECTION_FROM_ALIEN = 1.0;

  private double locationX;
  private double locationY;
  private double direction;
  
  //constructors:
  //For demo 2 only level 1 is developed, no capabilities to modify projectile defaults. 
  //Bullet starting position is based on the avatar. 
  //Takes no arguments creates a projectile
  public Projectile(){
	  locationX = BULLET_INITIAL_X;
	  locationY = BULLET_INITIAL_Y;
	  direction = 0;
  }
  
  
  //accessor methods:
  /**
   * Takes no arguments returns double of bullet's location's x-coordinate.
   * @return Current x-coordinate of the bullet at time of the call. 
   */
  public double getLocationX(){
    return locationX;
  }
  
  /**
   * Takes no arguments returns double of bullet's location's y-coordinate.
   * @return Current y-coordinate of the bullet at time of the call. 
   */
  public double getLocationY(){
    return locationY;
  }
  
  /**
   * Takes no arguments returns double of the bullet's velocity in the y-direction.
   * @return Current velocity in the y-direction of the bullet at time of the call. 
   */
  public double getYVelocity(){
	  return VELOCITY_Y;
  }
  
  /**
   * Takes no arguments returns double of the direction of the bullet's trajectory on the y-plane of the screen
   * -1.0 for down, 1.0 for up.
   * @return Current x-coordinate of the bullet at time of the call. 
   */
  public double getDirection(){
	  return direction;
  }
 
 
  //mutator methods:
  //For demo 2 there are no mutator methods, projectile stuck at default.
  
  
  /**
   * Takes @param time of type double an multiplies it by the direction and velocity to update the x 
   * and y location the bullet should be at based on the time parameter.
   * @param time of type double - the current time
   * @return Current x-coordinate of the bullet at time of the call. 
   */
  public void update(double time){
	  location_X += velocityX*direction*time; // should equal zero, omit?
	  location_Y +=velocityY*direction*time;
  }
  
  /**
   * Draws bullet at desired location.
   */
  public void drawProjectile(GraphicsContext gc) {
      gc.fillRect(locationX, locationY, IMAGE_WIDTH, IMAGE_HEIGHT);
	  gc.drawImage(bullet, locationX, locationY, IMAGE_WIDTH, IMAGE_HEIGHT);
  }

  public void avatarShoot(){
      direction = DIRECTION_FROM_AVATAR;
      locationX =
  }
  
  /**
   * Sets up boundary for later versions to handle collisions with bullet.
   */
  public Rectangle2D getBoundary(){
	  return new Rectangle2D(locationX, locationY, IMAGE_WIDTH, IMAGE_HEIGHT);
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
