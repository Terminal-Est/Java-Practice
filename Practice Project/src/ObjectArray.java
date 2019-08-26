public class ObjectArray {
	private ObjectArray2[] test;
	private int fizz;
	private int buzz;
	private int foo;

	public ObjectArray(int x, int y, int z) {
		this.test = new ObjectArray2[10];
		this.test[0] = new ObjectArray2(10, 10, 10);
		this.test[1] = new ObjectArray2(20, 20, 20);
		this.test[2] = new ObjectArray2(30, 30, 30);
		printArray(x, y, z);

	}

	public static void main(String[] args) {
		ObjectArray obj = new ObjectArray(1, 2, 3);
		return;
	}

	public void printArray(int a, int b, int c) {
		int i = 0;
		String bar = "";
		while (i < 3) {
			this.fizz = this.test[i].getX(a);
			this.buzz = this.test[i].getY(b);
			this.foo = this.test[i].getY(c);
			bar = bar + this.fizz + ", " + this.buzz + ", " + this.foo + "\n";
			i += 1;
		}
		System.out.println("Output --- \n" + bar);

	}

}
