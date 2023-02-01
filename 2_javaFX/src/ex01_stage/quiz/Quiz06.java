package ex01_stage.quiz;

import java.awt.Dimension;
import java.awt.Toolkit;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Quiz06 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		
		int width = 200;
		int height = 100;
		int gabWidth = screen.width/2 - width/2;
		int gabHeight = screen.height/2 - height/2;
		
		Scene scene = null;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				scene = new Scene(new Group(), width, height);
				primaryStage.setX(gabWidth * j);
				primaryStage.setY(gabHeight * i);
				primaryStage.setTitle("Quiz");
				primaryStage.setScene(scene);
				// setAlwaysOnTop(true); : 화면 위로 출력
				primaryStage.setAlwaysOnTop(true);
				primaryStage.show();
				
				Thread.sleep(1000);
			}
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
}



