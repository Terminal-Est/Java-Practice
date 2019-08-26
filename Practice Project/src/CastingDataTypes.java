public class CastingDataTypes {

	public static void main(String[] args) {
		double[] valuesA;
		valuesA = new double[2];
		int[] valuesB;
		valuesB = new int[2];
		valuesA[0] = 2.0;
		valuesB[1] = 90;
		valuesB[0] = (int) valuesA[0];
		valuesA[1] = valuesB[1];
		// Calculation must evaluate to 90/(2.0*2.0)
		double mi = valuesB[1] / (valuesA[0] * valuesA[0]);
		String output = "Mass index: " + mi;
		System.out.println(output + "\n");
		castingData();
	}

	public static void castingData() {
		String concat = "";
		byte a = 2;
		short b = 7;
		int c = 5;
		long x = 21;
		float y = 11.2f;
		double z = 72.6;
		System.out.println("Uncast Data ---\nbyte: " + a + ", short: " + b + ", int: " + c + ", long: " + x
				+ ", float: " + y + ", double: " + z);
		concat = concat + "Data cast to byte ---\n";
		a = (byte) z;
		concat = concat + "double to byte: " + a + ", ";
		a = (byte) y;
		concat = concat + "float to byte: " + a + ", ";
		a = (byte) x;
		concat = concat + "long to byte: " + a + ", ";
		a = (byte) c;
		concat = concat + "int to byte: " + a + ", ";
		a = (byte) b;
		concat = concat + "short to byte: " + a + ", ";
		System.out.println(concat);
		concat = "";
		z = y;
		System.out.println(
				"You can copy data from smaller primitive into a larger one, the following is the float copied into the double\n"
						+ z);
	}

}
