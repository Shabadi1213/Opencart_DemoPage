package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class cssSelectorsConcepts {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/30-day-free-trial");
		driver.manage().window().maximize();
		
		getfooterLinkText("Learn More");
		
		
//		By footerList = By.cssSelector("footer a");
//		By oddOptionList = By.xpath("//select[@id='Form_getForm_Country']/option[position() mod 2=1]");
		
//		List<WebElement> elementsList = driver.findElements(oddOptionList);
//		System.out.println(elementsList.size());
//		List<String> strList = new ArrayList<String>();
//		for(WebElement e: elementsList) {
//			String eleText = e.getText();
////			strList.add(eleText);
////			if(eleText.contains("Terms & Conditions")) {
////			e.click();
////			break;
////		}
//		
//			System.out.println(eleText);
//		}
		
		Thread.sleep(3000);
		driver.quit();
	}
	
	
	
	public static void getfooterLinkText(String name) {
		List<WebElement>eleList = getElements(By.xpath("//h5[text()='"+name+"']/following-sibling::ul//a"));
		for(WebElement e:eleList) {
			String eleText = e.getText();
			System.out.println(eleText);
		}
		
	}

	
	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	 
}

