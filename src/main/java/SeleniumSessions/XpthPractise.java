package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class XpthPractise {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
        driver = new ChromeDriver();
		driver.get
		("https://www.espncricinfo.com/series/west-indies-vs-south-africa-2024-1433361/west-indies-vs-south-africa-1st-test-1433365/full-scorecard");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		wkTakename("David Bedingham");
		getBatsmanScorecard("David Bedingham");
		getBowlerscoreCard("Jason Holder");
		
		
		
	    
	     
         
		
		
		
		
		driver.quit();
		
	}
	
	
	public static void selectCheckbox(String userName) {
		driver.findElement(By.xpath("//a[text()='"+userName+"']/ancestor::tr/td/input[@type='checkbox']")).click();
	}

	
	public static void getplayerDetails(String userName) {
		List<WebElement> eleList = driver.findElements(By.xpath("//a[text()='"+userName+"']/parent::td/following-sibling::td"));
		List<String> elestr = new ArrayList<String>();
	     for(WebElement e:eleList) {
	    	 String eleText = e.getText();
	    	 elestr.add(eleText);
	     }System.out.println(elestr);
		
	}

	public static void wkTakename(String userName) {
		String Text = driver.findElement(By.xpath("//span[text()='"+userName+"']/ancestor::td/following-sibling::td/span")).getText();
	    System.out.println("Wicket taker name :" + Text);
		
	}
	
	public static void getBatsmanScorecard(String userName) {
		List<WebElement> eleList=driver.findElements
				(By.xpath("//span[text()='"+userName+"']/ancestor::td/following-sibling::td/span/parent::td/following-sibling::td"));
		List<String> elestr = new ArrayList<String>();
		for(WebElement e:eleList) {
			String eleText = e.getText();
			elestr.add(eleText);
		}System.out.println("Batsman details : " + elestr);
	}
	
	
		public static void getBowlerscoreCard(String userName) {
			List<WebElement> eleList= driver.findElements(By.xpath("//span[text()='"+userName+"']/ancestor::td/following-sibling::td"));
			List<String> elestr = new ArrayList<String>();
			for(WebElement e: eleList) {
				String eleText = e.getText();
				elestr.add(eleText);
			}System.out.println("Bowler details :"+ elestr);
	
		
	}


}



