package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseTest {
	
protected WebDriver driver;
	
	
	@Parameters({"url","browser"})
	@BeforeTest
	public void Setup(String url,String browserName) {
		System.out.println("Browser Name is : " + browserName);
		switch (browserName.toLowerCase().trim()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		case "safari":
			driver = new SafariDriver();
			break;
		default:
			System.out.println("Please enter proper browers : " + browserName);
			throw new IllegalArgumentException("WRONG BROWSER : " + browserName);
			
		}
		driver.manage().window().maximize();	
		driver.get(url);
	}

	
	@AfterTest
	public void Teardown() {
		driver.quit();
	}

}
