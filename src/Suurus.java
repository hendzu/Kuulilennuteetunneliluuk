import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Font;
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
		Aken.kiri.setFont(Font.font("Sustem Regular", 12*Aken.m));
		System.out.println("auh");
		
	}

}
