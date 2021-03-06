package ex1;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class PremiereFenetre extends Application {

	@Override
	 public void start(Stage primaryStage) {
	 Group root = new Group();
	 
	 Scene scene = new Scene(root, 300, 250, Color.WHITE);
	 
	 primaryStage.setTitle("Ma premi?re fen?tre");
	 Circle C = new Circle(100,50,20,Color.RED);
	 Circle C2 = new Circle(200,50,20,Color.RED);
	 Rectangle R = new Rectangle(145,80,20,20);
	 Rectangle R2 = new Rectangle(100,120,105,5);
	 root.getChildren().add(C);
	 root.getChildren().add(C2);
	 root.getChildren().add(R);
	 root.getChildren().add(R2);
	 primaryStage.setScene(scene);
	 primaryStage.show();
	 }
	
	
	 public static void main(String[] args) {
	 launch(args);
	 }
	

}
