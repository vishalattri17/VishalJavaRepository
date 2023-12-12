package package1;

public class ConstructorAssignment {

	public ConstructorAssignment() {
		this(2121, 3232,8374,8347);
		System.out.println("default constructor");
	}

	public ConstructorAssignment(int a) {
		this(23,2323,23234);
		
		System.out.println("one parametrized constructor");
	}

	public ConstructorAssignment(int b, int c) {

		System.out.println("two parametrized constructor");
	}

	public ConstructorAssignment(int d, int e, int f) {

		System.out.println("three parametrized constructor");
	}

	public ConstructorAssignment(int g, int h, int k, int m) {
		
				System.out.println("four parametrized constructor");
	}

	public static void main(String[] args) {

		ConstructorAssignment obj = new ConstructorAssignment();

	}

}
