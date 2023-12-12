package package1;

public class Constructors3 {
	
	int a,b,c,d,e;
	public Constructors3(int a1,int a2,int a3,int a4,int a5) { // here , we have created a constructor and we will call variables using constructor
		a=a1;
		b=a2;
		c=a3;
		d=a4;
		e=a5;
	}
public static void main(String[] args) {
	Constructors3 obj3 = new Constructors3(14, 15, 16, 111, 222);
		System.out.println(obj3.a);
	    System.out.println(obj3.b);
	    System.out.println(obj3.c);
	    System.out.println(obj3.d);
	    System.out.println(obj3.e);
}
}
