/**
 * CPSC 219 Group 24 Project: Main Class
 *
 * @author: Paula Almeida
 *	    Gabriel Atienza
 *	    Sharon Chan
 *	    Hayden Kerr
 *	    Theresa Lam
 *
 * @date: April 11th, 2019.
 * @version: Main class of Space Invaders GUI Game for interactive demo.
 */

package CPSC219_Group24.src.main;

import CPSC219_Group24.src.core.ScreenController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import CPSC219_Group24.src.core.SpaceInvaders;
import CPSC219_Group24.src.core.StartScreen;
import CPSC219_Group24.src.obj.EnemyBullet;

public class Main extends Application {

    // Instance variables
    private static Stage stage;
    private Pane pane = new Pane();

    StartScreen startscreen = new StartScreen();

    // Main method
    public static void main(String[] args) {
        launch(args);
    }

    /**
     * @param primaryStage of type stage
     * Opens up application and displays start screen
     *
     */
    @Override
    public void start(Stage primaryStage) throws Exception {

        stage = primaryStage;
        Scene scene = startscreen.getBoardScene();
        ScreenController screenController = new ScreenController(scene);

        screenController.addScreen("boardscene", pane);
        screenController.addScreen("startScene", pane);

        primaryStage.setScene(scene);
        primaryStage.show();

        scene.setOnKeyPressed(e -> keyboardManage(e, screenController, primaryStage));

    }

    //Keyboard Manager
    /**
     *
     * @param ke of type KeyEvent
     * @param sc of type ScreenController
     * @param primaryStage of type Stage
     *
     * When the user presses enter, switches stages to start game.
     */
    public void keyboardManage(KeyEvent ke, ScreenController sc, Stage primaryStage) {
        if (ke.getCode() == KeyCode.ENTER) {
            SpaceInvaders boardscreen = new SpaceInvaders();
            sc.activate("boardscene");
            Scene scene = boardscreen.GameScreen();
            primaryStage.setScene(scene);
            scene.setOnKeyPressed(e -> boardscreen.keyboardManager(e));
        }
    }

    public static void closeStage(Stage primaryStage){
        primaryStage.close();
    }

    public static Stage getStage(){
        return stage;
    }
}
