package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class deleteAddresslist {

	public static void main(String[] args) throws InterruptedException {
		
		
BrowserUtil brUtil = new BrowserUtil();
		
		WebDriver driver = brUtil.initDriver("Chrome");
		brUtil.getUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		brUtil.maxWindow();
		
		By emailAdress = By.id("input-email");
		By password = By.id("input-password");
		By loginBtn = By.xpath("//*[@type=\"submit\"]");
		By mainAddressBook = By.linkText("Address Book");
		By addressBookEntries = By.tagName("h2");
		By addressList = By.xpath("//*[@id='content']//td");
		By delete = By.xpath("//*[@class='btn btn-danger']");
		
		ElementUtil eleUtil = new ElementUtil(driver);
        
		
		eleUtil.doSendKeys(emailAdress, "tomcruse34@gmail.com");
		eleUtil.doSendKeys(password, "test@123");
		eleUtil.doClick(loginBtn);
		Thread.sleep(1500);
		
		eleUtil.doClick(mainAddressBook);
		boolean flag1 =  eleUtil.isElementDisplayed(addressBookEntries);
		System.out.println("\'Address Book Entries\' element is displayed "+ flag1);
		
		
		List<WebElement> webEleList = eleUtil.getElements(delete);
		int eleCount = webEleList.size();
		System.out.println(eleCount);
		
		int count = 1;
		for(WebElement e:webEleList) {
			String eleText = e.getText();
			System.out.println(eleText);
			if(eleText.contains("Delete")) {
				e.click();
				System.out.println("Clicked");
				if(eleCount>1)
				count++;
				
			}
			
		}
		
			
			
	
		Thread.sleep(3000);
		
		brUtil.closeBrowser();
		
	}

}
