package OOPSConcepts;

public class Class4 extends Class3  {
	
	public void method3() {
		
		System.out.println("Child class method 3");
		super.method1(); //calling the parent class method
		super.method2(); // calling the parent class method
		this.method4();
		super.a1 = 345; // calling the parent class variable
		System.out.println(super.a1);
		
	}

	public void method4() {
		
		System.out.println("Child class method 4");
		
	}
	public static void main(String[] args) {
		
		Class4 obj = new Class4();
		obj.method3();
		
	}
}
