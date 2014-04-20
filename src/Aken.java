

import javafx.animation.PathTransition;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.VPos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.scene.shape.StrokeLineJoin;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Aken extends Application {
	
	public static float tegex;
	public static float tegey;

	@Override
	public void start(Stage primaryStage) {
		primaryStage.setResizable(false);
		Group juur = new Group();
		Group mjuur = new Group();
		GridPane gridpane = new GridPane();
		mjuur.getChildren().add(gridpane);
		Group tegelane =looTegelane();
		juur.getChildren().add(tegelane);
		liigu(tegelane);
		Scene mang = new Scene(juur,800,500, Color.LIGHTSKYBLUE);
		Scene menu = new Scene(mjuur, Color.GREEN);
		loomenu(gridpane, mang,primaryStage);
		EventHandler<KeyEvent> vajutatud = new Nooled(tegelane);
		mang.addEventHandler(KeyEvent.KEY_PRESSED, vajutatud );
		primaryStage.setTitle("Kitty launcher");
		primaryStage.setScene(menu);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
	private Group looTegelane(){

		Group kiisu = new Group();
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
		return kiisu;
	}
	
	public void liigu(Group kass){
		Path path = new Path();
		path.getElements().add(new MoveTo(-100, 250));
		path.getElements().add(
				new LineTo(250, 250));
		tegex=250;
		tegey=250;

		PathTransition minemine = new PathTransition();
		minemine.setDuration(Duration.millis(1000));
		minemine.setNode(kass);
		minemine.setPath(path);
		minemine.setCycleCount(1);
		minemine.setAutoReverse(false);
		
		minemine.play();
	}
	public void loomenu(GridPane alus, Scene mang, Stage primaryStage){
		alus.setVgap(4);
		alus.setHgap(4);
		alus.setGridLinesVisible(true);
		Rectangle mangi = new Rectangle(0,0,140,50);
		Rectangle upgrade = new Rectangle(0,0,140,50);
		Rectangle setings= new Rectangle(0,0,140,50);
		Text play= new Text("PLAY");
		Text täienda= new Text("UPGRADES");
		Text seaded= new Text("SETTINGS");
		mangi.setFill(Color.CRIMSON);
		upgrade.setFill(Color.CRIMSON);
		setings.setFill(Color.CRIMSON);
		alus.add(mangi, 0, 0,1,1);
		alus.add(play, 0, 0,1,1);
		GridPane.setHalignment(play, HPos.CENTER);
		GridPane.setValignment(play, VPos.CENTER);
		EventHandler<MouseEvent> klick = new hiir(mang,primaryStage);
		mangi.addEventHandler(MouseEvent.MOUSE_CLICKED, klick );
		alus.add(upgrade, 0, 1,1,1);
		alus.add(täienda, 0, 1,1,1);
		GridPane.setHalignment(täienda, HPos.CENTER);
		GridPane.setValignment(täienda, VPos.CENTER);
		alus.add(setings, 0, 2,1,1);
		alus.add(seaded, 0, 2,1,1);
		GridPane.setHalignment(seaded, HPos.CENTER);
		GridPane.setValignment(seaded, VPos.CENTER);
		
	}
public Group looobjektid(){
	Group stuff = new Group();
	return stuff;
	
}


}
