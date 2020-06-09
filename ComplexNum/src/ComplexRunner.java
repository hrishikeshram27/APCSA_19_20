public class ComplexRunner {

	public static void main(String[] args) {
		ComplexNum x = new ComplexNum (3,4);
		ComplexNum y = new ComplexNum(9,-1);
		
		ComplexNum z = x.plus(y);
		
		z = y.minus(x);
		System.out.println(z);
		
		z = y.times(x);
		System.out.println(z);
		
		double mag = z.getR();
		double angle = z.getTheta();
		System.out.println((mag + "(cos(" + angle + ") + jsin(" + angle + "))"));
		
		z = x.plus(x);
		System.out.println(z.toString());
		
		System.out.println(z.conjugate());
		
		z = y.rationalize();
		System.out.println(z.toString());
	}

}