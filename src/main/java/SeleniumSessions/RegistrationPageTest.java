package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPageTest {
	

	public static void main(String[] args) {
		
		
		
		BrowserUtil brUtil = new BrowserUtil();
		WebDriver driver = brUtil.initDriver("chrome");
		brUtil.getUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		brUtil.getPageTitle();
		brUtil.maxWindow();
		
		 By telePhone = By.id("input-telephone");
		 By registerForm = By.linkText("Register");
		 By firstName =By.id("input-firstname");
		 By lastName = By.id("input-lastname");
		 By emailId = By.id("input-email");
		 By password = By.id("input-password");
		 By confPwd = By.id("input-confirm");
		 By policyAgree = By.name("agree");
		 By submitForm = By.xpath("//*[@type=\"submit\"]");
		 
		
		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.doClick(registerForm);
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			System.out.println("Element Interruptred");
			e.printStackTrace();
		}
		eleUtil.doSendKeys(firstName, "Tom");
		eleUtil.doSendKeys(lastName, "cruse");
		eleUtil.doSendKeys(emailId, "tomcruse22@gmail.com");
		eleUtil.doSendKeys(telePhone, "1234567890");
		eleUtil.doSendKeys(password, "test@123");
		eleUtil.doSendKeys(confPwd, "test@123");
		eleUtil.doClick(policyAgree);
		boolean flag= eleUtil.isElementEnabled(policyAgree);
		System.out.println("Policy Aggrement is enabled "+ flag);
		
		
		eleUtil.doClick(submitForm);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println("Element Interruptred");
			e.printStackTrace();	
		}
		String title = brUtil.getPageTitle();
		System.out.println(title);
		

		
		
		brUtil.closeBrowser();
		
		
		
		
		

	}

}
