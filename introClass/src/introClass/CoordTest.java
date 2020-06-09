package introClass;

public class CoordTest {
	public static void main(String[] args) {
		Coordinate a = new Coordinate();
		a.setCoordinate(3, 4);
		System.out.println(a.toString());
		a.dilate(8);
		System.out.println(a.toString());
	}

}
