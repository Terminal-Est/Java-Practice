import java.util.Scanner;

public class Stringtst {

	public static void main(String[] args) {
		int num;
		String out = "";
		System.out.println("enter number: ");
		Scanner numscan = new Scanner(System.in);
		num = numscan.nextInt();
		numscan.close();

		if (num == 1) {
			out = ("This is a test");
		} else if (num == 2) {
			out = ("This is a test 2");
		} else if (num == 3) {
			out = ("This is a test 3");
		} else if (num >= 3) {
			out = ("end");
		}

		System.out.println(out);

	}

}
