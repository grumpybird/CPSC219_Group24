
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
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

/*
* Each class of Bullet will take multiple instance variables.
*/ 

public class Bullet {

    // Instance Variables:
    private boolean bulletIsAlive = true;
    private Rectangle r = null;
    private Pane p;
    private int incr;
    private static Rectangle rect = Aliens.pointer;

    /**
    * Takes x,y, pos, v[] and p as arguments
    * @param x and y tells the constructure the location of where the starting position of the avatar will be
    * @param pos is the position of the avatar
    * @param p allows to print the rectangle on the pane based on the position of x and y of the avatar
    */
    public Bullet(double x, double y, double pos, ImageView v[], Pane p) {
        if (r == null) {
            this.p = p;
            Timeline tlB;
            r = new Rectangle(x, y);
            p.getChildren().add(r);
            r.setX(pos + 35);
            r.setY(640);
            Duration dB = new Duration(5);
            KeyFrame fB = new KeyFrame(dB, e -> {
                if (r != null) {
                    r.setY(r.getY() - 5);
                    collisioncheck(v);
                }
            });
            tlB = new Timeline(fB);
            tlB.setCycleCount(Animation.INDEFINITE);
            tlB.play();
        }
    }

    /**
    * takes enemies[] as an argument to check for collision of the enemies respective to the obstacles and avatar
    * @param enemies[]
    */
    private boolean collisioncheck(ImageView enemies[]) {
        for (int i = 0; i < enemies.length; i++) {
            if (r != null && enemies[i] != null) {
                if ((r != null && r.getX() < enemies[i].getX() + enemies[i].getFitWidth()
                        && r.getX() + r.getWidth() > enemies[i].getX()
                        && r.getY() < enemies[i].getY() + enemies[i].getFitHeight()
                        && r.getHeight() + r.getY() > enemies[i].getY())) {
                    System.out.println("DENIED");
                    enemies[i].setVisible(false);
                    enemies[i] = null;
                    removeBullet();
                    bulletIsAlive = false;
                    incr += 50;
                }
            }
        }
        if (r != null) {
                if (r.getY()<0-r.getHeight()-1) {
                    removeBullet();
            }
        }
        return bulletIsAlive;
    }

    public int getScore() {
        int x = incr;
        incr = 0;
        return x;
    }
    
    public void getRectangle(Rectangle rect){
        this.rect = rect;
    }
    
    public void removeBullet() {
        p.getChildren().remove(r);
        r = null;
    }
}
