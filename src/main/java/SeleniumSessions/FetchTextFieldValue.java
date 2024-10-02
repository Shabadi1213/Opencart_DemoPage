package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchTextFieldValue {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		By searchField = By.name("q");
		By eleList = By.xpath("//ul/li//div[@class = 'wM6W7d']/span");
		
		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.doSearch(searchField, eleList, "Naveen Automation Labs", "training");
		driver.quit();

	}

}
