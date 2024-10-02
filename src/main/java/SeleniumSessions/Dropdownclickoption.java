package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdownclickoption {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		driver.manage().window().maximize();
		
		By emailAdress = By.id("input-email");
		By password = By.id("input-password");
		By loginBtn = By.xpath("//*[@type=\"submit\"]");
		By mainAddressBook = By.linkText("Address Book");
		By newAddress = By.linkText("New Address");
		By country = By.xpath("//*[@id='input-country']");
		By countyDropDownList = By.xpath("//*[@id='input-country']/option");
		
		driver.findElement(emailAdress).sendKeys("tomcruse34@gmail.com");
		driver.findElement(password).sendKeys("test@123");
		driver.findElement(loginBtn).click();
		driver.findElement(mainAddressBook).click();
		driver.findElement(newAddress).click();
		driver.findElement(country).click();
		
		
		List<WebElement> eleList = driver.findElements(countyDropDownList);
		for(WebElement e: eleList) {
			String eleText = e.getText();
			System.out.println(eleText);
			if(eleText.equals("India")) {
				e.click();
				Thread.sleep(3000);
				break;
			}
		}
		
       
		
		
		
		driver.quit();
		
		
	}
	
	

}

