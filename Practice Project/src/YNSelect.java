import javax.swing.JOptionPane;

public class YNSelect {


	public static void main(String[] args) {

	
	int YN = Integer.parseInt(JOptionPane.showInputDialog(null, "Do you want to continue? 1 for Yes, 2 for No."));

	if (YN == 1) {
		JOptionPane.showMessageDialog(null, "You have continued!");
	} else if (YN == 2) {
		JOptionPane.showMessageDialog(null, "You have Quit!");
	}
	
	}
	
}
	