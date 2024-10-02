package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class listGroupText {

	public static void main(String[] args) {
		
		BrowserUtil brUtil = new BrowserUtil();
		WebDriver driver = brUtil.initDriver("Chrome");
		brUtil.getUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		brUtil.maxWindow();
		
		ElementUtil eleUtil = new ElementUtil(driver);
		
		By groupList = By.xpath("//*[@class=\"list-group\"]/a");
		
		List<String> groupListText = eleUtil.getElementsText(groupList);
		for(String e:groupListText) {
			System.out.println(e);
		}

		
		
		brUtil.closeBrowser();
	}

}
