package UITests;

import org.testng.Assert;

import org.testng.annotations.Test;

import base.BaseTest;

public class GoogleTest extends BaseTest{
		
		
		
		@Test
		public void getPageTitle() {
			String actualTitle = driver.getTitle();
			System.out.println(actualTitle);
			Assert.assertEquals(actualTitle, "Google");
		}
		
		
		@Test
		public void getPageURL() {
			String actualURL = driver.getCurrentUrl();
			System.out.println(actualURL);
			Assert.assertTrue(actualURL.contains("google"));
		}
		
		
		}



