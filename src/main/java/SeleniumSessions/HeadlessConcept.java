package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class HeadlessConcept {

	public static void main(String[] args) {
		
		
		
		ChromeOptions co = new ChromeOptions();
//		co.addArguments("--headless");
		co.addArguments("--incognito");
		
//		
//		FirefoxOptions fo = new FirefoxOptions();
////		fo.addArguments("--headless");
		
//		
//		
		EdgeOptions eo = new EdgeOptions();
//		eo.addArguments("--headless");
		eo.addArguments("Inprivate");
		
//		WebDriver driver = new ChromeDriver(co);
		
//		WebDriver driver = new FirefoxDriver(fo);
		
		WebDriver driver = new EdgeDriver(eo);
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		String title = driver.getTitle();
		System.out.println("Chrome browser :" +title);
		
		
		
		
		
		driver.quit();

	}

}
