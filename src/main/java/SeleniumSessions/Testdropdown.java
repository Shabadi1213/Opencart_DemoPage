package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Testdropdown {
	

	public static void main(String[] args) {

		BrowserUtil brUtil = new BrowserUtil();
		WebDriver driver = brUtil.initDriver("Chrome");
		brUtil.getUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		brUtil.maxWindow();
        
		
		By emailAdress = By.id("input-email");
		By password = By.id("input-password");
		By loginBtn = By.xpath("//*[@type=\"submit\"]");
		By mainAddressBook = By.linkText("Address Book");
		By newAddress = By.linkText("New Address");
		By addressBookEntries = By.tagName("h2");
		By inputFirstName = By.id("input-firstname");
		By inputLastName = By.id("input-lastname");
		By company = By.id("input-company");
		By address1 = By.id("input-address-1");
		By address2 = By.id("input-address-2");
		By cityName = By.id("input-city");
		By postalCode = By.id("input-postcode");
		By defAdress = By.name("default");
		By submitForm = By.xpath("//*[@type = \"submit\"]");
		By addrsAddSuccessAlert = By.xpath("//*[@id = \"account-address\"]//*[text() = \" Your address has been successfully added\"]");
		By region = By.xpath("//*[@id=\"input-zone\"]");
		By regionDropeList = By.xpath("//*[@id=\"input-zone\"]//option");
		
		
		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.doSendKeys(emailAdress, "tomcruse34@gmail.com");
		eleUtil.doSendKeys(password, "test@123");
		eleUtil.doClick(loginBtn);
		
		
		eleUtil.doSendKeys(inputFirstName, "SRK");
		eleUtil.doSendKeys(inputLastName, "Shabadi");
		eleUtil.doSendKeys(company, "Amazon software India Pvt Ltd,.");
		eleUtil.doSendKeys(address1,"#22 flat no 22");
		eleUtil.doSendKeys(address2, "JHnagar");
		eleUtil.doSendKeys(cityName, "Blore");
        eleUtil.doSendKeys(postalCode, "12345");
        eleUtil.doClick(region);
        
        
		
		
		
		
	}

}
