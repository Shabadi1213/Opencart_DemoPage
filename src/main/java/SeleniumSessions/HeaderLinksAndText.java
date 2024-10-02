package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HeaderLinksAndText {

	public static void main(String[] args) {
		
		BrowserUtil brUtil = new BrowserUtil();
		WebDriver driver = brUtil.initDriver("Chrome");
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		brUtil.maxWindow();
		
		ElementUtil elUtil = new ElementUtil(driver);
		
		By information = By.xpath("//*[@class = \"container\"]//*[text()=\"Information\"]/following-sibling::ul/li");
		By customerService = By.xpath("//*[@class = \"container\"]//*[text()=\"Customer Service\"]/following-sibling::ul/li");
		By extras = By.xpath("//*[@class = \"container\"]//*[text()=\"Extras\"]/following-sibling::ul/li");
		By myAccount = By.xpath("//*[@class = \"container\"]//*[text()=\"My Account\"]/following-sibling::ul/li");
		
		List<String> informationlist = elUtil.getElementsText(information);
		int count = 1;
		for(String e:informationlist) {
			System.out.println(count+ " = " + e);
			count++;
			if(e.contains("Delivery Information")){
				System.out.println("Present");
				break;
	
			}
		}
		
		List<String> customerServiceList = elUtil.getElementsText(customerService);
		System.out.println(customerServiceList);
		
		
		List<String> extrasList = elUtil.getElementsText(extras);
		System.out.println(extrasList);
		
		List<String> myAccountList = elUtil.getElementsText(myAccount);
		System.out.println(myAccountList);
		
		
		
		
		
		brUtil.closeBrowser();
		
		
		
		

	}

}
