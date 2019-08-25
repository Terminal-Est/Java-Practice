public class Stringtst {

	public static void main(String[] args) {
		long[] valuesA;
		valuesA = new long[2];
		int[] valuesB;
		valuesB = new int[2];
		valuesA[0] = 2;
		valuesB[1] = 90;
		valuesB[0] = (int) valuesA[0];
		valuesA[1] = valuesB[1];
		// Calculation must evaluate to 90/(2.0*2.0)
		double mi = valuesB[1] / (valuesA[0] * valuesA[0]);
		String output = "Mass index: " + mi;
		System.out.println(output);
	}

}
