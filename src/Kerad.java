import javafx.scene.Node;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Kerad extends Objekt {
	public Node node;
	public double vY = 0;
	public boolean kustutatav = false;

	public Kerad(double x, double y, double raadius, Color varv) {
		final Circle mull = new Circle(x, y, raadius, varv);
		node = mull;
	}

	public Circle getAsCircle() {
		return (Circle) node;
	}

	// Meetod, mille abil kontrollitakse, kas vastav mull
	// on väljas või selle piisavas läheduses
	public boolean kontroll(Circle kontrollvali) {
		Circle kera = getAsCircle();
		double dx = kontrollvali.getCenterX() - kera.getCenterX();
		double dy = kontrollvali.getCenterY() - kera.getTranslateY();
		double kaugus = Math.sqrt(dx * dx + dy * dy);
		double minKaugus = kontrollvali.getRadius() + kera.getRadius() + 10;
		return (kaugus < minKaugus);
	}

	public void uuenda() {
		node.setTranslateY(node.getTranslateY() + vY);

	}

}
