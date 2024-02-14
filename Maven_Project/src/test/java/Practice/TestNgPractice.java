package Practice;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgPractice {
	
	@BeforeSuite
	public void beforesuitemethod() {
		System.out.println("before Suite");
		
	}
	@BeforeTest
	public void beforetestmethod() {
		System.out.println("before test");
	}
	
		@BeforeClass
	public void beforeclassmethod() {		
		System.out.println("before class");
		
	}
	@BeforeMethod
	public void beforem1() {
		
		System.out.println("before method");
		
	}	
	
	@Test (priority = 1)  
	public void tc1() {

		System.out.println("test case 1");
	}
	@Test (priority = 0) // we can set the priority of the test case and the lesser number of priority will execute first.
	public void tc2() {
		System.out.println("test case 2");
		
	}
	@AfterMethod
	public void afterm1() {
		System.out.println("after method");
		
	}
	@AfterClass
	public void afterclassmethod() {
		System.out.println("after class");
		
	}
	@AfterTest
	public void aftertestmethod() {
		System.out.println("after test");
		
	}
	@AfterSuite
	public void aftersuitemethod() {
		System.out.println("after suite");		
	}

}
