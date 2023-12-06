package package1;

public class Student1 {
	int rollno;
	int age;
	public void display1() {
		System.out.println("Welcome to all of you");
		}
	public void display2() {

		System.out.println("Automation is very easy");
	}
	public static void main(String[] args) {

		Student1 stddata = new Student1();
		stddata.rollno = 145;
		stddata.age = 18;
		stddata.display1();
		stddata.display2();
		System.out.println("roll no. of vishal is " + stddata.rollno);
		System.out.println("age of student vishal is " + stddata.age);
		
		
	}
}
