import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ArrayComplex {

	public static void main(String[] args) throws FileNotFoundException {
		ComplexNum arr[] = new ComplexNum[10];
		
		Scanner sc = new Scanner(new File("C:\\Users\\hrish\\Documents\\ArrCmplx.txt"));
		int counter = 0;
	    while (sc.hasNextLine()) {
	    	Scanner sc2 = new Scanner(sc.nextLine()).useDelimiter(" ");
	    	while(sc2.hasNext()) {
	    		arr[counter] = new ComplexNum(Integer.parseInt(sc2.next()), Integer.parseInt(sc2.next()));
	    	}
	    	counter++;
	    	sc2.close();
	    }
	    sc.close();
		
		System.out.println("before sort: ");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		ComplexNum.bubbleSort(arr);
		
		System.out.println("\nafter sort: ");		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
