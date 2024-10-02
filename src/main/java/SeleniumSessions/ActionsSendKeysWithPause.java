package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsSendKeysWithPause {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		driver.manage().window().maximize();
		
		By firstName = By.id("input-firstname");
		ActionSendKeysPause(firstName, "AMAZON WEB SERVICE", 200);
		
		
//		WebElement fnameEle = driver.findElement(firstName);
//		Actions act = new Actions(driver);
//		String Myname = "Java with Selenium";
//		char ch[] = Myname.toCharArray();
//		for(char c: ch) {
//			act.sendKeys(fnameEle, String.valueOf(c)).pause(200).perform();
//		}
//		
		
		driver.quit();

	}
	
	public static void ActionSendKeysPause(By locator,String value,int delaytime) {
		WebElement fnameEle = getElement(locator);
		Actions act = new Actions(driver);
		char ch[] = value.toCharArray();
		for(char c: ch) {
			act.sendKeys(fnameEle, String.valueOf(c)).pause(delaytime).perform();
		}
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
