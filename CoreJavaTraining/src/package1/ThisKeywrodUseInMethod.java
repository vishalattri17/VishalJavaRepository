package package1;

public class ThisKeywrodUseInMethod {

	public void m1() {
		this.m4();
		this.m3();
		System.out.println("I am method1");
		this.m2();

	}

	public void m2() {

		System.out.println("I am method2");

	}

	public void m3() {
		this.m2();
		System.out.println("I am method3");

	}

	public void m4() {
         this.m2();
		System.out.println("I am method4");

	}

	public static void main(String[] args) {
		ThisKeywrodUseInMethod obj1 = new ThisKeywrodUseInMethod();
		obj1.m1();
	}
}
