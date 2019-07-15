
public class PassingVariables {
	public PassingVariables() {
		int test = 5;
		int test1[] = new int[2];
		test1[0] = 1;
		test1[1] = 5;
		System.out.println(test);
		System.out.println(test1[0] + " : " + test1[1]);
		method1(test);
		method2(test1);

	}
//Create object then instantiate it. Don't worry about the warning.
	public static void main(String[] args) {
		PassingVariables obj = new PassingVariables();
	}

//To pass a variable, you can declare it in another method then make the method parameter the same as the declared variable.
	public void method1(int test) {
		test = test / 2;
		System.out.println(test);
	}

//To pass an array, you declare the array type (in this case int) and the array variable declared in the constructor (or other methods?).
//in the method parameters.
	public void method2(int[] test1) {
		test1[0] = test1[0] + 1;
		test1[1] = test1[1] + 3;
		System.out.println(test1[0] + " : " + test1[1]);
	}
}
