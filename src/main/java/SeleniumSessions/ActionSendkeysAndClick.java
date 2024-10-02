package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionSendkeysAndClick {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		By fname = By.id("input-firstname");
		By agree = By.name("agree");
		
		doActionsSendKeys(fname, "AutoSelenium");
		Thread.sleep(1000);
		doActionsClick(agree);
//		act.sendKeys(driver.findElement(By.id("input-firstname")), "JavaTestfdf").perform();
//		act.sendKeys(driver.findElement(By.id("input-lastname")), "Automations").perform();
//		act.sendKeys(driver.findElement(By.id("input-email")), "test222@gmail.com").perform();
//		act.sendKeys(driver.findElement(By.id("input-telephone")), "1234567890").perform();
//		act.sendKeys(driver.findElement(By.id("input-password")), "pwd@123455").perform();
//		act.sendKeys(driver.findElement(By.id("input-confirm")), "pwd@123455").perform();
//		act.click(driver.findElement(By.name("agree"))).perform();
//		act.click(driver.findElement(By.cssSelector("input.btn-primary"))).perform();
		Thread.sleep(2000);
		
		driver.quit();
		
	}
	
	public static void doActionsSendKeys(By locator,String value) {
		Actions act = new Actions(driver);
		act.sendKeys(getElement(locator), value).perform();
	}
	
	public static void doActionsClick(By locator) {
		Actions act = new Actions(driver);
		act.click(getElement(locator)).perform();
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
}
