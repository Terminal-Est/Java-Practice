import java.util.Scanner;

public class Modulo {
	public static void main(String[] args) {
		Scanner test = new Scanner(System.in);
		short a = 0;
		short b = 0;
		int c = 0;
		while (a != -1) {
			System.out.println("Enter -1 to exit");
			System.out.println("Enter dividend: ");
			a = test.nextShort();
			if (a == -1) {
				System.out.flush();
				System.exit(a);
			}
			System.out.println("Enter divisor: ");
			b = test.nextShort();
			c = (a % b);
			System.out.println("Result: " + c);
		}
		test.close();
	}
}
