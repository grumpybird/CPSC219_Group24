/* ####################################################################################################################################
Use this class for the behavior of the aliens. I think the best way to do this would be with a timer (nested for loops) and a gridbox,
which has the aliens move between rows and columns at each interval. Timer will also have them shoot, will probably need an if loop
to determine which aliens are on the bottom row, and are therefore permitted to shoot
#####################################################################################################################################*/
import javafx.scene.image

public class Aliens{
  FileInputStream inputstream = new FileInputStream("alien.jpg");
  Image image = new Image(inputstream); 
  
  
}
