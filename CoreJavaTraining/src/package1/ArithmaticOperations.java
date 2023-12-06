package package1;

public class ArithmaticOperations {

	public int add(int a, int b) {
		int c = a + b;
		System.out.println("sum result is " + c);
		return c;
	}

	public int subtract(int x, int y) {
		int z = x - y;
		System.out.println("sub result is " + z);
		return z;
	}

	public int multi(int x1, int x2) {
		int x3 = x1 * x2;
		System.out.println("multiplication result is " + x3);
		return x3;
	}

	public void divide(int d1, int d2) {
		int d3 = d1 / d2;
		System.out.println("divison result is " + d3);
		
	}

	public static void main(String[] args) {

		ArithmaticOperations result = new ArithmaticOperations();
		int sumresult1 = result.add(10, 2);
		int sumresult2 = result.add(sumresult1, 2);
		int subresult = result.subtract(sumresult2, 2);
		int multiresult = result.multi(subresult, 2);
		result.divide(multiresult, 2);
		//System.out.println("final result is " + finalvalue);

	}
}
