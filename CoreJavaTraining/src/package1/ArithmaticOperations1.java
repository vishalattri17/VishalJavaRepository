package package1;

public class ArithmaticOperations1 {

	public int add(int a, int b) {
		int c = a + b;
		System.out.println("sum result is " + c);
		return c;
	}

	public int multi(int m, int n) {
		int k = m * n;
		System.out.println("multiplication result is " + k);
		return k;
	}

	public int subtract(int x1, int x2) {
		int x3 = x1 - x2;
		System.out.println("subtraction result is " + x3);
		return x3;
	}

	public void division(int d1, int d2) {
		int d3 = d1 / d2;
		System.out.println("division result is " + d3);
	}

	public static void main(String[] args) {
		ArithmaticOperations1 result1 = new ArithmaticOperations1();
		int multiresult = result1.multi(10, 2);
		int subresult = result1.subtract(multiresult, 2);
		int addresult = result1.add(subresult, 2);
		int subresult1 = result1.subtract(addresult, 2);
		result1.division(subresult1, 2);
	}
}
