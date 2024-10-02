package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class AddressBookTest {

	public static void main(String[] args) throws InterruptedException {
		
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
		By countyDropDownList = By.xpath("//*[@id='input-country']/option");
		
		
		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.doSendKeys(emailAdress, "tomcruse34@gmail.com");
		eleUtil.doSendKeys(password, "test@123");
		eleUtil.doClick(loginBtn);

		eleUtil.doClick(mainAddressBook);
		boolean flag1 =  eleUtil.isElementDisplayed(addressBookEntries);
		System.out.println("\'Address Book Entries\' element is displayed "+ flag1);
		
		eleUtil.doClick(newAddress);
		boolean flag2 =  eleUtil.isElementDisplayed(addressBookEntries);
		System.out.println(" \'Add Address\' element is displayed "+ flag2);
		
		
		eleUtil.doSendKeys(inputFirstName, "SRK");
		eleUtil.doSendKeys(inputLastName, "Shabadi");
		eleUtil.doSendKeys(company, "Amazon software India Pvt Ltd,.");
		eleUtil.doSendKeys(address1,"#22 flat no 22");
		eleUtil.doSendKeys(address2, "JHnagar");
		eleUtil.doSendKeys(cityName, "Blore");
        eleUtil.doSendKeys(postalCode, "12345");
        List<WebElement> eleList = eleUtil.getElements(countyDropDownList);
        eleUtil.selectdropdownOptionvalue(eleList, "India");
        eleUtil.doClick(region);
        Thread.sleep(2000);
        List<WebElement> eleList1 = eleUtil.getElements(regionDropeList);
        eleUtil.selectdropdownOptionvalue(eleList1, "Karnataka");
        Thread.sleep(1000);	
        eleUtil.doClick(submitForm);
        Thread.sleep(2000);
        boolean flag = eleUtil.isElementDisplayed(addrsAddSuccessAlert);
        System.out.println(" \'Your address has been successfully added is displayed\' " + flag);
        
          
        brUtil.closeBrowser();
	}

}
