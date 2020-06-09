import java.util.*;
public class inputAvg {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int sum = 0;
		int counter = 0;
		char input = 'Y';
		while(input!='N') {
			System.out.println("Enter an integer: ");
			int n = keyboard.nextInt();
			sum+=n;
			counter++;
			System.out.println("Do you want to input? (Y/N): ");
			input = keyboard.next().charAt(0);
		}
		keyboard.close();
		System.out.print("The avg is: ");
		System.out.println((double)sum/counter);
	}
}