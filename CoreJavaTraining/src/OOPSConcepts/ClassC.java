package OOPSConcepts;

public class ClassC extends ClassB{  // this is multulevel inheritance
      int c1 = 456;
      public void method3() {
    	  
    	 System.out.println("this is son class method");
		
	}
      public static void main(String[] args) {
    	  
    	  ClassC new_var = new ClassC();
    	  new_var.a1= 339;
    	  new_var.b1 = 4044;
    	  new_var.method1();
    	  new_var.method2();
    	  new_var.method3();
    	  System.out.println(new_var.a1);
    	  System.out.println(new_var.b1);
    	  System.out.println(new_var.c1);
    	  
		
	}
}
