package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultipleBrowserWindowsHandle {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		Actions act = new Actions(driver);
		driver.get("https://www.orangehrm.com/en/30-day-free-trial");//Parent window
		driver.manage().window().maximize();
		String parentWindowId = driver.getWindowHandle();
		
		
		
		WebElement pressRelease = driver.findElement(By.xpath("//footer//a[contains(text(),'Press')]"));//Child window
		act.click(pressRelease).perform();
		
		WebElement executiveProfile = driver.findElement(By.xpath("//footer//a[contains(text(),'Executive')]"));//Child window
		act.click(executiveProfile).perform();
		
		WebElement testimonials = driver.findElement(By.xpath("//footer//a[contains(text(),'Testimonials')]"));//Child window
		act.click(testimonials).perform();
		
		WebElement ourPartners = driver.findElement(By.xpath("//footer//a[contains(text(),'Our Partners')]"));//Child window
		act.click(ourPartners).perform();
		
		Set<String> windowHandles = driver.getWindowHandles();
		Iterator<String> it = windowHandles.iterator();
		
		while(it.hasNext()) {
				String windowId = it.next();
				driver.switchTo().window(windowId);
				System.out.println(driver.getTitle());
				if(!windowId.equals(parentWindowId)) {
				driver.close();
				}
		}
		

		 driver.switchTo().window(parentWindowId);
		 System.out.println("Parent Window id:"+ driver.getTitle());
		 
	}

}

