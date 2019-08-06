//import javax.swing.JOptionPane;

public class YNSelect {
	private String[] test, test1;
	private int arraySize, arrayNew;
	
	public YNSelect() {
		testCopyArray();
	}

	public static void main(String[] args) {
		YNSelect why = new YNSelect(); 
//		int YN = Integer.parseInt(JOptionPane.showInputDialog(null, "Do you want to continue? 1 for Yes, 2 for No."));
//
//		if (YN == 1) {
//			JOptionPane.showMessageDialog(null, "You have continued!");
//		} else if (YN == 2) {
//			JOptionPane.showMessageDialog(null, "You have Quit!");
//		}
	
	}

	public void testCopyArray() {
		this.arraySize = 3;
		this.test = new String[this.arraySize];
		this.test[0] = "one";
		this.test[1] = "two";
		this.test[2] = "three";
		this.arrayNew = this.arraySize += 1;
		this.test1 = new String[this.arrayNew];
		System.out.println(this.arrayNew);
		System.arraycopy(this.test, 0, this.test1, 0, (this.arraySize -= 1));
		this.test1[3] = "four";
		System.out.println(this.test1[0] + " " + this.test1[1] + " " + this.test1[2] + " " + this.test1[3]);
	}

}
