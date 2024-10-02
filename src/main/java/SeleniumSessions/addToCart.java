package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class addToCart {

	public static void main(String[] args) throws InterruptedException {
		
		
		BrowserUtil brUtil = new BrowserUtil();
		WebDriver driver = brUtil.initDriver("Chrome");
		ElementUtil eleUtil = new ElementUtil(driver);
		brUtil.getUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		brUtil.maxWindow();
		
		
		By emailAdress = By.id("input-email");
		By password = By.id("input-password");
		By loginBtn = By.xpath("//*[@type=\"submit\"]");
		By desktop = By.linkText("Desktops");
		By alldesktop = By.linkText("Show All Desktops");
		By alldesktopList = By.xpath("//*[@id='column-left']//*[@class='list-group']//a");
		By imagesList = By.xpath("//*[@id='content']//img");
		By imagesText = By.xpath("//*[@class='caption']");
		
		eleUtil.doSendKeys(emailAdress, "tomcruse34@gmail.com");
		eleUtil.doSendKeys(password, "test@123");
		eleUtil.doClick(loginBtn);
		Thread.sleep(1500);
		
		eleUtil.doClick(desktop);
		eleUtil.doClick(alldesktop);
		List<WebElement> eleList = eleUtil.getElements(alldesktopList);
		eleUtil.selectdropdownOptionvalue(eleList, "Desktops (13)");
		
		List<WebElement> eleList1 = eleUtil.getElements(imagesList);
		int count = 1;
		for(WebElement e:eleList1) {
			String eleText1 = e.getText();
			String AttValue = e.getAttribute("src");
			System.out.println(count + "=" + AttValue);
			count++;
		}
		
		
		
		List<WebElement> productList = eleUtil.getElements(imagesText);
		eleUtil.selectdropdownOptionvalue(productList, "Apple Cinema 30\"");
		
		Thread.sleep(3000);
		brUtil.closeBrowser();
		

	}

}
