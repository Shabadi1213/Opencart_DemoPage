package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		
		//Open Chrome Browser
		
		ChromeDriver driver = new ChromeDriver();
		
//		FirefoxDriver driver = new FirefoxDriver();
//		EdgeDriver driver = new EdgeDriver();
		
//		WebDriver driver = new ChromeDriver();
	
//		String ps = driver.getPageSource();
//		System.out.println(ps);
		
		
		
		//Enter URL
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		String curURL = driver.getCurrentUrl();
		System.out.println(curURL);
		
		
		
		//Get Title
		String title = driver.getTitle();
		
		
		//Validate the title
		
		if(title.equals("Google")) {
			System.out.println("Correct title : TEST PASS ");
		}
		else {
			System.out.println("Incorrect title : TEST FAIL");
		}
		
		
		//Close Browser
		driver.quit();
		
		
		

	}

}
