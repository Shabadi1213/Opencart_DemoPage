package SeleniumSessions;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class selectOptionsMethod {

	public static void main(String[] args) {
		
		BrowserUtil brUtil = new BrowserUtil();
		WebDriver driver = brUtil.initDriver("Chrome");
		brUtil.getUrl("https://www.orangehrm.com/en/30-day-free-trial");
		brUtil.maxWindow();
		
//		By emailAdress = By.id("input-email");
//		By password = By.id("input-password");
//		By loginBtn = By.xpath("//*[@type=\"submit\"]");
//		By mainAddressBook = By.linkText("Address Book");
//		By newAddress = By.linkText("New Address");
//		By addressBookEntries = By.tagName("h2");
//		By inputFirstName = By.id("input-firstname");
//		By inputLastName = By.id("input-lastname");
//		By company = By.id("input-company");
//		By address1 = By.id("input-address-1");
//		By address2 = By.id("input-address-2");
//		By cityName = By.id("input-city");
//		By postalCode = By.id("input-postcode");
//		By defAdress = By.name("default");
//		By submitForm = By.xpath("//*[@type = \"submit\"]");
//		By addrsAddSuccessAlert = By.xpath("//*[@id = \"account-address\"]//*[text() = \" Your address has been successfully added\"]");
//		By region = By.xpath("//*[@id=\"input-zone\"]");
//		By regionDropeList = By.xpath("//*[@id=\"input-zone\"]//option");
//		By countyDropDownList = By.xpath("//*[@id='input-country']/option");
		
		By countryId = By.id("Form_getForm_Country");
		
		
		ElementUtil eleUtil = new ElementUtil(driver);
//		eleUtil.doSendKeys(emailAdress, "tomcruse34@gmail.com");
//		eleUtil.doSendKeys(password, "test@123");
//		eleUtil.doClick(loginBtn);
//		
//		eleUtil.doClick(mainAddressBook);
//		boolean flag1 =  eleUtil.isElementDisplayed(addressBookEntries);
//		System.out.println("\'Address Book Entries\' element is displayed "+ flag1);
//		
//		eleUtil.doClick(newAddress);
//		boolean flag2 =  eleUtil.isElementDisplayed(addressBookEntries);
//		System.out.println(" \'Add Address\' element is displayed "+ flag2);
		
		if(eleUtil.getDropDownSelectOptionTextList(countryId).contains("India")) {
			System.out.println("Pass");
		}
			
		
		//Mulitple countries
		
		List<String> expectedList = Arrays.asList("India","Brazil","Austria");
		if(eleUtil.getDropDownSelectOptionTextList(countryId).containsAll(expectedList)){
			System.out.println("Pass");
		}
		
		

	}

}
