package Practice;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JUnitPractice {  // here , we will use Junit and testcases will run in sequence. Beofre and after method will execute with each test case separately
	
	ChromeDriver driver;
	@Before
	 public void prerequisites() {
		 
		 driver = new ChromeDriver();
		 driver.get("https://www.facebook.com/");
		 driver.manage().window().maximize();
		 System.out.println("before annotation");
	}
	@Test
	public void testcase1() throws InterruptedException {
		
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("v@v.com");
		Thread.sleep(5000);
		System.out.println("testcase1");
	}
	@Test
	public void testcase2() {
		
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("Vishal@90");
		System.out.println("testcase2");
	}
	
		@After
	public void aftertest() {
		System.out.println("after annotation");
		driver.close();
		
	}
	
	@BeforeClass	
	public static void start() {
		System.out.println("before class annotation");
		
	}
	@AfterClass
	public static void end() {
		System.out.println("after class annotation");
		
	}
	
	

}
