import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Shape;
import javafx.stage.Stage;

public class Aken extends Application {

	@Override
	public void start(Stage primaryStage) {
		Group juur = new Group();
		Group tegelane = new Group();
		juur.getChildren().add(tegelane);
		looTegelane(tegelane);
		Scene stseen1 = new Scene(juur);
		primaryStage.setTitle("Kitty launcher");
		primaryStage.setScene(stseen1);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
	private void looTegelane( Group kiisu){
		Circle ovaal = new Circle(100,100,50);
		Polygon vasakkõrv = new Polygon(40,40,70,100,100,55);
		Polygon paremkõrv = new Polygon(160,40,130,100,100,55);
		Shape pea1= Shape.union(ovaal, paremkõrv);
		Shape peafinal= Shape.union(pea1, vasakkõrv);
		peafinal.setFill(Color.DEEPSKYBLUE);
		kiisu.getChildren().add(peafinal);
	}
}
