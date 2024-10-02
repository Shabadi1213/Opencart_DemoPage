package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import javax.naming.CommunicationException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class organgehrmLoginpageTest {

	public static void main(String[] args) throws InterruptedException {
		
		BrowserUtil brUtil = new BrowserUtil();
		WebDriver driver = brUtil.initDriver("Chrome");
		brUtil.getUrl("https://www.orangehrm.com/en/30-day-free-trial");
		brUtil.maxWindow();
		Thread.sleep(3000);
		
		
		ElementUtil eleUtil = new ElementUtil(driver);
		
		By logoImage = By.tagName("img");
		By tabs = By.xpath("//*[@id='navbarSupportedContent']/ul/li/a");
		By mainText = By.xpath("//*[@class = 'free-trial-page-slider-content']");
		By userName = By.xpath("//*[@id='Form_getForm_subdomain']");
		By fullName = By.xpath("//*[@id='Form_getForm_Name']");
		By bussinessEmail = By.xpath("//*[@id='Form_getForm_Email']");
		By phoneNumber = By.xpath("//*[@id='Form_getForm_Contact']");
		By country = By.id("Form_getForm_Country");
		By recaptcha = By.xpath("//*[@id='recaptcha-anchor']");
		By getFormSubmitForm = By.xpath("//*[@id='Form_getForm_action_submitForm']");
		By headerText = By.xpath("//*[@class='container']//h5");
		By footertext = By.xpath("//*[@class='container']//ul/li");
		By footerimgs = By.xpath("//*[@class='container footer-bottom-container']//img");
		
		boolean flag = eleUtil.isElementDisplayed(logoImage);
		System.out.println(flag);
		
		List<String> text = eleUtil.getElementsText(mainText);
//		System.out.println(text);
		for(String e:text) {
			System.out.println(e);
			if(e.contains("performance evaluation")) {
				System.out.println("Searching string present");
			}
			else {
//					throw new CommonExecption("=====No String found Exception===========");
				System.out.println("No String found");
				}
			}
		
		
		
		List<WebElement> eles = eleUtil.getElements(logoImage);
		System.out.println("Total number of images : " + eles.size());
		for(WebElement we:eles) {
			String weText = we.getText();
			String weAttr=  we.getAttribute("src");
			System.out.println(weText + ":" + weAttr);
		}
		
		List<String> hText = eleUtil.getElementsText(headerText);
		int count = 1;
		for(String e:hText) {
			System.out.println(count + " = " + e);
			count++;
		}
		
		System.out.println("=====================footer===========");
		
		List<String> eleList = eleUtil.getElementsText(footertext);
		int count2 = 1;
		for(String e:eleList) {
			System.out.println(count2 + " = " + e);
			count2++;
		}
		
		
		List<WebElement> eleList1 = eleUtil.getElements(footerimgs);
		System.out.println(eleList1.size());
		for(WebElement e: eleList1) {
			String eletext = e.getText();
			String eleAttrVal = e.getAttribute("src");
			System.out.println(eletext + "=" + eleAttrVal);
			
		}
		
		
		
		
		
//		eleUtil.doSendKeys(userName, "Rshabadi");
//		eleUtil.doSendKeys(fullName, "Ravikumar");
//		eleUtil.doSendKeys(bussinessEmail, "test123@gmail.com");
//		eleUtil.doSendKeys(phoneNumber, "1234567890");
//		eleUtil.SelectByText(country, "India");
//		Thread.sleep(3000);
//		eleUtil.doClick(recaptcha);
//		eleUtil.doClick(getFormSubmitForm);
		
		
		brUtil.closeBrowser();
	}

}
