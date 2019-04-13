/**
 * CPSC 219 Group 24 Project: StartScreen Class
 * 
 * @author: Paula Almeida
 *	    Gabriel Atienza
 *	    Sharon Chan
 *	    Hayden Kerr
 *	    Theresa Lam
 *
 * @date: April 11th, 2019.
 * @version: StartScreen class of Space Invaders GUI Game for interactive demo.
 */

package CPSC219_Group24.src.core;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.layout.Pane;
/**
 * 
 * The class StartScreen creates scene when the application is called.
 * It then adds the various components
 *
 */
public class StartScreen{
	//Instance Variables
    private Group root = new Group(); 
    private Pane pane = new Pane();
    //Set board width and height
    private static final double BOARD_WIDTH = 800;
    private static final double BOARD_HEIGHT = 800;
    private static Scene startScene;
    private static GraphicsContext gc;
	
// Method
    public Scene getBoardScene() {

    	startScene = new Scene(root, BOARD_WIDTH, BOARD_HEIGHT);  //set new scence
        Canvas canvas = new Canvas(BOARD_WIDTH, BOARD_HEIGHT); // set new canvas
        
        root.getChildren().add(canvas); //add canvas to root
        root.getChildren().add(pane); // add pane to root
        
        gc = canvas.getGraphicsContext2D();
        gc.setFill(Color.BLACK); // Set color to black
        gc.fillRect(0, 0, BOARD_WIDTH, BOARD_HEIGHT); // make background balck

        gc.setFill(Color.LIMEGREEN); // change color to lime green
        
        Font spaceinvaders = Font.font("Courier", 14); // setting font and style
        gc.setFont(spaceinvaders);
        gc.fillText( "                          _                     _               \n" + 
        		"                         (_)                   | |              \n" + 
        		" ___ _ __   __ _  ___ ___ _ _ ____   ____ _  __| | ___ _ __ ___ \n" + 
        		"/ __| '_ \\ / _` |/ __/ _ \\ | '_ \\ \\ / / _` |/ _` |/ _ \\ '__/ __|\n" + 
        		"\\__ \\ |_) | (_| | (_|  __/ | | | \\ V / (_| | (_| |  __/ |  \\__ \\\n" + 
        		"|___/ .__/ \\__,_|\\___\\___|_|_| |_|\\_/ \\__,_|\\__,_|\\___|_|  |___/\n" + 
        		"    | |                                                         \n" + 
        		"    |_|                                                         ", 100, 50); 
        
        Font group24 = Font.font("Courier", 8); //change font size
        gc.setFont(group24);
        gc.fillText("                                                                   \n" + 
        		"  ,ad8888ba,  88888888ba    ,ad8888ba,   88        88 88888888ba   \n" + 
        		" d8\"'    `\"8b 88      \"8b  d8\"'    `\"8b  88        88 88      \"8b  \n" + 
        		"d8'           88      ,8P d8'        `8b 88        88 88      ,8P  \n" + 
        		"88            88aaaaaa8P' 88          88 88        88 88aaaaaa8P'  \n" + 
        		"88      88888 88\"\"\"\"88'   88          88 88        88 88\"\"\"\"\"\"'    \n" + 
        		"Y8,        88 88    `8b   Y8,        ,8P 88        88 88           \n" + 
        		" Y8a.    .a88 88     `8b   Y8a.    .a8P  Y8a.    .a8P 88           \n" + 
        		"  `\"Y88888P\"  88      `8b   `\"Y8888Y\"'    `\"Y8888Y\"'  88           \n" + 
        		"                                                                   \n" + 
        		"                                                                   \n" + 
        		"                        \n" + 
        		" ad888888b,      ,d8    \n" + 
        		"d8\"     \"88    ,d888    \n" + 
        		"        a8P  ,d8\" 88    \n" + 
        		"     ,d8P\" ,d8\"   88    \n" + 
        		"   a8P\"  ,d8\"     88    \n" + 
        		" a8P'    8888888888888  \n" + 
        		"d8\"               88    \n" + 
        		"88888888888       88    ", 100, 300);
        
        Font alien = Font.font("Courier", 8); // change font size
        gc.setFont(alien);
        gc.fillText("░░░░░░░░░░░░░░░░░\n" + 
        		"░░░▄░▀▄░░░▄▀░▄░░░\n" + 
        		"░░░█▄███████▄█░░░\n" + 
        		"░░░███▄███▄███░░░\n" + 
        		"░░░▀█████████▀░░░\n" + 
        		"░░░░▄▀░░░░░▀▄░░░░\n" + 
        		"░░░░░░░░░░░░░░░░░", 100, 500);

       return startScene;
    }
   
}


                                                    
