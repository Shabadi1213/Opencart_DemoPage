package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleElements {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		driver.manage().window().maximize();
		
		List<WebElement> linkList = driver.findElements(By.tagName("a"));
		int len = linkList.size();
		System.out.println(len);
		
		int count =0;
		for(WebElement e:linkList) {
			String text1 = e.getText();
			if(text1.length()!=0) {
			System.out.println(count+ "="+text1);
			
		}count++;
			
		}
		
		
//		int count = 0;
//		for(int i=0;i<len;i++) {
//			String text = linkList.get(i).getText();
//			if(text.length()!=0) {
//			System.out.println(i + "="+ text);
//			count+=1;
//			}
//		}
//		System.out.println("The Total number of Textlink avaible are :"+ len);
//		System.out.println("The Totallinks which has text are " + count);
//		System.out.println("The Totallinks which has blank text are :" +(len-count));
		
		
		driver.quit();

	}

}

