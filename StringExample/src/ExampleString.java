//examples of things we can do with strings
public class ExampleString {
	
	public static String mince(String str)
	{
		int n = str.length()/3;
		if (n>=1)
		{
			str = mince(str.substring(2*n))+ mince(str.substring(n, 2*n))+ mince(str.substring(0,n));
			
		}
		return str;
		
	}
	

	public static void main(String[] args) {
		// string concatenation
		String s1 = "Adventures";
		String s2 = s1 + " in ";
		String s3 = s2 + " Java!";
		System.out.println(s3);
		
		//finding a string within another string
		int index1 = s3.indexOf("Java", 0);
		//string we are looking for, starting position
		//returns the position of the string
		System.out.println(index1);
		
		index1 = s3.indexOf("hello");
		//returns a -1 if string not found
		System.out.println(index1);
		
		String s4 = "the wheels go round and round";
		int index2 = s4.lastIndexOf("round");
		//finds the last position of the string
		System.out.println(index2);
		
		//Alphabetical compare/order
		System.out.println(s1.compareTo("Adventures"));
		//if the two strings are equal, it returns a zero
		
		System.out.println(s1.compareTo("hello"));
		//if the calling string is first, then it returns a negative number
		
		System.out.println(s1.compareTo("Aardvark"));
		// returns a positive number
		
		char pos1 = s1.charAt(1);
		System.out.println("the character in the first position of s1 is " + pos1);
		
		int lengthOfString1 = s1.length();
		System.out.println("The length of string 1 is "+ lengthOfString1);
		
		//equals returns a boolean value. Checks to see if two strings are equal
		String s5 = "Adventures";
		if (s1.equals(s5))
			System.out.println ("s1 and s5 are the same");
		
		// s6 is the substring of s3 from index 0 to 4. Then change to lower case
		String s6 = s3.substring(0,4);
		System.out.println(s6.toLowerCase());
		//then to upper case
		System.out.println(s6.toUpperCase());
		
		//replace one character with another
		s6 = s6.replace('A', 'Z');
		System.out.println(s6);
		
		s1 = "Hello";
		String s7 = new String("Hello");
		
		System.out.print("s1 == s7 is ");
		System.out.println(s1==s7);
		System.out.println("s1.equals(s7) is "  + s1.equals(s7));
		
		s1 = s7;
		System.out.println(s1==s7);
		System.out.println(s1.equals(s7));
		
		//String s10=null;
		//System.out.println(s10.length());
		
		System.out.println(s2);
		String s8 = s2.substring(2);
		System.out.println(s8);
		s8 = s2.substring(0,9);
		System.out.println(s8);
		
		String strx = "123454321";
		System.out.println(mince(strx));
		
		String t1 = "Computer";
		String t2 = t1;
		t2  += "Science";
		System.out.println(t1+t2);
	}
}