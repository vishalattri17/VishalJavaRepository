package package1;

public class ThisKeyowrdAssignment {

	public void method() {
		this.method3(88, 77, 55);
		System.out.println("default method");
		
	}
	public void method1(int a) {
		this.method2(22, 44);
		System.out.println("one parametrized method");
	}
	public void method2(int b, int c) {
		this.method4(323, 232, 235, 454);
		System.out.println("two parametrized method");
	}
	public void method3(int d, int e, int f) {
		System.out.println("three parametrized method");
	}
	public void method4(int h, int i, int j, int k) {
		this.method();
		System.out.println("four parametrized method");
		
	}
	public static void main(String[] args) {
		ThisKeyowrdAssignment test = new ThisKeyowrdAssignment();
		test.method1(1);

	}
}
