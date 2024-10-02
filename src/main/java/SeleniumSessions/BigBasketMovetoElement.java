package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BigBasketMovetoElement {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver= new ChromeDriver();
		
		driver.get("https://www.bigbasket.com/");
		driver.manage().window().maximize();
		Thread.sleep(1500);
		
		By level1 = By.xpath("(//*[text()='Shop by'])[2]");
		By level2 = By.linkText("Foodgrains, Oil & Masala");
        By level3 = By.linkText("Atta, Flours & Sooji");
	    By level4 = By.linkText("Atta Whole Wheat");
	    
	    
	    parentChildMenu(level1, level2, level3, level4);
	    
//	    driver.findElement(L1).click();
//	    Actions act = new Actions(driver);
//	    Thread.sleep(1000);
//	    act.moveToElement(driver.findElement(By.linkText("Fruits & Vegetables"))).perform();
//	    Thread.sleep(1000);
//	    act.moveToElement(driver.findElement(By.linkText("Exotic Fruits & Veggies"))).perform();
//	    Thread.sleep(1000);
//	    driver.findElement(L4).click();
//	    Thread.sleep(5000);
//	    String title = driver.getTitle();
//	    System.out.println(title);
	    
	    driver.quit();
	    
	    
	    
	    
	    
	} 
	

	public static void parentChildMenu(By level1, By level2,By level3,By level4) throws InterruptedException {
		
		getElement(level1).click();
	    Actions act = new Actions(driver);
	    Thread.sleep(1000);
	    act.moveToElement(getElement(level2)).perform();
	    Thread.sleep(1000);
	    act.moveToElement(getElement(level3)).perform();
	    Thread.sleep(1000);
	    getElement(level4).click();
	    Thread.sleep(5000);
	    String title = driver.getTitle();
	    System.out.println(title);
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
}
