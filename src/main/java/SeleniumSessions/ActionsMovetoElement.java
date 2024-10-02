package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsMovetoElement {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/30-day-free-trial");
		driver.manage().window().maximize();
		Thread.sleep(1500);
		
//		By orgHrm = 	By.xpath("//a[text() = 'Why OrangeHRM']");
//		By stakHolder = By.xpath("//a[text() = 'Why OrangeHRM']//parent::li//li[3]");
//		By hrManager = By.xpath("//a[text() = 'Why OrangeHRM']//parent::li//li[3]//a[text() = 'IT Manager']");
		
		ParentChildMenu("Why OrangeHRM", "IT Manager");
		
		driver.quit();

	}
	
	
	public static void ParentChildMenu(String parentMenu , String childMenu) throws InterruptedException {
		
		Actions act = new Actions(driver);
		act.moveToElement(getElement(By.xpath("//*[text() = '"+parentMenu+"']"))).perform();
		Thread.sleep(1000);
		act.moveToElement(getElement(By.xpath("//*[text() = '"+parentMenu+"']//parent::li//li[3]"))).perform();
		Thread.sleep(1000);
		act.click(driver.findElement(By.xpath("//*[text() = 'Why OrangeHRM']//parent::li//li[3]//a[text() = '"+childMenu+"']"))).perform();
		Thread.sleep(1500);
		
	}

	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
}
