package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class getElementsTestList {

	public static void main(String[] args) throws InterruptedException {

		BrowserUtil brUtil = new BrowserUtil();
		WebDriver driver = brUtil.initDriver("Chrome");
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		brUtil.maxWindow();
		
		
		ElementUtil eleUtil = new ElementUtil(driver);
		

		By emailAdress = By.id("input-email");
		By password = By.id("input-password");
		By loginBtn = By.xpath("//*[@type=\"submit\"]");
		By mainAddressBook = By.linkText("Address Book");
		By addressBookEntries = By.tagName("h2");
		By newAddress = By.linkText("New Address");
		By region = By.xpath("//*[@id=\"input-zone\"]");
		By regionDropList = By.xpath("//*[@id=\"input-zone\"]//option");
		By countyDropDownList = By.xpath("//*[@id='input-country']/option");
		By country = By.xpath("//*[@id='input-country']");

		eleUtil.doSendKeys(emailAdress, "tomcruse34@gmail.com");
		eleUtil.doSendKeys(password, "test@123");
		eleUtil.doClick(loginBtn);
		
		
		
		eleUtil.doClick(mainAddressBook);
		boolean flag1 =  eleUtil.isElementDisplayed(addressBookEntries);
		System.out.println("\'Address Book Entries\' element is displayed "+ flag1);
		
		eleUtil.doClick(newAddress);
		boolean flag2 =  eleUtil.isElementDisplayed(addressBookEntries);
		System.out.println(" \'Add Address\' element is displayed "+ flag2);
		
		eleUtil.doClick(country);
		List<String> eleTextList = eleUtil.getElementsText(countyDropDownList);
//		System.out.println(eleTextList);
		for(String e:eleTextList) {
			System.out.println(e);
			if(e.equals("Hong Kong")) {
				System.out.println("Clicked on Hong Kong");
				Thread.sleep(3000);
				break;
				
			}
			
		}
		
		brUtil.closeBrowser();
	}

}
