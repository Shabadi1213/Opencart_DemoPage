package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionswithTab {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		driver.manage().window().maximize();
		
		By firstname = By.id("input-firstname");
		WebElement fname = driver.findElement(firstname);
		
		Actions act = new Actions(driver);
		
		Action action = act.sendKeys(fname, "ShabadiKumar")
		.sendKeys(Keys.TAB)
		.pause(500)
		.sendKeys("Shabadi")
		.sendKeys(Keys.TAB)
		.pause(500)
		.sendKeys("tejas82in@gmail.com")
		.sendKeys(Keys.TAB)
		.pause(500)
		.sendKeys("1234567890")
		.sendKeys(Keys.TAB)
		.pause(500)
		.sendKeys("ravi@123")
		.sendKeys(Keys.TAB)
		.pause(500)
		.sendKeys("ravi@123")
		.sendKeys(Keys.TAB)
		.pause(500)
		.sendKeys(Keys.TAB)
		.pause(500)
		.sendKeys(Keys.TAB)
		.pause(500)
		.sendKeys(Keys.SPACE)
		.sendKeys(Keys.ENTER)
		.pause(500)
		.build();
		
		action.perform();
		
		driver.quit();

	}

}
