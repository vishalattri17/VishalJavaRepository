package OOPSConcepts;

public class Class1 {
	
	public Class1() {
		this(98, 97, 96);

   System.out.println("Parent Class default Constructor");
   	}
	public Class1(int a) {
          this(88, 11);
		   System.out.println("Parent Class one parametrized Constructor");
		   	}
	public Class1(int a,int b) {
		this();

		   System.out.println("Parent Class two parametrized Constructor");
		   	}
	public Class1(int a,int b,int c) {

		   System.out.println("Parent Class three parametrized Constructor");
		   	}

}
