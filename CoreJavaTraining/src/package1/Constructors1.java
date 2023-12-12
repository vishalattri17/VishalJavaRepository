package package1;

public class Constructors1 {
	int a, b, c, d, e;

	public void method1(int x1, int x2, int x3, int x4, int x5) {
		a = x1;
		b = x2;
		c = x3;
		d = x4;
		e = x5;
	}

	public static void main(String[] args) {
		Constructors1 obj1 = new Constructors1();
		obj1.method1(12, 13, 14, 15, 16);
		System.out.println(obj1.b);

	}
}
