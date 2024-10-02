package SeleniumSessions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitConcept {
	
	static WebDriver driver;

	public static void main(String[] args) {
	
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		driver.manage().window().maximize();
		
		By emailId = By.id("input-email");
		By password = By.id("input-password");
		By submit = By.xpath("//input[@value='Login']");
		By login = By.cssSelector("aside#column-right a");
		
		getTitleContains("Register", 10);
		
				
		
      
	
         driver.quit();
		

	}

	
	public static WebElement waitForElementPresence(By loator,int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.presenceOfElementLocated(loator));
	}
	
	public static WebElement waitForElementVisible(By loator,int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(loator));
	}
	
	
	
	public static WebElement getElementWithWait(By locator ,int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		
	}
	
	
	public static boolean getUrl(String ExpectedUrl,int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		try {
        if(wait.until(ExpectedConditions.titleIs(ExpectedUrl))) {
        System.out.println(driver.getCurrentUrl());
		}}
		catch(TimeoutException e) {
			System.out.println("URL MisMatch found");
		}
		return false;
		
	}
		
	
	

    public static void getTitle(String expectedTitle,int timeOut) {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    	try {
    	if(wait.until(ExpectedConditions.titleIs(expectedTitle))) {
    		String title = driver.getTitle();
    		System.out.println(title);
    	}}catch(TimeoutException e) {
    		System.out.println("Mismatch in title");
    	}
    		
    	}
    	
    
    public static void getTitleContains(String fractionTitle,int timeOut) {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    	try {
    	if(wait.until(ExpectedConditions.titleContains(fractionTitle))) {
    		String title = driver.getTitle();
    		System.out.println(title);
    	}}catch(TimeoutException e) {
    		System.out.println("Mismatch in title");
    	}
    		
    	}
    	
    }
    
    
    
   
    

