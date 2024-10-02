package UITests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;

public class OrganeHRMTest extends BaseTest{
	
	
	@Test
	public void getPageTitle() {
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		Assert.assertEquals(actualTitle, "Human Resources Management Software | OrangeHRM");
	}
	
	
	@Test
	public void getPageURL() {
		String actualURL = driver.getCurrentUrl();
		System.out.println(actualURL);
		Assert.assertTrue(actualURL.contains("orangehrm"));
	}
	
	


}
