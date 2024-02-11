package Practice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class InstagramLoginPage {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		WebElement link = driver.findElement(By.linkText("Forgot password?"));
		Actions ac = new Actions(driver);
		ac.keyDown(Keys.CONTROL).click(link).keyUp(Keys.CONTROL).build().perform(); // here , we are clicking with CONTROL KEY on the forgot password hyperlink
		System.out.println(link);
		

	}

}
