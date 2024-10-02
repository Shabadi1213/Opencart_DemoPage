package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class actionsWithTab2 {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		By searchField = By.name("q");
		WebElement searchentry = driver.findElement(searchField);
		
		Actions act = new Actions(driver);
		Action action = act.sendKeys(Keys.TAB)
		.pause(500)
		.sendKeys(Keys.TAB)
		.pause(500)
		.sendKeys(Keys.TAB)
		.pause(500)
		.sendKeys(Keys.ENTER)
		.pause(500)
		.sendKeys(searchentry, "Books")
		.pause(500)
		.sendKeys(Keys.ENTER)
		.build();
		
		
		String title = driver.getTitle();
		System.out.println(title);
		
		 action.perform();
		
		
        driver.quit();
        
       
       
		
	}


}
