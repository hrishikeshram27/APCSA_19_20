import java.io.*; 
import java.util.Scanner; 
public class avgFile { 
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("H:\\Documents\\AvgFile.txt");
	    Scanner sc = new Scanner(file);
	    int n = 0;
	    int counter = 0;
	    while (sc.hasNextLine()) {
	    	n += Integer.parseInt(sc.nextLine());
	    	counter++;
	    }
	    sc.close();
	    System.out.print("Avg = " + (double)n/counter);
	} 
}
