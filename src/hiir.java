import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;


public class hiir implements EventHandler<MouseEvent>{
public Scene uus;
public Stage lava;
	@Override
	
	public void handle(MouseEvent event) {
		lava.setScene(uus);
	}
	public hiir(Scene uus,Stage lava) {
		super();
		this.uus = uus;
		this.lava = lava;
	}

}
