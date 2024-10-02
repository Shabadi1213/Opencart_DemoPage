package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementConcepts {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("input-email")).sendKeys("tejas82in@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("12345");
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			System.out.println("Element not loaded");
			e.printStackTrace();
		}
		driver.quit();

	}

}
