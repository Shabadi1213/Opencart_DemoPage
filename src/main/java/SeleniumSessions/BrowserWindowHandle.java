package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BrowserWindowHandle {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/30-day-free-trial");//Parent window
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		WebElement pressRelease = driver.findElement(By.xpath("//footer//a[contains(text(),'Press')]"));//Child window
		act.click(pressRelease).perform();
		
		
		//Get ID's for parent and child windows
		
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		
		String parentWindowId = it.next();
		System.out.println("Parent window id : "+ parentWindowId);
		
		
		String childWindowId = it.next();
		System.out.println("Child window id : "+ childWindowId);
		
		
     //Switching the Windows
		driver.switchTo().window(childWindowId);
		String childTitle = driver.getTitle();
		System.out.println(childTitle);
		Thread.sleep(2000);
		driver.close();
		
		
		driver.switchTo().window(parentWindowId);
		String parenTitle = driver.getTitle();
		System.out.println(parenTitle);
		Thread.sleep(2000);
		driver.quit();
		

		
	}

}
