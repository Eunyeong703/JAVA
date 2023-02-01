package ex01_stage;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class LifeCycle extends Application{
	Text text;
	Scene scene;
	
	public LifeCycle() {
		System.out.println
		(Thread.currentThread().getName() + " : 생성자 호출");
		
		text = new Text(20,70, "Hello");
		text.setFont(new Font(30));
	}
	
	
	@Override
	public void init() throws Exception {
		// TODO Auto-generated method stub
		System.out.println
		(Thread.currentThread().getName() + " : init() 실행");
		scene = new Scene(new Group(text), 500, 500);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		System.out.println
		(Thread.currentThread().getName() + " : start() 실행");
		primaryStage.setTitle("LifeCycle");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	@Override
	public void stop() throws Exception {
		// TODO Auto-generated method stub
		System.out.println
		(Thread.currentThread().getName() + " : stop() 실행");
	}
	
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		launch(args);
	}
}
