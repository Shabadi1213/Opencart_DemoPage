package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownHandling {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/30-day-free-trial");
		driver.manage().window().maximize();
		
		
		By countryId = By.id("Form_getForm_Country");
		
//		WebElement country = driver.findElement(countryId);
//		
//		Select select = new Select(country);
//		select.selectByVisibleText("India");
//		select.selectByValue("Hong Kong");
//		select.selectByIndex(34);
		
//		SelectByText(countryId, "Iceland");
//		SelectByValue(countryId, "India");
//		SelectByIndex(countryId, 34);
		
		
		
//		Select select = new Select(driver.findElement(countryId));
//		List<WebElement> eleOptions = select.getOptions();
//		System.out.println(eleOptions.size());
//		List<String> strList = new ArrayList<String>();
//		for(WebElement e: eleOptions) {
//			String eleText = e.getText();
//			strList.add(eleText);
////			if(eleText.contains("India")) {
////				e.click();
////				break;
////			}
//		}System.out.println(strList);
		
     driver.quit();
	}
//	public static void SelectByText(By locator,String visibleText) {
//		Select select =  new Select(getElement(locator));
//		select.selectByVisibleText(visibleText);
//	}
//	
//	
//	public static void SelectByValue(By locator,String value) {
//		Select select = new Select(getElement(locator));
//		select.selectByValue(value);
//	}
//	
//	public static void SelectByIndex(By locator,int index) {
//		Select select = new Select(getElement(locator));
//		select.selectByIndex(index);
//	}
//
//	public static WebElement getElement(By locator) {
//		return driver.findElement(locator);
//	}
	
	
	  
	
}
