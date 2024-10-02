package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPageTest {

	public static void main(String[] args) throws InterruptedException {
		
		BrowserUtil brUtil = new BrowserUtil();
		By logoImage = By.className("img-responsive");
		
		WebDriver driver = brUtil.initDriver("Chrome");
		ElementUtil eleUtil = new ElementUtil(driver);
		brUtil.getUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		brUtil.maxWindow();
		String title = brUtil.getPageTitle();
		System.out.println(title);
		boolean flag = eleUtil.isElementDisplayed(logoImage);
		System.out.println("Element is displayed "+ flag);
		
		
		
		
		By emailAdress = By.id("input-email");
		By password = By.id("input-password");
		By loginBtn = By.xpath("//*[@type=\"submit\"]");
		By editAccount = By.linkText("Edit your account information");
		By firstName = By.id("input-firstname");
		By lastName = By.id("input-lastname");
		By updateEmail = By.id("input-email");
		By updateTelNum = By.id("input-telephone");
		By submitForm = By.xpath("//*[@type=\"submit\"]");
		By accUpdateSuccess = By.xpath("//*[@id=\"account-account\"]//*[text()=\" Success: Your account has been successfully updated.\"]");
		
		
		eleUtil.doSendKeys(emailAdress, "tomcruse34@gmail.com");
		eleUtil.doSendKeys(password, "test@123");
		eleUtil.doClick(loginBtn);
		Thread.sleep(1500);
		
		eleUtil.doClick(editAccount);
		eleUtil.doClearAndUpdate(firstName, "Tom1");
		eleUtil.doClearAndUpdate(lastName, "Sena1");
		eleUtil.doClearAndUpdate(updateEmail, "tomcruse34@gmail.com");
		eleUtil.doClearAndUpdate(updateTelNum, "09876543321");
		eleUtil.doClick(submitForm);
		
		
		Thread.sleep(2000);
		
		String text = eleUtil.getText(accUpdateSuccess);
		System.out.println(text);
	

		brUtil.closeBrowser();

	}

}
