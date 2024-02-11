package OOPSConcepts;
public class Class2 extends Class1{	
	public Class2() {
		super(21); // calling the parent parametrized constructor
		System.out.println("Child Class default constructor");
	}
	public Class2(int x) {
		
		this(44, 66, 88);
		
		System.out.println("Child Class one parametrized constructor");
	}
	public Class2(int x, int y) {
		this(667);
		System.out.println("Child Class two parametrized constructor");
	}
	public Class2(int x, int y , int z) {
		this();
		System.out.println("Child Class three parametrized constructor");
	}
	
	public static void main(String[] args) {		
		Class2 obj = new Class2(23,455);
	}

}
