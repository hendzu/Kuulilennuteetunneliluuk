import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.animation.TimelineBuilder;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Mangalgab implements EventHandler<MouseEvent> {
	public Stage lava;
	private int FPS;
	private static Timeline manguKordus;

	public Mangalgab(Stage lava) {
		super();
		this.lava = lava;
	}

	protected int getFPS() {
		return FPS;
	}

	@Override
	public void handle(MouseEvent event) {
		initsialiseeri();
		alusta();

	}

	public void initsialiseeri() {
		Group juur = new Group();
		Group tegelane = Aken.looTegelane(0.5);
		juur.getChildren().add(tegelane);
		Aken.liigu(tegelane);
		Scene mang = new Scene(juur, 800 * Aken.m, 400 * Aken.m,
				Color.LIGHTSKYBLUE);
		EventHandler<KeyEvent> vajutatud = new Nooled(tegelane);
		mang.addEventHandler(KeyEvent.KEY_PRESSED, vajutatud);
		lava.setScene(mang);
	}

	public void algataja() {
		getManguKordus().play();
	}

	protected static Timeline getManguKordus() {
		return manguKordus;
	}

	protected static void setManguKordus(Timeline manguKordus) {
		Mangalgab.manguKordus = manguKordus;
	}

	/*protected void uuendaMulle() {
		for (Kerad kera : KeradeKasitleja.getKoikKerad()) {
			kasValjas(kera);
			if (kera.kustutatav == true) { // Võetakse allesjäänud mullide
											// arvust 1 maha. allesMaha();
				getMullideKasitleja().lisaKustutatav(mull);
			} else
				Uuendaja(mull);
		}
	}*/

	/*
	 * protected void kasValjas(Kerad kera) { if
	 * (kera.getAsCircle().getTranslateX() > getVali().getHeight() + 40) {
	 * mull.kustutatav = true;
	 */
	protected final void alusta() {
		final Duration aeg = Duration.millis(1000 / getFPS());
		final KeyFrame kaader = new KeyFrame(aeg,
				new EventHandler<ActionEvent>() {
					public void handle(ActionEvent event) {
					}

				});
		setManguKordus(TimelineBuilder.create()
				.cycleCount(Animation.INDEFINITE).keyFrames(kaader).build());
	}
}
