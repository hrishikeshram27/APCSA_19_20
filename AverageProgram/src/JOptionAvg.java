import javax.swing.*;
public class JOptionAvg {
	public static void main(String[] args) {
		char input = 'Y';
		int sum = 0;
		int counter = 0;
		while(input=='Y') {
			String n1 = JOptionPane.showInputDialog("enter integer: ");
			int n = Integer.parseInt(n1);
			sum+=n;
			counter++;
			input = JOptionPane.showInputDialog("do you want to input (Y/N): ").charAt(0);
		}
		JOptionPane.showMessageDialog(null, "The average is: " + (double)sum/counter);
	}
}