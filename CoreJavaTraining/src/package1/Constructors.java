package package1;

public class Constructors {
	
	//constructors are like method
	public Constructors() {
		System.out.println("this is default constructor");
	}
	public Constructors(float f) {
		
		System.out.println("this is one parametrized constructor");
	}
	
	public Constructors(int a , float f) {

		System.out.println("this is two parametrized constructor");
	}
	
	public static void main(String[] args) {
		
		Constructors ref_var = new Constructors(12,345.3434f); //whatever we will pass directly, constructor will be called
	                                                          //automatically and will print the values.
	}
}
