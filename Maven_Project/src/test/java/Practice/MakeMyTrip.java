package Practice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MakeMyTrip {

	public static void main(String[] args) throws InterruptedException {
		
		// we will select the dropdown which have other tags than 'select' and automate them.
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");		
		Thread.sleep(3000);
		
		
		WebElement fromcity = driver.findElement(By.cssSelector(".lbl_input"));
		System.out.println("ok till now");
		Actions ac = new Actions(driver);
		ac.sendKeys(Keys.ESCAPE).build().perform();
		
		ac.keyDown(Keys.CONTROL).keyUp(Keys.CONTROL).build().perform();		
		System.out.println("so far so good");
		

	}

}
