import java.util.Scanner;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class Practice {

	public static void main(String[] args) {

		int count = 0;
		String name = "";
		Scanner inputs = new Scanner(System.in);

		try {
			FileWriter test = new FileWriter("test.txt");
			BufferedWriter oops = new BufferedWriter(test);
			while (count < 3) {
				System.out.print("Enter Name: ");
				name = inputs.next();
				oops.write(name);
				oops.newLine();
				oops.write("Fizz");
				oops.newLine();
				oops.write("Buzz");
				oops.newLine();
				oops.write("Fizz Buzz");
				oops.newLine();
				count += 1;
			}
			oops.close();
		} catch (IOException fail) {
			fail.printStackTrace();
		}

		inputs.close();

	}

}
