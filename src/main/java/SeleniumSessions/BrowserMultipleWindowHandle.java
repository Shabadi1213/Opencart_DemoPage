package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BrowserMultipleWindowHandle {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/30-day-free-trial");
		driver.manage().window().maximize();
//		String parentWindowId = driver.getWindowHandle();
		
		
		
		WebElement executeProfile = driver.findElement(By.xpath("//footer//a[contains(text(),'Executive Profile')]"));
		WebElement pressRelease = driver.findElement(By.xpath("//footer//a[contains(text(),'Press')]"));
		WebElement testimonials = driver.findElement(By.xpath("//footer//a[contains(text(),'Testimonials')]"));
		WebElement ourPartners = driver.findElement(By.xpath("//footer//a[contains(text(),'Our Partners')]"));
		
		parentChildBrowserWindow(pressRelease);
		
//		Actions act = new Actions(driver);
//		act.click(executeProfile).perform();
//		Thread.sleep(2000);
//		Set<String> handles = driver.getWindowHandles();
//		Iterator<String> it = handles.iterator();
//		String parentWindowId = it.next();
//		driver.switchTo().window(parentWindowId);
//		Thread.sleep(1000);
//		System.out.println("Parent Window ID : " + driver.getTitle());
//		
//		String childWindoId = it.next();
//		driver.switchTo().window(childWindoId);
//		System.out.println("Child Window ID : " +driver.getTitle());
//		Thread.sleep(1200);
//		driver.close();
//		
//		driver.switchTo().window(parentWindowId);
//		System.out.println("Parent Window ID : " + driver.getTitle());
		

	}
	
	public static void parentChildBrowserWindow(WebElement value) throws InterruptedException {
		
		Actions act = new Actions(driver);
		act.click(value).perform();
		Thread.sleep(2000);
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		String parentWindowId = it.next();
		driver.switchTo().window(parentWindowId);
		Thread.sleep(1000);
		System.out.println("Parent Window ID : " + driver.getTitle());
		
		
		String childWindowId = it.next();
		driver.switchTo().window(childWindowId);
		System.out.println("Child Window ID : " +driver.getTitle());
		Thread.sleep(1200);
		driver.close();
		
		driver.switchTo().window(parentWindowId);
		System.out.println("Parent Window ID : " + driver.getTitle());
//		driver.quit();
		
	}
	}
	
	
