import javafx.animation.PathTransition;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.input.KeyEvent;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.util.Duration;


public class Nooled implements EventHandler<KeyEvent> {
	public Group tegelane;
	

	public Nooled(Group tegelane) {
		super();
		this.tegelane = tegelane;
	}
	@Override
	public void handle(KeyEvent event) {
		//System.out.println(event.getCode());
		String klahv = event.getCode().toString();
		if (klahv =="LEFT"){
			if (Aken.tegex>25)
			liigu(tegelane,-10,0);
			}
		if (klahv =="DOWN"){
			if (Aken.tegey<375)
			liigu(tegelane,0,10);
			}
		if (klahv =="UP"){
			if (Aken.tegey>25)
			liigu(tegelane,0,-10);
			}
		if (klahv =="RIGHT"){
			if (Aken.tegex<775)
			liigu(tegelane,10,0);
			}
		
		
	}
	public PathTransition liigu(Group kangelane,double d, double y){
		Path path = new Path();
		path.getElements().add(new MoveTo((Aken.tegex)*Aken.m, (Aken.tegey)*Aken.m));
		path.getElements().add(
				new LineTo((Aken.tegex+d)*Aken.m, (Aken.tegey+y)*Aken.m));
		Aken.tegex=Aken.tegex+d;
		Aken.tegey=Aken.tegey+y;

		PathTransition suundu = new PathTransition();
		suundu.setDuration(Duration.millis(10));
		suundu.setNode(kangelane);
		suundu.setPath(path);
		
		suundu.play();
		return suundu;
	}
	

}
