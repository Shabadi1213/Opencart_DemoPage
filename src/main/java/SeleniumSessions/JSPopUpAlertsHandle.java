package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSPopUpAlertsHandle {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		
		//Alert type alert
//		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
//		Alert alert = driver.switchTo().alert();
//		String alertText = alert.getText();
//		System.out.println(alertText);
//		
//		Thread.sleep(1500);
//        
//		alert.accept();
//		Thread.sleep(1000);
		
		
		//Confirmation alert
		
//		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
//		Alert alert = driver.switchTo().alert();
//		String alertText = alert.getText();
//		System.out.println(alertText);
//		Thread.sleep(1500);    
////		alert.accept();
////		Thread.sleep(1000);
////		alert.dismiss();
////		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Java with Selenium");
		Thread.sleep(2000);
		alert.accept();
		Thread.sleep(1000);
		
		
		driver.quit();
	}

}
