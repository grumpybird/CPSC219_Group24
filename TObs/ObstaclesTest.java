//import static org.junit.Assert.*;

import org.junit.*;
import java.io.*;
//import java.awt.geom.Rectangle2D;


public class ObstaclesTest extends Obstacles{
	
	@Test
	public void testConstructorBarrierIs1(){
		//testInterface();
		//setup:
		int barrier = 1;
		Obstacles b1 = new Obstacles(barrier);
				
		//test:
		assertEquals("arg is int 1, expects health=12 ", 12, b1.getBarrierHealth());
		assertEquals("arg is int 1, expects barrierX=125.", 125, b1.getBarrierX());
	}
	
	//@Test
	//public void testConstructorIntIs2(){
		////testInterface();
		////setup:
		//Obstacles b2 = new Obstacles(2);
		
		////test:
		//assertEquals("arg is int 1, expects health=12 ", 12, b2.getBarrierHealth());
		//assertEquals("arg is int 1, expects barrierX=125.", 350, b2.getBarrierX());
	//}
	
	//@Test
	//public void testConstructorIntIs3(){
		////testInterface();
		////setup:
		//Obstacles b3 = new Obstacles(3);
		
		////test:
		//assertEquals("arg is int 1, expects health=12 ", 12, b3.getBarrierHealth());
		//assertEquals("arg is int 1, expects barrierX=125.", 575, b3.getBarrierX());
	//}
	
	
	
	
	
	//@Test
	//public void testGetBoundary1(){
		//testInterface();
		////setup:
		//Obstacles bar1 = new Obstacles(1);
		////Rectangle2D expR_1 = new Rectangle(125, 635, 100, 65);
		
		////test:
		//assertEquals("Barrier 1 initialized incorrectly, position is not at default.", rectangle2D(125, 635, 100, 65), bar1.getBoundary1());
		
	//}
	
	//@Test
	//public void testGetBoundary2(){
		//testInterface();
		////setup:
		//Obstacles bar2 = new Obstacles(2);
		////Rectangle2D expR_3 = new Rectangle2D(350, 635, 100, 65);
		
		////test:
		//assertEquals("Barrier 2 initialized incorrectly, position is not at default.", new rectangle2D(350, 635, 100, 65), bar2.getBoundary2());
		
	//}
	
	//@Test
	//public void testGetBoundary3(){
		//testInterface();
		////setup:
		//Obstacles bar3 = new Obstacles(3);
		////rectangle2D expR_3 = new rectangle2D(575, 635, 100, 65);
		////test:
		//assertEquals("Barrier 2 initialized incorrectly, position is not at default.", new rectangle2D(575, 635, 100, 65), bar2.getBoundary2());
	//}

}
