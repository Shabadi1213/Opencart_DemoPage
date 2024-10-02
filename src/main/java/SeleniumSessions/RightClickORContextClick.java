package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickORContextClick {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		
			By rightClick = By.xpath("//span[text() = 'right click me']");
			By rightclickOptions = By.xpath("//ul[@class='context-menu-list context-menu-root']/li/span");
			By conoption = By.xpath("//span[text()='Cut']");
			
//			doContextClick(rightClick, rightclickOptions, "Copy");
			doContextClick(rightClick, "Delete");
			
//			Actions act = new Actions(driver);
//			act.contextClick(driver.findElement(rightClick)).perform();
//			Thread.sleep(2000);
//			
//			List<WebElement> eleList = driver.findElements(rightclickOptions);
//			for(WebElement e:eleList) {
//				String eleText= e.getText();
//				System.out.println(eleText);
//				if(eleText.equals("Delete")) {
//					e.click();
//					break;
//				}
//			}
			
			
//			driver.quit();

	}
	
	
	public static void doContextClick(By locator,By locator2,String optionName) throws InterruptedException {
		Actions act = new Actions(driver);
		act.contextClick(getElement(locator)).perform();
		Thread.sleep(2000);
		
		List<WebElement> eleList = getElements(locator2);
		for(WebElement e:eleList) {
			String eleText= e.getText();
			System.out.println(eleText);
			if(eleText.equals(optionName)){
				e.click();
				break;
			}
		}
		
	}
	
	
	public static void doContextClick(By locator,String value) throws InterruptedException {
		Actions act = new Actions(driver);
		act.contextClick(getElement(locator)).perform();
		act.click(getElement(By.xpath("//span[text()='"+value+"']"))).perform();
		Thread.sleep(2000);
	}

	
	public static List<WebElement> getElements(By locator) {
		 List<WebElement> eleList = driver.findElements(locator);
		 return eleList;
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
}
