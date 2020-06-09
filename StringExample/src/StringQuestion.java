public class StringQuestion {

	public static void main(String[] args) {
		//strings are weird. 
		//stick to using the convention below for strings.
		//using constructor to create a string
		String s1 = new String("a");
		String s2 = new String("a");
		System.out.println(s1 == s2); //prints false
		System.out.println(s1.equals(s2)); //prints true
		
		//another way to declare and initialize strings
		String s3 = "b";
		String s4 = new String();
		s4 = "b";
		System.out.println(s3 == s4); // prints true
		
		s4 = "c";
		System.out.println(s3 == s4); // prints false
		System.out.println(s3.equals(s4)); // prints false
		
		/* output is:
		 * false
		 * true
		 * true
		 * false
		 * false
		 */
	}


}