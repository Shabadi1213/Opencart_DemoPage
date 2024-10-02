package UITests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;

public class LoginTest extends BaseTest{
	

	@Test
	public void getPageTitle() {
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		Assert.assertEquals(actualTitle, "Account Login");
	}
	
	
	@Test
	public void getPageURL() {
		String actualURL = driver.getCurrentUrl();
		System.out.println(actualURL);
		Assert.assertTrue(actualURL.contains("route=account/login"));
	}
	
	
	@Test
	public void getText() {
		String eleText = driver.findElement(By.xpath("//*[@id='content']//*[text()='New Customer']")).getText();
		System.out.println(eleText);
		Assert.assertEquals(eleText, "New Customer");
	}
	
	

}
