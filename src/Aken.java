import java.util.Random;
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
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Aken extends Application {

	private static final KeradeKasitleja KeradeKasitleja = null;
	private static final Group juur = null;
	public static double tegex = 200;
	public static double tegey = 200;
	public static double m = 1;
	public static Text kiri = new Text("");

	//loob men�� akna
	public void start(Stage primaryStage) {
		primaryStage.setResizable(false);
		primaryStage.setHeight(400 * m);
		primaryStage.setWidth(800 * m);
		// Group juur = new Group();
		Group mjuur = new Group();
		Group sjuur = new Group();
		Scene menu = new Scene(mjuur, 800 * m, 400 * m, Color.GREEN);
		Scene set = new Scene(sjuur, 800 * m, 400 * m, Color.GREEN);
		// Scene mang = loomang(juur);
		loomenu(mjuur, set, primaryStage);
		looset(sjuur, menu, primaryStage);
		primaryStage.setTitle("Kitty launcher");
		primaryStage.setScene(menu);
		primaryStage.show();
	}

	public static void main(String[] args) {
		kiri.setFont(Font.font("Sustem Regular", 12 * m));
		launch(args);
	}
	//loob peategelase
	static Group looTegelane(double d) {

		Group kiisu = new Group();
		double n = d * m;
		Circle ovaal = new Circle(100 * n, 100 * n, 50 * n);
		Polygon vasakk�rv = new Polygon(40 * n, 40 * n, 70 * n, 100 * n,
				100 * n, 55 * n);
		Polygon paremk�rv = new Polygon(160 * n, 40 * n, 130 * n, 100 * n,
				100 * n, 55 * n);
		Shape pea1 = Shape.union(ovaal, paremk�rv);
		Shape peafinal = Shape.union(pea1, vasakk�rv);
		Polygon vk�rvs = new Polygon(50 * n, 50 * n, 60 * n, 70 * n, 80 * n,
				55 * n);
		Polygon pk�rvs = new Polygon(150 * n, 50 * n, 140 * n, 70 * n, 120 * n,
				55 * n);
		Ellipse silmp = new Ellipse(125 * n, 84 * n, 10 * n, 4 * n);
		Ellipse silmv = new Ellipse(75 * n, 84 * n, 10 * n, 4 * n);
		Ellipse pupillp = new Ellipse(125 * n, 84 * n, 2 * n, 3 * n);
		Ellipse pupillv = new Ellipse(75 * n, 84 * n, 2 * n, 3 * n);
		Arc suup = new Arc(110 * n, 114 * n, 10 * n, 10 * n, 180, 135);
		Arc suuv = new Arc(90 * n, 114 * n, 10 * n, 10 * n, 210, 135);
		Polygon nina = new Polygon(100 * n, 112 * n, 95 * n, 107 * n, 105 * n,
				107 * n);
		Line vurr1 = new Line(92 * n, 110 * n, 64 * n, 110 * n);
		Line vurr2 = new Line(93 * n, 112 * n, 64 * n, 120 * n);
		Line vurr3 = new Line(93 * n, 108 * n, 64 * n, 95 * n);
		Line vurr4 = new Line(110 * n, 110 * n, 136 * n, 110 * n);
		Line vurr5 = new Line(109 * n, 112 * n, 136 * n, 120 * n);
		Line vurr6 = new Line(109 * n, 108 * n, 136 * n, 95 * n);
		nina.setStrokeLineJoin(StrokeLineJoin.ROUND);
		nina.setStrokeWidth(3 * n);
		nina.setStroke(Color.BLACK);
		suuv.setStrokeWidth(2 * n);
		suuv.setStroke(Color.BLACK);
		suuv.setFill(null);
		suup.setStrokeWidth(2 * n);
		suup.setStroke(Color.BLACK);
		suup.setFill(null);
		silmv.setFill(Color.CRIMSON);
		silmv.setStroke(Color.BLACK);
		silmp.setFill(Color.CRIMSON);
		silmp.setStroke(Color.BLACK);
		vk�rvs.setFill(Color.CRIMSON);
		pk�rvs.setFill(Color.CRIMSON);
		peafinal.setFill(Color.BURLYWOOD);
		kiisu.getChildren().add(peafinal);
		kiisu.getChildren().add(silmv);
		kiisu.getChildren().add(silmp);
		kiisu.getChildren().add(pupillv);
		kiisu.getChildren().add(pupillp);
		kiisu.getChildren().add(suup);
		kiisu.getChildren().add(suuv);
		kiisu.getChildren().add(nina);
		kiisu.getChildren().add(vk�rvs);
		kiisu.getChildren().add(pk�rvs);
		kiisu.getChildren().add(vurr1);
		kiisu.getChildren().add(vurr2);
		kiisu.getChildren().add(vurr3);
		kiisu.getChildren().add(vurr4);
		kiisu.getChildren().add(vurr5);
		kiisu.getChildren().add(vurr6);
		return kiisu;
	}
	//loob kassi sisenemise
	public static void liigu(Group kass) {
		Path path = new Path();
		path.getElements().add(new MoveTo(-100 * m, 200 * m));
		path.getElements().add(new LineTo(200 * m, 200 * m));

		PathTransition minemine = new PathTransition();
		minemine.setDuration(Duration.millis(1000));
		minemine.setNode(kass);
		minemine.setPath(path);
		minemine.setCycleCount(1);
		minemine.setAutoReverse(false);

		minemine.play();
	}
	//loob men�� nupud ja nuppude eventhandlerid
	public void loomenu(Group mjuur, Scene set, Stage primaryStage) {

		GridPane alus = new GridPane();
		mjuur.getChildren().add(alus);
		alus.setVgap(10 * m);
		alus.setHgap(10 * m);
		alus.setGridLinesVisible(false);
		Rectangle mangi = new Rectangle(0, 0, 140 * m, 50 * m);
		mangi.heightProperty().bind(primaryStage.heightProperty().divide(7));
		mangi.widthProperty().bind(primaryStage.widthProperty().divide(5));
		Rectangle upgrade = new Rectangle(0, 0, 140 * m, 50 * m);
		upgrade.heightProperty().bind(primaryStage.heightProperty().divide(7));
		upgrade.widthProperty().bind(primaryStage.widthProperty().divide(5));
		Rectangle settings = new Rectangle(0, 0, 140 * m, 50 * m);
		settings.heightProperty().bind(primaryStage.heightProperty().divide(7));
		settings.widthProperty().bind(primaryStage.widthProperty().divide(5));
		Text play = new Text("PLAY");
		play.fontProperty().bind(kiri.fontProperty());
		Text t�ienda = new Text("UPGRADES");
		t�ienda.fontProperty().bind(kiri.fontProperty());
		Text seaded = new Text("SETTINGS");
		seaded.fontProperty().bind(kiri.fontProperty());
		mangi.setFill(Color.CRIMSON);
		upgrade.setFill(Color.CRIMSON);
		settings.setFill(Color.CRIMSON);
		alus.add(mangi, 1, 1, 1, 1);
		alus.add(play, 1, 1, 1, 1);
		GridPane.setHalignment(play, HPos.CENTER);
		GridPane.setValignment(play, VPos.CENTER);
		EventHandler<MouseEvent> klickp = new Mangalgab(primaryStage);
		mangi.addEventHandler(MouseEvent.MOUSE_CLICKED, klickp);
		play.addEventHandler(MouseEvent.MOUSE_CLICKED, klickp);
		alus.add(upgrade, 1, 2, 1, 1);
		alus.add(t�ienda, 1, 2, 1, 1);
		GridPane.setHalignment(t�ienda, HPos.CENTER);
		GridPane.setValignment(t�ienda, VPos.CENTER);
		alus.add(settings, 1, 3, 1, 1);
		alus.add(seaded, 1, 3, 1, 1);
		GridPane.setHalignment(seaded, HPos.CENTER);
		GridPane.setValignment(seaded, VPos.CENTER);
		EventHandler<MouseEvent> klicks = new hiir(set, primaryStage);
		settings.addEventHandler(MouseEvent.MOUSE_CLICKED, klicks);
		seaded.addEventHandler(MouseEvent.MOUSE_CLICKED, klicks);

	}
	//loob Settingute ekraani
	public void looset(Group sjuur, Scene menu, Stage prima) {
		GridPane alus = new GridPane();
		sjuur.getChildren().add(alus);
		alus.setVgap(10 * m);
		alus.setHgap(10 * m);
		alus.setGridLinesVisible(false);
		Rectangle tagasi = new Rectangle();
		tagasi.heightProperty().bind(prima.heightProperty().divide(7));
		tagasi.widthProperty().bind(prima.widthProperty().divide(5));
		Rectangle suur = new Rectangle();
		suur.heightProperty().bind(prima.heightProperty().divide(7));
		suur.widthProperty().bind(prima.widthProperty().divide(5));
		Rectangle v�ike = new Rectangle();
		v�ike.heightProperty().bind(prima.heightProperty().divide(7));
		v�ike.widthProperty().bind(prima.widthProperty().divide(5));
		Text back = new Text("BACK");
		back.fontProperty().bind(kiri.fontProperty());
		Text big = new Text("1200*600");
		big.fontProperty().bind(kiri.fontProperty());
		Text small = new Text("800*400");
		small.fontProperty().bind(kiri.fontProperty());
		tagasi.setFill(Color.CRIMSON);
		suur.setFill(Color.CRIMSON);
		v�ike.setFill(Color.CRIMSON);
		alus.add(tagasi, 1, 1, 1, 1);
		alus.add(back, 1, 1, 1, 1);
		GridPane.setHalignment(back, HPos.CENTER);
		GridPane.setValignment(back, VPos.CENTER);
		EventHandler<MouseEvent> klick = new hiir(menu, prima);
		tagasi.addEventHandler(MouseEvent.MOUSE_CLICKED, klick);
		back.addEventHandler(MouseEvent.MOUSE_CLICKED, klick);
		alus.add(suur, 1, 2, 1, 1);
		alus.add(big, 1, 2, 1, 1);
		GridPane.setHalignment(big, HPos.CENTER);
		GridPane.setValignment(big, VPos.CENTER);
		EventHandler<MouseEvent> klicks = new Suurus(1.5, prima);
		big.addEventHandler(MouseEvent.MOUSE_CLICKED, klicks);
		suur.addEventHandler(MouseEvent.MOUSE_CLICKED, klicks);
		alus.add(v�ike, 1, 3, 1, 1);
		alus.add(small, 1, 3, 1, 1);
		GridPane.setHalignment(small, HPos.CENTER);
		GridPane.setValignment(small, VPos.CENTER);
		EventHandler<MouseEvent> klickv = new Suurus(1, prima);
		v�ike.addEventHandler(MouseEvent.MOUSE_CLICKED, klickv);
		small.addEventHandler(MouseEvent.MOUSE_CLICKED, klickv);
	}

	public Group looobjektid() {
		Group stuff = new Group();
		return stuff;

	}
	/*
	public Scene loomang(Group juur) {

		Group tegelane = looTegelane(0.5);
		juur.getChildren().add(tegelane);
		liigu(tegelane);
		Scene mang = new Scene(juur, 800 * m, 400 * m, Color.LIGHTSKYBLUE);
		EventHandler<KeyEvent> vajutatud = new Nooled(tegelane);
		mang.addEventHandler(KeyEvent.KEY_PRESSED, vajutatud);
		return mang;
	} */
	protected KeradeKasitleja getKeradeKasitleja() {
		return KeradeKasitleja;
	}
	public static Group getJuur() {
		return juur;
	}

	public void genereeriKera() {
		Color c = Color.BLUE;
		
		double X = 100;

		Kerad b = new Kerad(X, 0, 20, c);
		
		b.vY =  5;

		final Circle ring = b.getAsCircle();
		ring.setVisible(true);
		ring.setId(b.toString());

		getKeradeKasitleja().lisaKerad(b);
		getJuur().getChildren().add(0, b.node);

	}
}
