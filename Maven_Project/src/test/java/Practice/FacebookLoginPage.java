package Practice;
import java.util.Iterator;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FacebookLoginPage {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		/* System.out.println(driver.getTitle()); */
		Actions ac = new Actions(driver);
		for (int i = 0; i < 3; i++) {
			
			ac.sendKeys(Keys.TAB).perform();	// we are pressing the TAB keyboard key 3 times on the facebook login page.
			Thread.sleep(4000);
		}
	
	}
}
