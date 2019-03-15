
/**
 * CPSC 219 Group 24 Project: Obstacles Class
 *
 * @author: Paula Almeida
 *	        Gabriel Atienza
 *	        Sharon Chan
 *	        Hayden Kerr
 *	        Theresa Lam
 *
 * @date: March 11, 2019.
 *
 * @version: DEMO 2
 *
 */

/**
 * Class represents game obstacles such as barriers.
 * Will vary in number and location on the game board
 * based on the level.
 * Attributes will include:
 * damage - will have different levels of damage based on weapon/collision.
 * Methods will track damage, collision counter, etc. 
 *
 */

import javafx.animation.AnimationTimer;
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
import javafx.scene.input.KeyEvent;
import javafx.event.EventHandler;

// https://stackoverflow.com/questions/27359758/detect-collision-in-simple-space-invaders
public class Obstacles {
    private int barrierHealth;
    private int counter = 0;
    private boolean barrierHit;
    private int barrierX;
    private int barrier;

    private static final Image BARRIER_IMAGE = new Image("Barrier.png");
    private static final int BARRIER_WIDTH = 100;
    private static final int BARRIER_HEIGHT = 65;
    private static final int BARRIER_Y = 435;
    private static final int BARRIER1_X = 125;
    private static final int BARRIER2_X = 350;
    private static final int BARRIER3_X = 575;


    public Obstacles(int barrier){
        Image barrierImage = BARRIER_IMAGE;
        int barrierWidth = BARRIER_WIDTH;
        int barrierHeight = BARRIER_HEIGHT;

        barrierHealth = 12;

        if (barrier == 1){
            barrierX = BARRIER1_X;
        }
        else if (barrier == 2){
            barrierX = BARRIER2_X;
        }
        else{
            barrierX = BARRIER3_X;
        }
    }

    public void drawBarrier(GraphicsContext gc){
        gc.drawImage(BARRIER_IMAGE, barrierX, BARRIER_Y, BARRIER_WIDTH, BARRIER_HEIGHT);
        gc.setFill(Color.BLACK);
        gc.fillText("12", barrierX + 30, BARRIER_Y + 30);
    }

    public int getBarrierHealth(){
        return barrierHealth;
    }
}
