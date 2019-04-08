package Main;

/* CPSC 219 Group 24 Project: Testing Points in SpaceInvader
 *
 * @author: Paula Almeida
 * 	   Gabriel Atienza
 *	   Sharon Chan
 *	   Hayden Kerr
 *	   Theresa Lam
 *
 * @date: March 29, 2019.
 *
 * @version: DEMO 3
 *
 */

/**
 * Testing the points in SpaceInvader.
 * Where the points are being tested against a limit
 * and find and see if it reaches a negative score. And
 * if it does it will give an error
 */

import obj.Aliens;
import static org.junit.Assert.*;

import obj.Aliens;
import org.junit.Test;

public class SpaceInvadersJunitTest {

    @Test
    public void TestNegativeScore() {
        Aliens a = new Aliens();


        assertEquals("Score cannot be negative", 0, a.score);
    }



}
