package package1;

public class Student {

	int a;
	public void method1() {

		System.out.println("Hi,welcome method1");

	}
	public static void main(String[] args) {

		Student stdname = new Student(); // we have created the object of the class
		stdname.a = 4000; // calling the variable using referencevariable and assigning some value
		stdname.method1(); // calling the method created
		System.out.println("Value of a is " + stdname.a);

	}

}
