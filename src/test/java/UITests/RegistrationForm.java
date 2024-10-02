package UITests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;

public class RegistrationForm extends BaseTest{
	
	@DataProvider
	public Object [] [] registrationFormData() {
		return new Object [] [] {
			{"Program1","Selenium4.1","seleniumtest1259@gmail.com","55678759899","testsscript@20231","testsscript@2031"},
			{"Program2","Selenium4.2","seleniumtest1235@gmail.com","65678759809","testsscript@2022","testsscript@2022"},
			{"Program3","Selenium4.3","seleniumtest1236@gmail.com","75678759809","testsscript@2023","testsscript@2023"},
			{"Program4","Selenium4.4","seleniumtest1237@gmail.com","85678759809","testsscript@2025","testsscript@2025"},
			{"Program5","Selenium4.5","seleniumtest1238@gmail.com","95678759809","testsscript@2030","testsscript@2030"}
			
		};
	
	}
	
	@Test(dataProvider = "registrationFormData")
	public void fillRegistrationForm(String value1,String value2,String value3,String value4,String value5,String value6) {
		driver.findElement(By.xpath("//*[@class='list-group']/a[text()='Register']")).click();
		driver.findElement(By.id("input-firstname")).sendKeys(value1);
		driver.findElement(By.id("input-lastname")).sendKeys(value2);
		driver.findElement(By.id("input-email")).sendKeys(value3);
		driver.findElement(By.id("input-telephone")).sendKeys(value4);
		driver.findElement(By.id("input-password")).sendKeys(value5);
		driver.findElement(By.id("input-confirm")).sendKeys(value6);
//		driver.findElement(By.name("agree")).click();
//		driver.findElement(By.cssSelector("input.btn-primary")).click();
//		String eleText = driver.findElement(By.tagName("h1")).getText();
//		System.out.println(eleText);
//		Assert.assertEquals(eleText, "Your Account Has Been Created!");
		
		
		
	}
	


}
