
public class PassingVariables {
	public PassingVariables() {
		int test = 5, blargh = 7; 
		int test1[] = new int[2];
		test1[0] = 1;
		test1[1] = 10;
		int buzz[] = method2(test1);
		System.out.println(test);
		System.out.println(test1[0] + " : " + test1[1]);
		System.out.println(buzz[0] + " : " + buzz[1]);
		method1(test);
		method3(blargh);		
	}

//Create object then instantiate it. Don't worry about the warning.
	public static void main(String[] args) {
		PassingVariables obj = new PassingVariables();
		int trial = 4;
		obj.method3(trial);
	}

//To pass a variable, you can declare it in another method then make the method parameter the same as the declared variable.
	public int method1(int test) {
		test = test / 2;
		System.out.println(test);
		return test;
	}

//To pass an array, you declare the array type (in this case int) and the array variable declared in the constructor (see below for passing from other methods).
//in the method parameters. To return an array, make sure the [] is used in the method type.
	public int[] method2(int[] test1) {
		test1[0] += 1;
		test1[1] /= 2; // do things on one line, saves space.
		return test1;
	}

//You can also pass variables from the main method using the object created there. In this case the object is called obj, we declared the 
//variable trial in the main method and used obj.method3(trial) to pass it off.
	public int method3(int trial) {
		trial *= 3;
		System.out.println(trial);
		return trial;
	}
}
