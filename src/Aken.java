import javafx.animation.PathTransition;
import javafx.animation.PathTransition.OrientationType;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;
import javafx.scene.shape.CubicCurveTo;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Shape;
import javafx.scene.shape.StrokeLineJoin;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Aken extends Application {

	@Override
	public void start(Stage primaryStage) {
		Group juur = new Group();
		Group tegelane = new Group();
		juur.getChildren().add(tegelane);
		looTegelane(tegelane);
		liigu(tegelane);
		Scene mang = new Scene(juur,500,600, Color.LIGHTSKYBLUE);
		primaryStage.setTitle("Kitty launcher");
		primaryStage.setScene(mang);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
	private void looTegelane( Group kiisu){
		float n=(float) 0.5;
		Circle ovaal = new Circle(100*n,100*n,50*n);
		Polygon vasakkõrv = new Polygon(40*n,40*n,70*n,100*n,100*n,55*n);
		Polygon paremkõrv = new Polygon(160*n,40*n,130*n,100*n,100*n,55*n);
		Shape pea1= Shape.union(ovaal, paremkõrv);
		Shape peafinal= Shape.union(pea1, vasakkõrv);
		Polygon vkõrvs = new Polygon(50*n,50*n,60*n,70*n,80*n,55*n);
		Polygon pkõrvs = new Polygon(150*n,50*n,140*n,70*n,120*n,55*n);
		Ellipse silmp = new Ellipse(125*n,84*n,10*n,4*n); 
		Ellipse silmv = new Ellipse(75*n,84*n,10*n,4*n);
		Ellipse pupillp = new Ellipse(125*n,84*n,2*n,3*n); 
		Ellipse pupillv = new Ellipse(75*n,84*n,2*n,3*n);
		Arc suup = new Arc(110*n,114*n,10*n,10*n,180,135);
		Arc suuv = new Arc(90*n,114*n,10*n,10*n,210,135);
		Polygon nina = new Polygon(100*n,112*n,95*n,107*n,105*n,107*n);
		Line vurr1 = new Line(92*n, 110*n, 64*n, 110*n);
		Line vurr2 = new Line(93*n, 112*n, 64*n, 120*n);
		Line vurr3 = new Line(93*n, 108*n, 64*n, 95*n);
		Line vurr4 = new Line(110*n, 110*n, 136*n, 110*n);
		Line vurr5 = new Line(109*n, 112*n, 136*n, 120*n);
		Line vurr6 = new Line(109*n, 108*n, 136*n, 95*n);
		nina.setStrokeLineJoin(StrokeLineJoin.ROUND);
		nina.setStrokeWidth(3*n);
		nina.setStroke(Color.BLACK);
		suuv.setStrokeWidth(2*n);
		suuv.setStroke(Color.BLACK);
		suuv.setFill(null);
		suup.setStrokeWidth(2*n);
		suup.setStroke(Color.BLACK);
		suup.setFill(null);
		silmv.setFill(Color.CRIMSON);
		silmv.setStroke(Color.BLACK);
		silmp.setFill(Color.CRIMSON);
		silmp.setStroke(Color.BLACK);
		vkõrvs.setFill(Color.CRIMSON);
		pkõrvs.setFill(Color.CRIMSON);
		peafinal.setFill(Color.BURLYWOOD);
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
	
	public void liigu(Group kass){
		Path path = new Path();
		path.getElements().add(new MoveTo(250, 700));
		path.getElements().add(
				new LineTo(250, 400));

		PathTransition minemine = new PathTransition();
		minemine.setDuration(Duration.millis(1000));
		minemine.setNode(kass);
		minemine.setPath(path);
		System.out.println("Kala");
		//minemine.setOrientation(OrientationType.ORTHOGONAL_TO_TANGENT);
		minemine.setCycleCount(1);
		minemine.setAutoReverse(false);
		
		minemine.play();
	}
	public Path rada(Path tee){
		if (tee==null)
			return null;
		return tee;
	}
}
