package UITests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTestBeforeMethod {

	public class LoginTest {
		
		WebDriver driver;
		
		
		@BeforeMethod
		public void Setup() {
			driver = new ChromeDriver();
			driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
			driver.manage().window().maximize();
		}

		@Test
		public void getPageTitle() {
			String actualTitle = driver.getTitle();
			System.out.println(actualTitle);
			Assert.assertEquals(actualTitle, "Account Login");
		}

		@Test
		public void getPageURL() {
			String actualURL = driver.getCurrentUrl();
			System.out.println(actualURL);
			Assert.assertTrue(actualURL.contains("route=account/login"));
		}

		@Test
		public void getText() {
			String eleText = driver.findElement(By.xpath("//*[@id='content']//*[text()='New Customer']")).getText();
			System.out.println(eleText);
			Assert.assertEquals(eleText, "New Customer");
		}

		@AfterMethod
		public void Teardown() {
			driver.quit();
		}

	}

	
	
	
	
	
}
