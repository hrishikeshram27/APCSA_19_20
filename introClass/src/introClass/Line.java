package introClass;

public class Line {
	private Coordinate a;
	private Coordinate b;
	public Line() {
		a = new Coordinate(0,0);
		b = new Coordinate(0,0);
	}
	public Line(int ax, int ay, int bx, int by) {
		a = new Coordinate(ax,ay);
		b = new Coordinate(bx,by);
	}
	public void dilate(int scaleFactor) {
		a.dilate(scaleFactor);
		b.dilate(scaleFactor);
	}
	public String toString() {
		return("a" + a.toString() + " to b" + b.toString());
	}
}
