import static org.junit.Assert.*;

import org.junit.Test;

public class SpaceInvadersJunitTest {

	@Test
	public void TestNegativeScore() {
		Aliens a = new Aliens();
		
		
		assertEquals("Score cannot be negative", 0, a.score);
	}
	
	

}
