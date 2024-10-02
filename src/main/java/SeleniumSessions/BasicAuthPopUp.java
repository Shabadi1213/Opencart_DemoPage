package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicAuthPopUp {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		String username = "admin";
		String password = "admin";
		
		driver = new ChromeDriver();
		driver.get("https://"+username+":"+password + "@"+"the-internet.herokuapp.com/basic_auth");
		Thread.sleep(1000);
		
		driver.quit();

	}

}
