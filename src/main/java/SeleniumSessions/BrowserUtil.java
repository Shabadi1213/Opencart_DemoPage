package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserUtil {
	
	WebDriver driver;
	
	
	/**
	 * This method is used to initialze the browser on the given Browser name
	 * @param browserName
	 * @return This will return the driver
	 */
	public WebDriver initDriver(String browserName) {
		System.out.println("Browser Name :" + browserName);

		switch (browserName.trim().toLowerCase()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
		default:
			System.out.println("Please enter valid browser name :" + browserName);
			throw new BrowserException("====INVALID BROWSR NAME====");
		}

		return driver;
	}

	/**
	 * Launch Url
	 * 
	 * @param Url
	 * @return
	 */
	public void getUrl(String Url) {
		if (Url.indexOf("http") != 0) {
			throw new BrowserException("===Invalid URL===");
		}
		driver.get(Url);

	}

	/**
	 * This Method will get the Current url
	 * 
	 * @return current url
	 */
	public String getPageUrl() {
		return driver.getCurrentUrl();
	}

	/**
	 * Quiting the browser
	 */
	public void closeBrowser() {
		driver.quit();
	}

	/**
	 * This Methods get the title
	 * 
	 * @return
	 */
	public String getPageTitle() {
		return driver.getTitle();
	}
	
	public void maxWindow() {
		driver.manage().window().maximize();
	}

}
