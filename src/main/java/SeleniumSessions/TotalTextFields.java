package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalTextFields {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		driver.manage().window().maximize();
		
		List<WebElement>  textField = driver.findElements(By.className("form-control"));
		System.out.println("Total text Field : "+textField.size());
		
		for(WebElement e : textField) {
			String placeHolderValue = e.getAttribute("placeholder");
			System.out.println(placeHolderValue);
		}
		
		driver.quit();
		
		

	}

}
