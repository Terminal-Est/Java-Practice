
public class practiceExams {

	public static void main(String[] args) {

		int s = 4;
		if (s < 2)
			s = 2;
		String answer = "s: " + s + "\n";
		int a = 0;
		while (a < s) {
			int b = 1;
			while (b <= s) {
				answer += (a % b);
				b = b + 1;
			}
			a = a + 1;
		}
		answer = answer + 1;
		System.out.println(answer);
	}

}
