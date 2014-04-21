import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class Mangalgab implements EventHandler<MouseEvent>{
public Stage lava;
	public Mangalgab(Stage lava) {
	super();
	this.lava = lava;
}
	@Override
	public void handle(MouseEvent event) {
		// TODO Auto-generated method stub


		Group juur = new Group();
		Group tegelane = Aken.looTegelane(0.5);
		juur.getChildren().add(tegelane);
		Aken.liigu(tegelane);
		Scene mang = new Scene(juur, 800*Aken.m, 400*Aken.m, Color.LIGHTSKYBLUE);
		EventHandler<KeyEvent> vajutatud = new Nooled(tegelane);
		mang.addEventHandler(KeyEvent.KEY_PRESSED, vajutatud);
		lava.setScene(mang);
	}

}
