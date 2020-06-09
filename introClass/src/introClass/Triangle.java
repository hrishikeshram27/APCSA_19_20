package introClass;

public class Triangle {
	private Coordinate a;
	private Coordinate b;
	private Coordinate c;
	
	public Triangle() {
		a = new Coordinate(0,0);
		b = new Coordinate(0,0);
		c = new Coordinate(0,0);
	}
	public Triangle(int ax, int ay, int bx, int by, int cx, int cy) {
		a = new Coordinate(ax,ay);
		b = new Coordinate(bx,by);
		c = new Coordinate(cx,cy);
	}
	public void dilate(int scaleFactor) {
		a.dilate(scaleFactor);
		b.dilate(scaleFactor);
		c.dilate(scaleFactor);
	}
	public double area() {
		int ax = a.getX();
		int ay = a.getY();
		int bx = b.getX();
		int by = b.getY();
		int cx = c.getX();
		int cy = c.getY();
		double distAB = Math.pow(Math.pow((bx-ax), 2) +  Math.pow((by-ay),2), 0.5);
		double distAC = Math.pow(Math.pow((cx-ax), 2) +  Math.pow((cy-ay),2), 0.5);
		double cosine = (((bx-ax)*(cx-ax))+((by-ay)*(cy-ay)))/(distAB*distAC);
		double angle = Math.acos(cosine);
		return ((int)(100000*((distAB*distAC*0.5*(Math.sin(angle)))+0.000005)))/100000.0;
	}
	public void reflectX() {
		a.reflectX();
		b.reflectX();
		c.reflectX();
	}
	public void reflectY() {
		a.reflectY();
		b.reflectY();
		c.reflectY();
	}
	public double perimeter() {
		int ax = a.getX();
		int ay = a.getY();
		int bx = b.getX();
		int by = b.getY();
		int cx = c.getX();
		int cy = c.getY();
		double distAB = Math.pow(Math.pow((bx-ax), 2) +  Math.pow((by-ay),2), 0.5);
		double distAC = Math.pow(Math.pow((cx-ax), 2) +  Math.pow((cy-ay),2), 0.5);
		double distBC = Math.pow(Math.pow((cx-bx), 2) +  Math.pow((cy-by),2), 0.5);
		return ((int)(100000*((distAB+distAC+distBC)+0.000005)))/100000.0;
	}
	public String toString() {
		return a.toString() + b.toString() + c.toString();
	}
}
