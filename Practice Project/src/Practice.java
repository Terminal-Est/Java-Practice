
//import java.util.Scanner;
//import java.io.FileWriter;
//import java.io.BufferedWriter;
//import java.io.IOException;
import javax.swing.JOptionPane;

public class Practice {
	private String[] testArray;

	public Practice() {
		this.testArray = new String[5];
		testThis();
		printArray();
//		int count = 0;
//		String name = "";
//		Scanner inputs = new Scanner(System.in);
//	
//		try {
//			FileWriter test = new FileWriter("test.txt");
//			BufferedWriter oops = new BufferedWriter(test);
//			while (count < 3) {
//				System.out.print("Enter Name: ");
//				name = inputs.next();
//				oops.write(name);
//				oops.newLine();
//				oops.write("Fizz");
//				oops.newLine();
//				oops.write("Buzz");
//				oops.newLine();
//				oops.write("Fizz Buzz");
//				oops.newLine();
//				count += 1;
//			}
//			oops.close();
//		} catch (IOException fail) {
//			fail.printStackTrace();
//		}
//
//		inputs.close();

	}

	public static void main(String[] args) {
		Practice objA = new Practice();
		return;
	}

	public void testThis() {
		String a = "";
		String b = "";
		String c = "";
		String d = "";		
		int i = 0;
		while (i < 5) {
			a = JOptionPane.showInputDialog(null, "Enter a");
			b = JOptionPane.showInputDialog(null, "Enter b");
			practice2 objb = new practice2(a, b);
			this.testArray[i] = objb.getA(c) +":"+ objb.getB(d);
			i += 1;
		}
	}
	
	public void printArray() {
		int x = 0;
		while (x < 5) {
			System.out.println(this.testArray[x]);
			x += 1;
		}
	}

}
