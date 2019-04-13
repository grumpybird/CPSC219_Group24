package obj;

/** 
* CPSC 219 Group 24 Project: Bullet Class
*
* @author: Paula Almeida
*          Gabriel Atienza
*          Sharon Chan
*          Hayden Kerr
*          Theresa Lam
*
* @date: March 29, 2019.
*
* @version: DEMO 3
*
*/

/**
* Class represents the bullet used in the game.
* It will be used to set up the bullet's location, 
* collisions of the bullet as well as removing the bullet once shot and
* getting score when collisions happens.
* Methods will track the location, collision and score.
*
*/ 

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.util.Duration;

import java.util.concurrent.ThreadLocalRandom;
/*
* Each class of Bullet will take multiple instance variables.
*/ 

public class EnemyBullet {

    // Instance Variables:
    private boolean bulletIsAlive = true;
   
    Rectangle r2 = null;
    private Pane p;
    private int incr;
    private static Rectangle rect = Aliens.pointer;
    public static int life = 3;

    /**
    * Takes x,y, pos, v[] and p as arguments
    * @param x and y tells the constructure the location of where the starting position of the avatar will be
    * @param pos is the position of the avatar
    * @param p allows to print the rectangle on the pane based on the position of x and y of the avatar
    */
    public EnemyBullet(double x, double y, ImageView ship, ImageView v[], Pane p, Text text, Obstacles barrier1, Obstacles barrier2, Obstacles barrier3) {
    	
        if (r2 == null) {
            this.p = p;
            Timeline tlB;
          
            r2 = new Rectangle(x, y);
            r2.setFill(Color.WHITE);
            p.getChildren().add(r2);
           // for (int i = 0; i < v.length; i++) {
            int i = ThreadLocalRandom.current().nextInt(0, v.length);
                if (v[i] != null) {
                	
                    r2.setX(v[i].getX());
                }
            //}
          //  for (int j = 0; j < v.length; j++) {
                    if (v[i] != null) {
                        r2.setY(v[i].getY());
                    }
         //   }
            Duration dB = new Duration(5);
            KeyFrame fB = new KeyFrame(dB, e -> {
                if (r2 != null) {
                    r2.setY(r2.getY() + 1);
                    collisioncheck(ship, text, barrier1);
                }
            });
            tlB = new Timeline(fB);
            tlB.setCycleCount(Animation.INDEFINITE);
            tlB.play();
        }
    }

    private boolean collisioncheck(ImageView ship, Text text, Obstacles barrier1) {
        
            if (r2 != null && ship != null) {
                if (( r2.getY() > ship.getY() + ship.getFitHeight() 
                                && r2.getX() < ship.getX() + ship.getFitWidth()
                     && r2.getX() + r2.getWidth() < ship.getX()
                     && r2.getHeight() + r2.getY() > ship.getY()
                        )) {
                    removeBullet();
                    bulletIsAlive = false;
                    life -= 1;
                    text.setText("LIFE: " + life);
                    
                }
            }
        
        if (r2 != null) {
                if (r2.getY()<0-r2.getHeight()-1) {
                    removeBullet();
            }
        if (life <= 0) {
            ship.setVisible(false);
            ship = null;
            life = 0;
            text.setText("LIFE: " + life);
        }
        }
        return bulletIsAlive;
    }
    
    private void player (ImageView ship){
        if (ship == null) {
            ship.setVisible(true);
        }
    }
    /**
    * takes enemies[] as an argument to check for collision of the enemies respective to the obstacles and avatar
    * @param enemies[]
    */
   
    //public EnemyBullet(double x, double y, double pos, double d, double ess, Pane p)
    public void removeBullet() {
        p.getChildren().remove(r2);
        r2 = null;
    }
    
    public int getplayerlife(){
        return life ;
    }
}
