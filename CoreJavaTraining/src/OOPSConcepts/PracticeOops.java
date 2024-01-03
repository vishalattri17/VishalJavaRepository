package OOPSConcepts;

public class PracticeOops extends LearnInheritance {
	
	int y;
	long mobilenumber;
	
	public static void main(String[] args) {
		
		PracticeOops var = new PracticeOops();
		var.method1();
		var.y = 454;
		var.mobilenumber = 9988776655l;
		var.str = "Let us practice for oops concept";
	   System.out.println(var.str);
	   System.out.println(var.mobilenumber);
		
	}

}
