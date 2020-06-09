public class output {
	public static void main(String[] args) {
		System.out.printf("%5s", "Number");
		System.out.printf("%7s", "Square");
		System.out.printf("%8s", "SqRt");
		System.out.printf("%10s", "Cube");
		System.out.printf("%11s\n", "FourthRt");
		for(int i=1;i<=20;i++) {
			System.out.printf("%5d", i);
			System.out.printf("%7d", i*i);
			System.out.printf("%10.4f", Math.pow(i, 0.5));
			System.out.printf("%9d", i*i*i);
			System.out.printf("%10.4f\n", Math.pow(i, 0.25));
		}
	}

}