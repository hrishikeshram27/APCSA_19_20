package introClass;

public class TriTest {

	public static void main(String[] args) {
		Triangle abc = new Triangle (2,1,2,5,6,3);
		System.out.println(abc.toString());
		
		abc.reflectX();
		System.out.println(abc.toString());
		
		abc.reflectY();
		System.out.println(abc.toString());
		
		System.out.println(abc.area());
		System.out.println(abc.perimeter());
		
		abc.dilate(3);
		System.out.println(abc.toString());
		
		Triangle def= new Triangle(2,2,2,4,6,8);
		System.out.println(def.toString());
		System.out.println(def.area());
		System.out.println(def.perimeter());
		
		
		
	}

}