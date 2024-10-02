package myTests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

	public class TestNGFeatures {
		
		@BeforeSuite
		public void connectwithDb() {
			System.out.println("BS-connect with DB");
		}
		
		@BeforeTest
		public void createUser() {
			System.out.println("BT-Create user");
		}
		
		@BeforeClass
		public void openBrowser() {
			System.out.println("BC-openBrowser");
		}
		
		@BeforeMethod
		public void loginToApp() {
			System.out.println("BM-login to App");
		}
		
		
		@Test
		public void searchTest() {
			System.out.println("Search test");
		}
	     
		
		@Test
		public void cartTest() {
			System.out.println("Cart test");
		}
		
		@Test
		public void paymentTest() {
			System.out.println("Payment test");
		}
		
		@AfterMethod
		public void logout() {
			System.out.println("AM-Logout");
		}
	     
		
		@AfterClass
		public void closeBrowser() {
			System.out.println("AC-Close Browser");
		}
		
		@AfterTest
		public void deleteUser() {
			System.out.println("AT-Delete user");
		}
		
		@AfterSuite
		public void disconnectDB() {
			System.out.println("AS-Disconnect to DB");
		}


}
