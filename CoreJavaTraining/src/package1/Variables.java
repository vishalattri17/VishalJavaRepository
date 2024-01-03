package package1;

public class Variables {
	
	int i ; // global variable
	String str ;
	
	public void method1(int i, String str) {  //local variable
		this.i = i; // here if global and local variables are same , then use "this" keyowrd
		this.str = str;
		char a = 'Y';
		
		
	}
	
	public static void main(String[] args) {
		
		Variables var = new Variables();
		var.method1(123);
		System.out.println(var.i);
		var.str = "Jumbo class";
		System.out.println(var.str);
	}
	
	
	

}
