package obj;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;
import obj.Aliens;
import main.SpaceInvaders;

public class AlienBullet {

    private int lives = 3;
    private static Image bullet = new Image("res/alienbullet.png");

    private boolean bulletIsAlive = true;
    private Rectangle r = null;
    private Pane p;
    private int incr;
    private static Rectangle rect = Aliens.pointer;

    public AlienBullet(double x, double y, double pos, ImageView ship, Pane p) {
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
                    collisioncheck(ship);
                }
            });
            tlB = new Timeline(fB);
            tlB.setCycleCount(Animation.INDEFINITE);
            tlB.play();
        }
    }

    public boolean collisioncheck(ImageView ship){
        if (r != null && ship != null){
            if (r.getX() < ship.getX() && r.getX() + r.getWidth() > ship.getX()
                    && r.getY() < ship.getY() + ship.getFitHeight()
                    && r.getHeight() + r.getY() > ship.getY()){
                bulletIsAlive = false;
                lives -= 1;
                removeBullet();
            }
        }
        return bulletIsAlive;
    }

    public void removeBullet() {
        p.getChildren().remove(r);
        r = null;
    }

    public int getLives(){
        return lives;
    }

    public int pickShooter(){
        int n = ThreadLocalRandom.current().nextInt();
        return n;
    }
}
