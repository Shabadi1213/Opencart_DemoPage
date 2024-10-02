package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitForAlert {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		 By alertClick = By.xpath("//button[@onclick='jsAlert()']");
//		 ElementUtil eleUtil = new ElementUtil(driver);
		 
		
		
//		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
////		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
////		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
////		String alertText = alert.getText();
////		System.out.println(alertText);
////		alert.accept();
		 
//		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
//								.pollingEvery(Duration.ofSeconds(2))
//								.ignoring(TimeoutException.class)
//								.ignoring(ElementClickInterceptedException.class)
//								.withMessage("ExectionOccured");
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
			wait.pollingEvery(Duration.ofSeconds(0))
		     .ignoring(NoSuchElementException.class)
		     .ignoring(TimeoutException.class)
		     .withMessage("=====NO Such Element Found===========");		
			
		wait.until(ExpectedConditions.visibilityOfElementLocated(alertClick));
								  
		
									
		driver.quit();
	

	}
	
	
	public static Alert waitForAlertAndSwitch(int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.alertIsPresent());
	}

	public static String getAlertText(int timeOut) {
		return waitForAlertAndSwitch(timeOut).getText();
	}

	public static void acceptAlert(int timeOut) {
		waitForAlertAndSwitch(timeOut).accept();
	}

	public static void dismisstAlert(int timeOut) {
		waitForAlertAndSwitch(timeOut).dismiss();
	}
   
	public static void enterValueOnAlert(String value,int timeOut) {
		waitForAlertAndSwitch(timeOut).sendKeys(value);
	}
	
   
   }
