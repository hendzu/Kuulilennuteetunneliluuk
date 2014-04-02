import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Shape;
import javafx.scene.shape.StrokeLineJoin;
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
		Polygon vkõrvs = new Polygon(50,50,60,70,80,55);
		Polygon pkõrvs = new Polygon(150,50,140,70,120,55);
		Ellipse silmp = new Ellipse(125,84,10,4); 
		Ellipse silmv = new Ellipse(75,84,10,4);
		Ellipse pupillp = new Ellipse(125,84,2,3); 
		Ellipse pupillv = new Ellipse(75,84,2,3);
		Arc suup = new Arc(110,114,10,10,180,135);
		Arc suuv = new Arc(90,114,10,10,210,135);
		Polygon nina = new Polygon(100,112,95,107,105,107);
		Line vurr1 = new Line(92, 110, 64, 110);
		Line vurr2 = new Line(93, 112, 64, 120);
		Line vurr3 = new Line(93, 108, 64, 95);
		Line vurr4 = new Line(110, 110, 136, 110);
		Line vurr5 = new Line(109, 112, 136, 120);
		Line vurr6 = new Line(109, 108, 136, 95);
		nina.setStrokeLineJoin(StrokeLineJoin.ROUND);
		nina.setStrokeWidth(3);
		nina.setStroke(Color.BLACK);
		suuv.setStrokeWidth(2);
		suuv.setStroke(Color.BLACK);
		suuv.setFill(null);
		suup.setStrokeWidth(2);
		suup.setStroke(Color.BLACK);
		suup.setFill(null);
		silmv.setFill(Color.CRIMSON);
		silmv.setStroke(Color.BLACK);
		silmp.setFill(Color.CRIMSON);
		silmp.setStroke(Color.BLACK);
		vkõrvs.setFill(Color.CRIMSON);
		pkõrvs.setFill(Color.CRIMSON);
		peafinal.setFill(Color.DEEPSKYBLUE);
		kiisu.getChildren().add(peafinal);
		kiisu.getChildren().add(silmv);
		kiisu.getChildren().add(silmp);
		kiisu.getChildren().add(pupillv);
		kiisu.getChildren().add(pupillp);
		kiisu.getChildren().add(suup);
		kiisu.getChildren().add(suuv);
		kiisu.getChildren().add(nina);
		kiisu.getChildren().add(vkõrvs);
		kiisu.getChildren().add(pkõrvs);
		kiisu.getChildren().add(vurr1);
		kiisu.getChildren().add(vurr2);
		kiisu.getChildren().add(vurr3);
		kiisu.getChildren().add(vurr4);
		kiisu.getChildren().add(vurr5);
		kiisu.getChildren().add(vurr6);
	}
}
