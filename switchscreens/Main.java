package Main;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
	
	    Stage stage;
	    
	    StartScreen startscreen = new StartScreen();
	    SpaceInvaders gamescreen = new SpaceInvaders();
	    
	    
	    public static void main(String[] args) {
	        launch(args);
	    }
	    public void start(Stage primaryStage) throws Exception {
	       
	    	stage = primaryStage;
	    	Scene scene = gamescreen.GameScreen();
	        primaryStage.setScene(startscreen.start());
	        
	       
	        primaryStage.show();
}
	    
	    
	    
}
