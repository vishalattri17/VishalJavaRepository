package Practice;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnSeleniumFebrurary {

	public static void main(String[] args) throws InterruptedException {
		
		//ChromeOptions co = new ChromeOptions();
		//co.setBinary("C:\\Users\\vishal.sharma\\Downloads\\chrome-win64_latest\\chrome-win64//chrome.exe");
	
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://portal.myndsolution.com:8453/CRM/goToLoginPage");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("priyanka@myndsol.com");
		driver.findElement(By.id("password")).sendKeys("Mynd@123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"createNewLeads\"]/span")).click();
        Thread.sleep(3000);
        //driver.findElement(By.id("registeredAs")).click();
        Select s = new Select(driver.findElement(By.id("registeredAs")));
        s.selectByIndex(2);
        driver.findElement(By.xpath("//input[@id='organization']")).sendKeys("LEEHAN RETAILS PRIVATE LIMITED");
        driver.findElement(By.xpath("//input[@name='message']")).sendKeys("request for registration");
        Select status = new Select(driver.findElement(By.id("status")));
        status.selectByVisibleText("Work in Progress");
        Select assignto = new Select(driver.findElement(By.id("assignTo")));
        assignto.selectByVisibleText("priyanka");
        driver.findElement(By.xpath("//input[@id='pan']")).sendKeys("AACCL7007R");
        Select m1TeamMember = new Select(driver.findElement(By.xpath("//select[@id='m1TeamMember']")));
        m1TeamMember.selectByVisibleText("priyanka");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[@id='saveLeadContactDetails']")).click();
  		/*
		 * Thread.sleep(5000); 
		 * Alert alert = driver.switchTo().alert();
		 * driver.switchTo().alert().dismiss();
		 */
        
        
        
        
        
        
        
      

}}

