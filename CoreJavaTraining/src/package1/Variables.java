package package1;

public class Variables {
	
	int i ; // global variable
	
	public void method1(int i) {  //local variable
		this.i = i; // here if global and local variables are same , then use "this" keyowrd
		
	}
	
	public static void main(String[] args) {
		
		Variables var = new Variables();
		var.method1(123);
		System.out.println(var.i);
	}

}
