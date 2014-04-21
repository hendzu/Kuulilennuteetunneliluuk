import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;


public class Suurus implements EventHandler<MouseEvent> {
public double suurus;
public Stage lava;
	public Suurus(double suurus, Stage lava) {
	super();
	this.lava=lava;
	this.suurus = suurus;
}
	@Override
	public void handle(MouseEvent event) {
		// TODO Auto-generated method stub
		Aken.m=suurus;
		lava.setHeight(400*suurus);
		lava.setWidth(800*suurus);
		System.out.println("auh");
		
	}

}
