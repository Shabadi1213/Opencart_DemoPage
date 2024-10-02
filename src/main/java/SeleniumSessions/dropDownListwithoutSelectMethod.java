package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class dropDownListwithoutSelectMethod {

	public static void main(String[] args) {
		
		BrowserUtil brUtil = new BrowserUtil();
		WebDriver driver = brUtil.initDriver("Chrome");
		ElementUtil eleUtil = new ElementUtil(driver);
		brUtil.getUrl("https://www.orangehrm.com/en/30-day-free-trial");
		brUtil.maxWindow();
		
		
		By countryId = By.xpath("//*[@id='Form_getForm_Country']/option");
		
		List<WebElement> countryList = eleUtil.getElements(countryId);
		System.out.println(countryList.size());
		for(WebElement e: countryList) {
			String countryText = e.getText();
			System.out.println(countryText);
			if(countryText.equals("India")) {
				e.click();
				break;
			}
		}
		

		brUtil.closeBrowser();
	}

}
