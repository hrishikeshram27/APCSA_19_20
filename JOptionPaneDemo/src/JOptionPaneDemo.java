import javax.swing.*;
public class JOptionPaneDemo {

	public static void main(String[] args) {
		String appleString;
		appleString = JOptionPane.showInputDialog("enter number of apples: ");
		int appleCount;
		appleCount = Integer.parseInt(appleString);
		
		String orangeString;
		orangeString = JOptionPane.showInputDialog("Enter number of oranges: ");
		int orangeCount;
		orangeCount = Integer.parseInt(orangeString);
		
		int totalFruitCount = appleCount +orangeCount;
		
		JOptionPane.showMessageDialog(null, "the number of fruits = "+ totalFruitCount);
		JOptionPane.showMessageDialog(null, "boxes " + 2);
		System.exit(0);
	}

}