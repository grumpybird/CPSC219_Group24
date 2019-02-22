import java.awt.Rectangle;

public class Avatar {
  
  private String name;
  private char sprite;
  private int lives;
  private Rectangle location;
	
	public Avatar(){
	name = "a";
	sprite = 'o';
	lives = 3;
	location = new Rectangle(2,4);
	}
	
	public void moveRight(){
		location.width += 1;
	}
	
	public void moveLeft(){
	location.width -= 1;
	}
  
  public Rectangle getLocation(){
	return location;
  }
} 
