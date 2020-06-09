public class IntWrap {

	public static void main(String[] args) {
		System.out.println("Number of bytes in an int: " + Integer.BYTES);
		System.out.println("Number of bits in an int: " + Integer.SIZE);
		System.out.println("Max Value of an int: " + Integer.MAX_VALUE);
		System.out.println("Min Value of an int: " + Integer.MIN_VALUE);
		
		System.out.println("");
		
		Integer i1 = new Integer(41); //using a constructor
		System.out.println ("i1 is " + i1);
		
		Integer i2 = new Integer ("50");//constructer with string input
		System.out.println ("i2 is " + i2);
		
		Integer i3 = 0; //autobox
		i3 = 43;
		byte b = i3.byteValue();
		System.out.println("byte b is " + b);
		
		System.out.println("Integer compare i1,i2 " + Integer.compare(i1, i2));
		
		System.out.println("i3 as a double is " + i3.doubleValue());
		System.out.println("i3 hashcode is " + i3.hashCode());
		
		int i4 = Integer.parseInt("48");
		
		System.out.println("i4 is " + i4);

	}

}