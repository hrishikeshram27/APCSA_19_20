package introClass;
public class Coordinate {
	private int x;
	private int y;
	public Coordinate(){
		x=y=0;
	}
	public Coordinate(int x, int y){
		this.x=x;
		this.y=y;
	}
	public void setCoordinate(int x, int y) {
		this.x=x;
		this.y=y;
	}
	public int getX() {return x;}
	public int getY() {return y;}
	public void dilate(int scalefactor) {
		x*=scalefactor;
		y*=scalefactor;
	}
	public void reflectX() {
		this.y *= (-1);
	}
	public void reflectY() {
		this.x *= (-1);
	}
	public String toString() {
		return ("(" + x + "," + y + ")");
	}
}
